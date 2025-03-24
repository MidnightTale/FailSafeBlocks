# PowerShell script to generate resource files for FailSafeBlocks mod
# This script generates:
# 1. Block models (models/block/placeholder_block_X.json)
# 2. Item models (models/item/placeholder_block_X.json)
# 3. Blockstate definitions (blockstates/placeholder_block_X.json)
# 4. Language entries (lang/en_us.json)

# Base directory for resources
$resourceDir = "src/main/resources/assets/failsafeblocks"

# Create necessary directories if they don't exist
$directories = @(
    "$resourceDir/models/block", 
    "$resourceDir/models/item", 
    "$resourceDir/blockstates",
    "$resourceDir/lang"
)

foreach ($dir in $directories) {
    if (-not (Test-Path $dir)) {
        New-Item -ItemType Directory -Path $dir -Force | Out-Null
        Write-Host "Created directory: $dir"
    }
}

# Generate block models
function Generate-BlockModel {
    param(
        [string]$blockName
    )
    
    $modelContent = @{
        parent = "minecraft:block/cube_all"
        textures = @{
            all = "failsafeblocks:block/$blockName"
        }
    } | ConvertTo-Json -Depth 3
    
    $modelPath = "$resourceDir/models/block/$blockName.json"
    $modelContent | Out-File -FilePath $modelPath -Encoding utf8
    Write-Host "Generated block model: $modelPath"
}

# Generate item models
function Generate-ItemModel {
    param(
        [string]$blockName
    )
    
    $modelContent = @{
        parent = "failsafeblocks:block/$blockName"
    } | ConvertTo-Json -Depth 3
    
    $modelPath = "$resourceDir/models/item/$blockName.json"
    $modelContent | Out-File -FilePath $modelPath -Encoding utf8
    Write-Host "Generated item model: $modelPath"
}

# Generate blockstates
function Generate-Blockstate {
    param(
        [string]$blockName
    )
    
    $blockstateContent = @{
        variants = @{
            "" = @{
                model = "failsafeblocks:block/$blockName"
            }
        }
    } | ConvertTo-Json -Depth 4
    
    $blockstatePath = "$resourceDir/blockstates/$blockName.json"
    $blockstateContent | Out-File -FilePath $blockstatePath -Encoding utf8
    Write-Host "Generated blockstate: $blockstatePath"
}

# Generate language file entries
function Generate-LanguageEntries {
    $langEntries = @{}
    
    # Add base block
    $langEntries["block.failsafeblocks.placeholder_block"] = "Missing Block (Placeholder)"
    
    # Add numbered blocks 1-127
    for ($i = 1; $i -le 127; $i++) {
        $langEntries["block.failsafeblocks.placeholder_block_$i"] = "Missing Block (Placeholder $i)"
    }
    
    # Add creative tab
    $langEntries["itemGroup.failsafeblocks.placeholder_tab"] = "FailSafe Blocks"
    
    $langContent = $langEntries | ConvertTo-Json
    $langPath = "$resourceDir/lang/en_us.json"
    $langContent | Out-File -FilePath $langPath -Encoding utf8
    Write-Host "Generated language file: $langPath"
}

# Main execution
# Generate base placeholder block resources
Generate-BlockModel -blockName "placeholder_block"
Generate-ItemModel -blockName "placeholder_block"
Generate-Blockstate -blockName "placeholder_block"

# Generate resources for placeholder blocks 1-127
for ($i = 1; $i -le 127; $i++) {
    $blockName = "placeholder_block_$i"
    Generate-BlockModel -blockName $blockName
    Generate-ItemModel -blockName $blockName
    Generate-Blockstate -blockName $blockName
}

# Generate language file
Generate-LanguageEntries

Write-Host "Resource generation complete!" 