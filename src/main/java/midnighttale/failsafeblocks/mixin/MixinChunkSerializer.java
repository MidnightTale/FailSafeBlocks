package midnighttale.failsafeblocks.mixin;

import midnighttale.failsafeblocks.blocks.ModBlocks;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.ListTag;
import net.minecraft.nbt.Tag;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.ai.village.poi.PoiManager;
import net.minecraft.world.level.ChunkPos;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.chunk.ChunkAccess;
import net.minecraft.world.level.chunk.storage.ChunkSerializer;
import net.minecraft.world.level.chunk.storage.RegionStorageInfo;
import org.slf4j.Logger;
import com.mojang.logging.LogUtils;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Mixin(ChunkSerializer.class)
public class MixinChunkSerializer {
    @Unique
    private static final Logger failSafeBlocks$LOGGER = LogUtils.getLogger();
    
    @Unique
    private static final List<String> PLACEHOLDER_BLOCKS = failSafeBlocks$initPlaceholderBlocks();
    
    @Unique
    private static final Map<String, String> MISSING_BLOCK_REPLACEMENTS = new HashMap<>();
    
    /**
     * Initialize the list of placeholder blocks
     */
    @Unique
    private static List<String> failSafeBlocks$initPlaceholderBlocks() {
        List<String> blocks = new ArrayList<>();
        
        // Add all 128 placeholder blocks to the list
        blocks.add(BuiltInRegistries.BLOCK.getKey(ModBlocks.PLACEHOLDER_BLOCK.get()).toString());
        blocks.add(BuiltInRegistries.BLOCK.getKey(ModBlocks.PLACEHOLDER_BLOCK_1.get()).toString());
        blocks.add(BuiltInRegistries.BLOCK.getKey(ModBlocks.PLACEHOLDER_BLOCK_2.get()).toString());
        blocks.add(BuiltInRegistries.BLOCK.getKey(ModBlocks.PLACEHOLDER_BLOCK_3.get()).toString());
        blocks.add(BuiltInRegistries.BLOCK.getKey(ModBlocks.PLACEHOLDER_BLOCK_4.get()).toString());
        blocks.add(BuiltInRegistries.BLOCK.getKey(ModBlocks.PLACEHOLDER_BLOCK_5.get()).toString());
        blocks.add(BuiltInRegistries.BLOCK.getKey(ModBlocks.PLACEHOLDER_BLOCK_6.get()).toString());
        blocks.add(BuiltInRegistries.BLOCK.getKey(ModBlocks.PLACEHOLDER_BLOCK_7.get()).toString());
        blocks.add(BuiltInRegistries.BLOCK.getKey(ModBlocks.PLACEHOLDER_BLOCK_8.get()).toString());
        blocks.add(BuiltInRegistries.BLOCK.getKey(ModBlocks.PLACEHOLDER_BLOCK_9.get()).toString());
        blocks.add(BuiltInRegistries.BLOCK.getKey(ModBlocks.PLACEHOLDER_BLOCK_10.get()).toString());
        blocks.add(BuiltInRegistries.BLOCK.getKey(ModBlocks.PLACEHOLDER_BLOCK_11.get()).toString());
        blocks.add(BuiltInRegistries.BLOCK.getKey(ModBlocks.PLACEHOLDER_BLOCK_12.get()).toString());
        blocks.add(BuiltInRegistries.BLOCK.getKey(ModBlocks.PLACEHOLDER_BLOCK_13.get()).toString());
        blocks.add(BuiltInRegistries.BLOCK.getKey(ModBlocks.PLACEHOLDER_BLOCK_14.get()).toString());
        blocks.add(BuiltInRegistries.BLOCK.getKey(ModBlocks.PLACEHOLDER_BLOCK_15.get()).toString());
        blocks.add(BuiltInRegistries.BLOCK.getKey(ModBlocks.PLACEHOLDER_BLOCK_16.get()).toString());
        blocks.add(BuiltInRegistries.BLOCK.getKey(ModBlocks.PLACEHOLDER_BLOCK_17.get()).toString());
        blocks.add(BuiltInRegistries.BLOCK.getKey(ModBlocks.PLACEHOLDER_BLOCK_18.get()).toString());
        blocks.add(BuiltInRegistries.BLOCK.getKey(ModBlocks.PLACEHOLDER_BLOCK_19.get()).toString());
        blocks.add(BuiltInRegistries.BLOCK.getKey(ModBlocks.PLACEHOLDER_BLOCK_20.get()).toString());
        blocks.add(BuiltInRegistries.BLOCK.getKey(ModBlocks.PLACEHOLDER_BLOCK_21.get()).toString());
        blocks.add(BuiltInRegistries.BLOCK.getKey(ModBlocks.PLACEHOLDER_BLOCK_22.get()).toString());
        blocks.add(BuiltInRegistries.BLOCK.getKey(ModBlocks.PLACEHOLDER_BLOCK_23.get()).toString());
        blocks.add(BuiltInRegistries.BLOCK.getKey(ModBlocks.PLACEHOLDER_BLOCK_24.get()).toString());
        blocks.add(BuiltInRegistries.BLOCK.getKey(ModBlocks.PLACEHOLDER_BLOCK_25.get()).toString());
        blocks.add(BuiltInRegistries.BLOCK.getKey(ModBlocks.PLACEHOLDER_BLOCK_26.get()).toString());
        blocks.add(BuiltInRegistries.BLOCK.getKey(ModBlocks.PLACEHOLDER_BLOCK_27.get()).toString());
        blocks.add(BuiltInRegistries.BLOCK.getKey(ModBlocks.PLACEHOLDER_BLOCK_28.get()).toString());
        blocks.add(BuiltInRegistries.BLOCK.getKey(ModBlocks.PLACEHOLDER_BLOCK_29.get()).toString());
        blocks.add(BuiltInRegistries.BLOCK.getKey(ModBlocks.PLACEHOLDER_BLOCK_30.get()).toString());
        blocks.add(BuiltInRegistries.BLOCK.getKey(ModBlocks.PLACEHOLDER_BLOCK_31.get()).toString());
        blocks.add(BuiltInRegistries.BLOCK.getKey(ModBlocks.PLACEHOLDER_BLOCK_32.get()).toString());
        blocks.add(BuiltInRegistries.BLOCK.getKey(ModBlocks.PLACEHOLDER_BLOCK_33.get()).toString());
        blocks.add(BuiltInRegistries.BLOCK.getKey(ModBlocks.PLACEHOLDER_BLOCK_34.get()).toString());
        blocks.add(BuiltInRegistries.BLOCK.getKey(ModBlocks.PLACEHOLDER_BLOCK_35.get()).toString());
        blocks.add(BuiltInRegistries.BLOCK.getKey(ModBlocks.PLACEHOLDER_BLOCK_36.get()).toString());
        blocks.add(BuiltInRegistries.BLOCK.getKey(ModBlocks.PLACEHOLDER_BLOCK_37.get()).toString());
        blocks.add(BuiltInRegistries.BLOCK.getKey(ModBlocks.PLACEHOLDER_BLOCK_38.get()).toString());
        blocks.add(BuiltInRegistries.BLOCK.getKey(ModBlocks.PLACEHOLDER_BLOCK_39.get()).toString());
        blocks.add(BuiltInRegistries.BLOCK.getKey(ModBlocks.PLACEHOLDER_BLOCK_40.get()).toString());
        blocks.add(BuiltInRegistries.BLOCK.getKey(ModBlocks.PLACEHOLDER_BLOCK_41.get()).toString());
        blocks.add(BuiltInRegistries.BLOCK.getKey(ModBlocks.PLACEHOLDER_BLOCK_42.get()).toString());
        blocks.add(BuiltInRegistries.BLOCK.getKey(ModBlocks.PLACEHOLDER_BLOCK_43.get()).toString());
        blocks.add(BuiltInRegistries.BLOCK.getKey(ModBlocks.PLACEHOLDER_BLOCK_44.get()).toString());
        blocks.add(BuiltInRegistries.BLOCK.getKey(ModBlocks.PLACEHOLDER_BLOCK_45.get()).toString());
        blocks.add(BuiltInRegistries.BLOCK.getKey(ModBlocks.PLACEHOLDER_BLOCK_46.get()).toString());
        blocks.add(BuiltInRegistries.BLOCK.getKey(ModBlocks.PLACEHOLDER_BLOCK_47.get()).toString());
        blocks.add(BuiltInRegistries.BLOCK.getKey(ModBlocks.PLACEHOLDER_BLOCK_48.get()).toString());
        blocks.add(BuiltInRegistries.BLOCK.getKey(ModBlocks.PLACEHOLDER_BLOCK_49.get()).toString());
        blocks.add(BuiltInRegistries.BLOCK.getKey(ModBlocks.PLACEHOLDER_BLOCK_50.get()).toString());
        blocks.add(BuiltInRegistries.BLOCK.getKey(ModBlocks.PLACEHOLDER_BLOCK_51.get()).toString());
        blocks.add(BuiltInRegistries.BLOCK.getKey(ModBlocks.PLACEHOLDER_BLOCK_52.get()).toString());
        blocks.add(BuiltInRegistries.BLOCK.getKey(ModBlocks.PLACEHOLDER_BLOCK_53.get()).toString());
        blocks.add(BuiltInRegistries.BLOCK.getKey(ModBlocks.PLACEHOLDER_BLOCK_54.get()).toString());
        blocks.add(BuiltInRegistries.BLOCK.getKey(ModBlocks.PLACEHOLDER_BLOCK_55.get()).toString());
        blocks.add(BuiltInRegistries.BLOCK.getKey(ModBlocks.PLACEHOLDER_BLOCK_56.get()).toString());
        blocks.add(BuiltInRegistries.BLOCK.getKey(ModBlocks.PLACEHOLDER_BLOCK_57.get()).toString());
        blocks.add(BuiltInRegistries.BLOCK.getKey(ModBlocks.PLACEHOLDER_BLOCK_58.get()).toString());
        blocks.add(BuiltInRegistries.BLOCK.getKey(ModBlocks.PLACEHOLDER_BLOCK_59.get()).toString());
        blocks.add(BuiltInRegistries.BLOCK.getKey(ModBlocks.PLACEHOLDER_BLOCK_60.get()).toString());
        blocks.add(BuiltInRegistries.BLOCK.getKey(ModBlocks.PLACEHOLDER_BLOCK_61.get()).toString());
        blocks.add(BuiltInRegistries.BLOCK.getKey(ModBlocks.PLACEHOLDER_BLOCK_62.get()).toString());
        blocks.add(BuiltInRegistries.BLOCK.getKey(ModBlocks.PLACEHOLDER_BLOCK_63.get()).toString());
        blocks.add(BuiltInRegistries.BLOCK.getKey(ModBlocks.PLACEHOLDER_BLOCK_64.get()).toString());
        blocks.add(BuiltInRegistries.BLOCK.getKey(ModBlocks.PLACEHOLDER_BLOCK_65.get()).toString());
        blocks.add(BuiltInRegistries.BLOCK.getKey(ModBlocks.PLACEHOLDER_BLOCK_66.get()).toString());
        blocks.add(BuiltInRegistries.BLOCK.getKey(ModBlocks.PLACEHOLDER_BLOCK_67.get()).toString());
        blocks.add(BuiltInRegistries.BLOCK.getKey(ModBlocks.PLACEHOLDER_BLOCK_68.get()).toString());
        blocks.add(BuiltInRegistries.BLOCK.getKey(ModBlocks.PLACEHOLDER_BLOCK_69.get()).toString());
        blocks.add(BuiltInRegistries.BLOCK.getKey(ModBlocks.PLACEHOLDER_BLOCK_70.get()).toString());
        blocks.add(BuiltInRegistries.BLOCK.getKey(ModBlocks.PLACEHOLDER_BLOCK_71.get()).toString());
        blocks.add(BuiltInRegistries.BLOCK.getKey(ModBlocks.PLACEHOLDER_BLOCK_72.get()).toString());
        blocks.add(BuiltInRegistries.BLOCK.getKey(ModBlocks.PLACEHOLDER_BLOCK_73.get()).toString());
        blocks.add(BuiltInRegistries.BLOCK.getKey(ModBlocks.PLACEHOLDER_BLOCK_74.get()).toString());
        blocks.add(BuiltInRegistries.BLOCK.getKey(ModBlocks.PLACEHOLDER_BLOCK_75.get()).toString());
        blocks.add(BuiltInRegistries.BLOCK.getKey(ModBlocks.PLACEHOLDER_BLOCK_76.get()).toString());
        blocks.add(BuiltInRegistries.BLOCK.getKey(ModBlocks.PLACEHOLDER_BLOCK_77.get()).toString());
        blocks.add(BuiltInRegistries.BLOCK.getKey(ModBlocks.PLACEHOLDER_BLOCK_78.get()).toString());
        blocks.add(BuiltInRegistries.BLOCK.getKey(ModBlocks.PLACEHOLDER_BLOCK_79.get()).toString());
        blocks.add(BuiltInRegistries.BLOCK.getKey(ModBlocks.PLACEHOLDER_BLOCK_80.get()).toString());
        blocks.add(BuiltInRegistries.BLOCK.getKey(ModBlocks.PLACEHOLDER_BLOCK_81.get()).toString());
        blocks.add(BuiltInRegistries.BLOCK.getKey(ModBlocks.PLACEHOLDER_BLOCK_82.get()).toString());
        blocks.add(BuiltInRegistries.BLOCK.getKey(ModBlocks.PLACEHOLDER_BLOCK_83.get()).toString());
        blocks.add(BuiltInRegistries.BLOCK.getKey(ModBlocks.PLACEHOLDER_BLOCK_84.get()).toString());
        blocks.add(BuiltInRegistries.BLOCK.getKey(ModBlocks.PLACEHOLDER_BLOCK_85.get()).toString());
        blocks.add(BuiltInRegistries.BLOCK.getKey(ModBlocks.PLACEHOLDER_BLOCK_86.get()).toString());
        blocks.add(BuiltInRegistries.BLOCK.getKey(ModBlocks.PLACEHOLDER_BLOCK_87.get()).toString());
        blocks.add(BuiltInRegistries.BLOCK.getKey(ModBlocks.PLACEHOLDER_BLOCK_88.get()).toString());
        blocks.add(BuiltInRegistries.BLOCK.getKey(ModBlocks.PLACEHOLDER_BLOCK_89.get()).toString());
        blocks.add(BuiltInRegistries.BLOCK.getKey(ModBlocks.PLACEHOLDER_BLOCK_90.get()).toString());
        blocks.add(BuiltInRegistries.BLOCK.getKey(ModBlocks.PLACEHOLDER_BLOCK_91.get()).toString());
        blocks.add(BuiltInRegistries.BLOCK.getKey(ModBlocks.PLACEHOLDER_BLOCK_92.get()).toString());
        blocks.add(BuiltInRegistries.BLOCK.getKey(ModBlocks.PLACEHOLDER_BLOCK_93.get()).toString());
        blocks.add(BuiltInRegistries.BLOCK.getKey(ModBlocks.PLACEHOLDER_BLOCK_94.get()).toString());
        blocks.add(BuiltInRegistries.BLOCK.getKey(ModBlocks.PLACEHOLDER_BLOCK_95.get()).toString());
        blocks.add(BuiltInRegistries.BLOCK.getKey(ModBlocks.PLACEHOLDER_BLOCK_96.get()).toString());
        blocks.add(BuiltInRegistries.BLOCK.getKey(ModBlocks.PLACEHOLDER_BLOCK_97.get()).toString());
        blocks.add(BuiltInRegistries.BLOCK.getKey(ModBlocks.PLACEHOLDER_BLOCK_98.get()).toString());
        blocks.add(BuiltInRegistries.BLOCK.getKey(ModBlocks.PLACEHOLDER_BLOCK_99.get()).toString());
        blocks.add(BuiltInRegistries.BLOCK.getKey(ModBlocks.PLACEHOLDER_BLOCK_100.get()).toString());
        blocks.add(BuiltInRegistries.BLOCK.getKey(ModBlocks.PLACEHOLDER_BLOCK_101.get()).toString());
        blocks.add(BuiltInRegistries.BLOCK.getKey(ModBlocks.PLACEHOLDER_BLOCK_102.get()).toString());
        blocks.add(BuiltInRegistries.BLOCK.getKey(ModBlocks.PLACEHOLDER_BLOCK_103.get()).toString());
        blocks.add(BuiltInRegistries.BLOCK.getKey(ModBlocks.PLACEHOLDER_BLOCK_104.get()).toString());
        blocks.add(BuiltInRegistries.BLOCK.getKey(ModBlocks.PLACEHOLDER_BLOCK_105.get()).toString());
        blocks.add(BuiltInRegistries.BLOCK.getKey(ModBlocks.PLACEHOLDER_BLOCK_106.get()).toString());
        blocks.add(BuiltInRegistries.BLOCK.getKey(ModBlocks.PLACEHOLDER_BLOCK_107.get()).toString());
        blocks.add(BuiltInRegistries.BLOCK.getKey(ModBlocks.PLACEHOLDER_BLOCK_108.get()).toString());
        blocks.add(BuiltInRegistries.BLOCK.getKey(ModBlocks.PLACEHOLDER_BLOCK_109.get()).toString());
        blocks.add(BuiltInRegistries.BLOCK.getKey(ModBlocks.PLACEHOLDER_BLOCK_110.get()).toString());
        blocks.add(BuiltInRegistries.BLOCK.getKey(ModBlocks.PLACEHOLDER_BLOCK_111.get()).toString());
        blocks.add(BuiltInRegistries.BLOCK.getKey(ModBlocks.PLACEHOLDER_BLOCK_112.get()).toString());
        blocks.add(BuiltInRegistries.BLOCK.getKey(ModBlocks.PLACEHOLDER_BLOCK_113.get()).toString());
        blocks.add(BuiltInRegistries.BLOCK.getKey(ModBlocks.PLACEHOLDER_BLOCK_114.get()).toString());
        blocks.add(BuiltInRegistries.BLOCK.getKey(ModBlocks.PLACEHOLDER_BLOCK_115.get()).toString());
        blocks.add(BuiltInRegistries.BLOCK.getKey(ModBlocks.PLACEHOLDER_BLOCK_116.get()).toString());
        blocks.add(BuiltInRegistries.BLOCK.getKey(ModBlocks.PLACEHOLDER_BLOCK_117.get()).toString());
        blocks.add(BuiltInRegistries.BLOCK.getKey(ModBlocks.PLACEHOLDER_BLOCK_118.get()).toString());
        blocks.add(BuiltInRegistries.BLOCK.getKey(ModBlocks.PLACEHOLDER_BLOCK_119.get()).toString());
        blocks.add(BuiltInRegistries.BLOCK.getKey(ModBlocks.PLACEHOLDER_BLOCK_120.get()).toString());
        blocks.add(BuiltInRegistries.BLOCK.getKey(ModBlocks.PLACEHOLDER_BLOCK_121.get()).toString());
        blocks.add(BuiltInRegistries.BLOCK.getKey(ModBlocks.PLACEHOLDER_BLOCK_122.get()).toString());
        blocks.add(BuiltInRegistries.BLOCK.getKey(ModBlocks.PLACEHOLDER_BLOCK_123.get()).toString());
        blocks.add(BuiltInRegistries.BLOCK.getKey(ModBlocks.PLACEHOLDER_BLOCK_124.get()).toString());
        blocks.add(BuiltInRegistries.BLOCK.getKey(ModBlocks.PLACEHOLDER_BLOCK_125.get()).toString());
        blocks.add(BuiltInRegistries.BLOCK.getKey(ModBlocks.PLACEHOLDER_BLOCK_126.get()).toString());
        blocks.add(BuiltInRegistries.BLOCK.getKey(ModBlocks.PLACEHOLDER_BLOCK_127.get()).toString());
        
        failSafeBlocks$LOGGER.info("Initialized {} placeholder blocks for missing block replacement", blocks.size());
        return blocks;
    }
    
