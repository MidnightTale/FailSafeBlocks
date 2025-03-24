Add-Type -AssemblyName System.Drawing

# Define colors for each placeholder block (128 total)
$colors = @(
    [System.Drawing.Color]::Magenta,  # placeholder_block
    [System.Drawing.Color]::Red,      # placeholder_block_1
    [System.Drawing.Color]::Orange,   # placeholder_block_2
    [System.Drawing.Color]::Yellow,   # placeholder_block_3
    [System.Drawing.Color]::Green,    # placeholder_block_4
    [System.Drawing.Color]::LightBlue, # placeholder_block_5
    [System.Drawing.Color]::Blue,     # placeholder_block_6
    [System.Drawing.Color]::Purple,   # placeholder_block_7
    [System.Drawing.Color]::Pink,     # placeholder_block_8
    [System.Drawing.Color]::Magenta,  # placeholder_block_9
    [System.Drawing.Color]::Gray,     # placeholder_block_10
    [System.Drawing.Color]::SandyBrown, # placeholder_block_11
    [System.Drawing.Color]::SaddleBrown, # placeholder_block_12
    [System.Drawing.Color]::White,    # placeholder_block_13
    [System.Drawing.Color]::DarkGray, # placeholder_block_14
    [System.Drawing.Color]::Gold,     # placeholder_block_15
    [System.Drawing.Color]::Cyan,     # placeholder_block_16
    [System.Drawing.Color]::DarkBlue, # placeholder_block_17
    [System.Drawing.Color]::LightGreen, # placeholder_block_18
    [System.Drawing.Color]::DarkGreen, # placeholder_block_19
    [System.Drawing.Color]::DarkRed,  # placeholder_block_20
    [System.Drawing.Color]::White,    # placeholder_block_21
    [System.Drawing.Color]::DarkOrange, # placeholder_block_22
    [System.Drawing.Color]::LightYellow, # placeholder_block_23
    [System.Drawing.Color]::RoyalBlue, # placeholder_block_24
    [System.Drawing.Color]::Brown,    # placeholder_block_25
    [System.Drawing.Color]::Indigo,   # placeholder_block_26
    [System.Drawing.Color]::Black,    # placeholder_block_27
    [System.Drawing.Color]::Crimson,  # placeholder_block_28
    [System.Drawing.Color]::DarkKhaki, # placeholder_block_29
    [System.Drawing.Color]::Khaki,    # placeholder_block_30
    [System.Drawing.Color]::LightCoral, # placeholder_block_31
    [System.Drawing.Color]::LightCyan, # placeholder_block_32
    [System.Drawing.Color]::LightPink, # placeholder_block_33
    [System.Drawing.Color]::LightSalmon, # placeholder_block_34
    [System.Drawing.Color]::LightSeaGreen, # placeholder_block_35
    [System.Drawing.Color]::LightSkyBlue, # placeholder_block_36
    [System.Drawing.Color]::LightSlateGray, # placeholder_block_37
    [System.Drawing.Color]::LightSteelBlue, # placeholder_block_38
    [System.Drawing.Color]::Lime,     # placeholder_block_39
    [System.Drawing.Color]::LimeGreen, # placeholder_block_40
    [System.Drawing.Color]::Linen,    # placeholder_block_41
    [System.Drawing.Color]::Maroon,   # placeholder_block_42
    [System.Drawing.Color]::MediumAquamarine, # placeholder_block_43
    [System.Drawing.Color]::MediumBlue, # placeholder_block_44
    [System.Drawing.Color]::MediumOrchid, # placeholder_block_45
    [System.Drawing.Color]::MediumPurple, # placeholder_block_46
    [System.Drawing.Color]::MediumSeaGreen, # placeholder_block_47
    [System.Drawing.Color]::MediumSlateBlue, # placeholder_block_48
    [System.Drawing.Color]::MediumSpringGreen, # placeholder_block_49
    [System.Drawing.Color]::MediumTurquoise, # placeholder_block_50
    [System.Drawing.Color]::MediumVioletRed, # placeholder_block_51
    [System.Drawing.Color]::MidnightBlue, # placeholder_block_52
    [System.Drawing.Color]::MintCream, # placeholder_block_53
    [System.Drawing.Color]::MistyRose, # placeholder_block_54
    [System.Drawing.Color]::Moccasin, # placeholder_block_55
    [System.Drawing.Color]::NavajoWhite, # placeholder_block_56
    [System.Drawing.Color]::Navy,     # placeholder_block_57
    [System.Drawing.Color]::OldLace,  # placeholder_block_58
    [System.Drawing.Color]::Olive,    # placeholder_block_59
    [System.Drawing.Color]::OliveDrab, # placeholder_block_60
    [System.Drawing.Color]::OrangeRed, # placeholder_block_61
    [System.Drawing.Color]::Orchid,   # placeholder_block_62
    [System.Drawing.Color]::PaleGoldenrod, # placeholder_block_63
    [System.Drawing.Color]::PaleGreen, # placeholder_block_64
    [System.Drawing.Color]::PaleTurquoise, # placeholder_block_65
    [System.Drawing.Color]::PaleVioletRed, # placeholder_block_66
    [System.Drawing.Color]::PapayaWhip, # placeholder_block_67
    [System.Drawing.Color]::PeachPuff, # placeholder_block_68
    [System.Drawing.Color]::Peru,     # placeholder_block_69
    [System.Drawing.Color]::PowderBlue, # placeholder_block_70
    [System.Drawing.Color]::RosyBrown, # placeholder_block_71
    [System.Drawing.Color]::SaddleBrown, # placeholder_block_72
    [System.Drawing.Color]::Salmon,   # placeholder_block_73
    [System.Drawing.Color]::SeaGreen, # placeholder_block_74
    [System.Drawing.Color]::SeaShell, # placeholder_block_75
    [System.Drawing.Color]::Sienna,   # placeholder_block_76
    [System.Drawing.Color]::Silver,   # placeholder_block_77
    [System.Drawing.Color]::SkyBlue,  # placeholder_block_78
    [System.Drawing.Color]::SlateBlue, # placeholder_block_79
    [System.Drawing.Color]::SlateGray, # placeholder_block_80
    [System.Drawing.Color]::Snow,     # placeholder_block_81
    [System.Drawing.Color]::SpringGreen, # placeholder_block_82
    [System.Drawing.Color]::SteelBlue, # placeholder_block_83
    [System.Drawing.Color]::Tan,      # placeholder_block_84
    [System.Drawing.Color]::Teal,     # placeholder_block_85
    [System.Drawing.Color]::Thistle,  # placeholder_block_86
    [System.Drawing.Color]::Tomato,   # placeholder_block_87
    [System.Drawing.Color]::Turquoise, # placeholder_block_88
    [System.Drawing.Color]::Violet,   # placeholder_block_89
    [System.Drawing.Color]::Wheat,    # placeholder_block_90
    [System.Drawing.Color]::WhiteSmoke, # placeholder_block_91
    [System.Drawing.Color]::YellowGreen, # placeholder_block_92
    [System.Drawing.Color]::DarkCyan, # placeholder_block_93
    [System.Drawing.Color]::DarkGoldenrod, # placeholder_block_94
    [System.Drawing.Color]::DarkMagenta, # placeholder_block_95
    [System.Drawing.Color]::DarkOliveGreen, # placeholder_block_96
    [System.Drawing.Color]::DarkOrchid, # placeholder_block_97
    [System.Drawing.Color]::DarkSalmon, # placeholder_block_98
    [System.Drawing.Color]::DarkSeaGreen, # placeholder_block_99
    [System.Drawing.Color]::DarkSlateBlue, # placeholder_block_100
    [System.Drawing.Color]::DarkSlateGray, # placeholder_block_101
    [System.Drawing.Color]::DarkTurquoise, # placeholder_block_102
    [System.Drawing.Color]::DarkViolet, # placeholder_block_103
    [System.Drawing.Color]::DeepPink, # placeholder_block_104
    [System.Drawing.Color]::DeepSkyBlue, # placeholder_block_105
    [System.Drawing.Color]::DodgerBlue, # placeholder_block_106
    [System.Drawing.Color]::Firebrick, # placeholder_block_107
    [System.Drawing.Color]::FloralWhite, # placeholder_block_108
    [System.Drawing.Color]::ForestGreen, # placeholder_block_109
    [System.Drawing.Color]::Fuchsia,  # placeholder_block_110
    [System.Drawing.Color]::Gainsboro, # placeholder_block_111
    [System.Drawing.Color]::GhostWhite, # placeholder_block_112
    [System.Drawing.Color]::Goldenrod, # placeholder_block_113
    [System.Drawing.Color]::GreenYellow, # placeholder_block_114
    [System.Drawing.Color]::Honeydew, # placeholder_block_115
    [System.Drawing.Color]::HotPink,  # placeholder_block_116
    [System.Drawing.Color]::IndianRed, # placeholder_block_117
    [System.Drawing.Color]::Ivory,    # placeholder_block_118
    [System.Drawing.Color]::Lavender, # placeholder_block_119
    [System.Drawing.Color]::LavenderBlush, # placeholder_block_120
    [System.Drawing.Color]::LawnGreen, # placeholder_block_121
    [System.Drawing.Color]::LemonChiffon, # placeholder_block_122
    [System.Drawing.Color]::Chocolate, # placeholder_block_123
    [System.Drawing.Color]::Coral,    # placeholder_block_124
    [System.Drawing.Color]::CornflowerBlue, # placeholder_block_125
    [System.Drawing.Color]::Cornsilk, # placeholder_block_126
    [System.Drawing.Color]::AliceBlue # placeholder_block_127
)