    /**
     * Get a placeholder block for a missing block ID. This maps a missing block consistently
     * to the same placeholder block based on hash code.
     */
    @Unique
    private static String failSafeBlocks$getPlaceholderBlockId(String missingBlockId) {
        // If we've already assigned a placeholder for this block, use it
        if (MISSING_BLOCK_REPLACEMENTS.containsKey(missingBlockId)) {
            return MISSING_BLOCK_REPLACEMENTS.get(missingBlockId);
        }
        
        // Select a placeholder based on the hash of the missing block ID
        int index = Math.abs(missingBlockId.hashCode()) % PLACEHOLDER_BLOCKS.size();
        String placeholderId = PLACEHOLDER_BLOCKS.get(index);
        
        // Remember this mapping for future use
        MISSING_BLOCK_REPLACEMENTS.put(missingBlockId, placeholderId);
        
        failSafeBlocks$LOGGER.debug("Mapping missing block {} to placeholder {}", missingBlockId, placeholderId);
        return placeholderId;
    }
    
    /**
     * This injection captures the palette entries from the NBT data before they're processed
     * by Minecraft. We use this to detect and replace missing blocks before they get defaulted.
     */
    @Inject(method = "read", at = @At("HEAD"))
    private static void onChunkReadStart(ServerLevel level, PoiManager poiManager, 
                                RegionStorageInfo regionStorageInfo, ChunkPos pos, 
                                CompoundTag tag, CallbackInfoReturnable<ChunkAccess> cir) {
        // Process the NBT data to find palette entries for blocks
        if (!tag.contains("sections", Tag.TAG_LIST)) return;
        
            ListTag sections = tag.getList("sections", Tag.TAG_COMPOUND);
        int replacedBlocks = 0;
        Set<String> missingBlockIds = failSafeBlocks$findMissingBlockIdsFromNBT(tag);
            
            for (int i = 0; i < sections.size(); i++) {
                CompoundTag section = sections.getCompound(i);
                
            if (!section.contains("block_states", Tag.TAG_COMPOUND)) continue;
                    CompoundTag blockStates = section.getCompound("block_states");
                    
            if (!blockStates.contains("palette", Tag.TAG_LIST)) continue;
                        ListTag palette = blockStates.getList("palette", Tag.TAG_COMPOUND);
                        
                        for (int j = 0; j < palette.size(); j++) {
                            CompoundTag blockEntry = palette.getCompound(j);
                            
                if (!blockEntry.contains("Name", Tag.TAG_STRING)) continue;
                                String blockName = blockEntry.getString("Name");
                                
                // Check if this blockName is in our missing blocks set or invalid
                if (missingBlockIds.contains(blockName) || failSafeBlocks$isInvalidBlockId(blockName)) {
                    // Replace the block name with an appropriate placeholder
                    String replacementId = failSafeBlocks$getPlaceholderBlockId(blockName);
                    blockEntry.putString("Name", replacementId);
                    replacedBlocks++;
                    failSafeBlocks$LOGGER.debug("Replaced missing block {} with placeholder {} in chunk {} palette",
                        blockName, replacementId, pos);
                }
            }
        }
        
        if (replacedBlocks > 0) {
            failSafeBlocks$LOGGER.info("Made {} block replacements in chunk {} NBT data", replacedBlocks, pos);
        }
    }
    