# Create texture directory if it doesn't exist
$textureDir = "src/main/resources/assets/failsafeblocks/textures/block"
if (-not (Test-Path $textureDir)) {
    New-Item -ItemType Directory -Path $textureDir -Force | Out-Null
}

# Function to create a modern missing block texture
function Create-ModernTexture {
    param(
        [string]$fileName,
        [System.Drawing.Color]$mainColor
    )

    # Create a high-resolution bitmap (16x16 pixels for Minecraft)
    $bmp = New-Object System.Drawing.Bitmap 16, 16

    # Create graphics from the bitmap with high quality settings
    $g = [System.Drawing.Graphics]::FromImage($bmp)
    $g.SmoothingMode = [System.Drawing.Drawing2D.SmoothingMode]::HighQuality
    $g.InterpolationMode = [System.Drawing.Drawing2D.InterpolationMode]::HighQualityBicubic
    $g.PixelOffsetMode = [System.Drawing.Drawing2D.PixelOffsetMode]::HighQuality
    
    # Create a lighter version of the main color for gradient
    $r = [Math]::Min(255, $mainColor.R * 1.3)
    $g2 = [Math]::Min(255, $mainColor.G * 1.3)
    $b = [Math]::Min(255, $mainColor.B * 1.3)
    $lighterColor = [System.Drawing.Color]::FromArgb(255, [int]$r, [int]$g2, [int]$b)
    
    # Create a darker version of the main color for gradient
    $r = $mainColor.R * 0.7
    $g2 = $mainColor.G * 0.7
    $b = $mainColor.B * 0.7
    $darkerColor = [System.Drawing.Color]::FromArgb(255, [int]$r, [int]$g2, [int]$b)

    # Fill the background with a gradient
    $rect = New-Object System.Drawing.Rectangle(0, 0, 16, 16)
    $gradientBrush = New-Object System.Drawing.Drawing2D.LinearGradientBrush(
        $rect, 
        $lighterColor, 
        $darkerColor, 
        45  # 45-degree angle for the gradient
    )
    $g.FillRectangle($gradientBrush, $rect)
    
    # Draw a subtle inner border (1 pixel from edge)
    $innerRect = New-Object System.Drawing.Rectangle(1, 1, 14, 14)
    $innerPen = New-Object System.Drawing.Pen(
        [System.Drawing.Color]::FromArgb(70, 255, 255, 255),  # Semi-transparent white
        1
    )
    $g.DrawRectangle($innerPen, $innerRect)
    
    # Determine text color based on background brightness
    $textColor = if ($mainColor.GetBrightness() -gt 0.5) { 
        [System.Drawing.Color]::FromArgb(230, 0, 0, 0)  # Semi-transparent black
    } else { 
        [System.Drawing.Color]::FromArgb(230, 255, 255, 255)  # Semi-transparent white
    }
    $textBrush = New-Object System.Drawing.SolidBrush($textColor)
    
    try {
        # First approach: using a system font
        $fontFamily = New-Object System.Drawing.FontFamily("Arial")
        $fontSize = 12.0
        $fontStyle = [System.Drawing.FontStyle]::Bold
        $font = New-Object System.Drawing.Font($fontFamily, $fontSize, $fontStyle)
        
        # Measure string to center it properly
        $format = New-Object System.Drawing.StringFormat
        $format.Alignment = [System.Drawing.StringAlignment]::Center
        $format.LineAlignment = [System.Drawing.StringAlignment]::Center
        
        # Draw the symbol centered (fixed coordinates)
        $centerPoint = New-Object System.Drawing.PointF(8, 7)
        $g.DrawString("!", $font, $textBrush, $centerPoint, $format)
        
        # Draw a subtle pattern for a modern texture look
        $patternPen = New-Object System.Drawing.Pen(
            [System.Drawing.Color]::FromArgb(30, [int](255 - $mainColor.R), [int](255 - $mainColor.G), [int](255 - $mainColor.B)),
            1
        )
        
        # Draw subtle dots in corners
        $g.DrawRectangle($patternPen, 3, 3, 1, 1)
        $g.DrawRectangle($patternPen, 12, 3, 1, 1)
        $g.DrawRectangle($patternPen, 3, 12, 1, 1)
        $g.DrawRectangle($patternPen, 12, 12, 1, 1)
        
        # Draw outer border
        $outerPen = New-Object System.Drawing.Pen(
            [System.Drawing.Color]::FromArgb(200, [int]($darkerColor.R * 0.8), [int]($darkerColor.G * 0.8), [int]($darkerColor.B * 0.8)),
            1
        )
        $g.DrawRectangle($outerPen, 0, 0, 15, 15)
        
        # Save the bitmap as a PNG file
        $bmp.Save($fileName, [System.Drawing.Imaging.ImageFormat]::Png)
        
        Write-Host "Generated modern texture: $fileName"
    }
    catch {
        Write-Host "Error creating texture: $_"
        # Fallback to a simpler approach if the font approach fails
        try {
            # Clear and start over
            $g.Clear($mainColor)
            
            # Draw a simple X
            $xPen = New-Object System.Drawing.Pen([System.Drawing.Color]::White, 2)
            $g.DrawLine($xPen, 4, 4, 12, 12)
            $g.DrawLine($xPen, 12, 4, 4, 12)
            
            # Save the bitmap as a PNG file
            $bmp.Save($fileName, [System.Drawing.Imaging.ImageFormat]::Png)
            
            Write-Host "Generated fallback texture: $fileName"
        }
        catch {
            Write-Host "Error creating fallback texture: $_"
        }
    }
    finally {
        # Dispose of the resources
        if ($g -ne $null) { $g.Dispose() }
        if ($bmp -ne $null) { $bmp.Dispose() }
        if ($gradientBrush -ne $null) { $gradientBrush.Dispose() }
        if ($font -ne $null) { $font.Dispose() }
        if ($fontFamily -ne $null) { $fontFamily.Dispose() }
        if ($textBrush -ne $null) { $textBrush.Dispose() }
        if ($innerPen -ne $null) { $innerPen.Dispose() }
        if ($patternPen -ne $null) { $patternPen.Dispose() }
        if ($outerPen -ne $null) { $outerPen.Dispose() }
        if ($xPen -ne $null) { $xPen.Dispose() }
        if ($format -ne $null) { $format.Dispose() }
    }
}

# Generate the main placeholder texture
Create-ModernTexture -fileName "$textureDir/placeholder_block.png" -mainColor $colors[0]

# Generate the numbered placeholder textures
for ($i = 1; $i -le 127; $i++) {
    Create-ModernTexture -fileName "$textureDir/placeholder_block_$i.png" -mainColor $colors[$i]
}

Write-Host "All modern textures generated successfully!" 