    /**
     * Checks if a block ID string is valid (exists in the registry)
     */
    @Unique
    private static boolean failSafeBlocks$isInvalidBlockId(String blockId) {
        try {
            ResourceLocation resourceLocation = ResourceLocation.tryParse(blockId);
            if (resourceLocation == null) {
                failSafeBlocks$LOGGER.debug("Invalid block ID format: {}", blockId);
                return true;
            }
            return !BuiltInRegistries.BLOCK.containsKey(resourceLocation);
        } catch (Exception e) {
            failSafeBlocks$LOGGER.debug("Invalid block ID format: {}", blockId);
            return true;
        }
    }
    
    /**
     * Extracts all block IDs from NBT and checks if they're valid
     */
    @Unique
    private static Set<String> failSafeBlocks$findMissingBlockIdsFromNBT(CompoundTag nbt) {
        Set<String> missingBlocks = new HashSet<>();
        
        try {
            if (!nbt.contains("sections", Tag.TAG_LIST)) return missingBlocks;
            
                ListTag sections = nbt.getList("sections", Tag.TAG_COMPOUND);
                
                for (int i = 0; i < sections.size(); i++) {
                    CompoundTag section = sections.getCompound(i);
                    
                if (!section.contains("block_states", Tag.TAG_COMPOUND)) continue;
                        CompoundTag blockStates = section.getCompound("block_states");
                        
                if (!blockStates.contains("palette", Tag.TAG_LIST)) continue;
                            ListTag palette = blockStates.getList("palette", Tag.TAG_COMPOUND);
                            
                            for (int j = 0; j < palette.size(); j++) {
                                CompoundTag blockEntry = palette.getCompound(j);
                                
                    if (!blockEntry.contains("Name", Tag.TAG_STRING)) continue;
                                    String blockName = blockEntry.getString("Name");
                                    
                    // Check if this block exists in the registry
                    if (failSafeBlocks$isInvalidBlockId(blockName)) {
                                            missingBlocks.add(blockName);
                                            failSafeBlocks$LOGGER.debug("Found missing block reference in palette: {}", blockName);
                    }
                }
            }
        } catch (Exception e) {
            failSafeBlocks$LOGGER.error("Error parsing chunk NBT for missing blocks", e);
        }
        
        return missingBlocks;
    }
} 