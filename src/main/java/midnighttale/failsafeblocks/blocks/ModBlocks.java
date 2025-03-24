package midnighttale.failsafeblocks.blocks;

import midnighttale.failsafeblocks.Failsafeblocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModBlocks {
    /**
     * Main placeholder block that replaces missing blocks from removed mods
     * Using a bright, noticeable color and properties to make it stand out
     */
    public static final DeferredBlock<Block> PLACEHOLDER_BLOCK = Failsafeblocks.BLOCKS.registerSimpleBlock("placeholder_block", 
            BlockBehaviour.Properties.of()
                .mapColor(MapColor.COLOR_MAGENTA)  // Bright magenta color
                .strength(1.5f)                   // Medium durability
                .sound(SoundType.AMETHYST)        // Distinctive sound
                .pushReaction(PushReaction.NORMAL) // Can be pushed by pistons
                .noLootTable());                  // No drops when broken
    
    // Create 127 additional placeholder blocks with different colors
    public static final DeferredBlock<Block> PLACEHOLDER_BLOCK_1 = registerPlaceholderBlock("placeholder_block_1", MapColor.COLOR_RED);
    public static final DeferredBlock<Block> PLACEHOLDER_BLOCK_2 = registerPlaceholderBlock("placeholder_block_2", MapColor.COLOR_ORANGE);
    public static final DeferredBlock<Block> PLACEHOLDER_BLOCK_3 = registerPlaceholderBlock("placeholder_block_3", MapColor.COLOR_YELLOW);
    public static final DeferredBlock<Block> PLACEHOLDER_BLOCK_4 = registerPlaceholderBlock("placeholder_block_4", MapColor.COLOR_GREEN);
    public static final DeferredBlock<Block> PLACEHOLDER_BLOCK_5 = registerPlaceholderBlock("placeholder_block_5", MapColor.COLOR_LIGHT_BLUE);
    public static final DeferredBlock<Block> PLACEHOLDER_BLOCK_6 = registerPlaceholderBlock("placeholder_block_6", MapColor.COLOR_BLUE);
    public static final DeferredBlock<Block> PLACEHOLDER_BLOCK_7 = registerPlaceholderBlock("placeholder_block_7", MapColor.COLOR_PURPLE);
    public static final DeferredBlock<Block> PLACEHOLDER_BLOCK_8 = registerPlaceholderBlock("placeholder_block_8", MapColor.COLOR_PINK);
    public static final DeferredBlock<Block> PLACEHOLDER_BLOCK_9 = registerPlaceholderBlock("placeholder_block_9", MapColor.COLOR_MAGENTA);
    public static final DeferredBlock<Block> PLACEHOLDER_BLOCK_10 = registerPlaceholderBlock("placeholder_block_10", MapColor.STONE);
    public static final DeferredBlock<Block> PLACEHOLDER_BLOCK_11 = registerPlaceholderBlock("placeholder_block_11", MapColor.DIRT);
    public static final DeferredBlock<Block> PLACEHOLDER_BLOCK_12 = registerPlaceholderBlock("placeholder_block_12", MapColor.WOOD);
    public static final DeferredBlock<Block> PLACEHOLDER_BLOCK_13 = registerPlaceholderBlock("placeholder_block_13", MapColor.QUARTZ);
    public static final DeferredBlock<Block> PLACEHOLDER_BLOCK_14 = registerPlaceholderBlock("placeholder_block_14", MapColor.DEEPSLATE);
    public static final DeferredBlock<Block> PLACEHOLDER_BLOCK_15 = registerPlaceholderBlock("placeholder_block_15", MapColor.GOLD);
    public static final DeferredBlock<Block> PLACEHOLDER_BLOCK_16 = registerPlaceholderBlock("placeholder_block_16", MapColor.DIAMOND);
    public static final DeferredBlock<Block> PLACEHOLDER_BLOCK_17 = registerPlaceholderBlock("placeholder_block_17", MapColor.LAPIS);
    public static final DeferredBlock<Block> PLACEHOLDER_BLOCK_18 = registerPlaceholderBlock("placeholder_block_18", MapColor.EMERALD);
    public static final DeferredBlock<Block> PLACEHOLDER_BLOCK_19 = registerPlaceholderBlock("placeholder_block_19", MapColor.PODZOL);
    public static final DeferredBlock<Block> PLACEHOLDER_BLOCK_20 = registerPlaceholderBlock("placeholder_block_20", MapColor.NETHER);
    public static final DeferredBlock<Block> PLACEHOLDER_BLOCK_21 = registerPlaceholderBlock("placeholder_block_21", MapColor.TERRACOTTA_WHITE);
    public static final DeferredBlock<Block> PLACEHOLDER_BLOCK_22 = registerPlaceholderBlock("placeholder_block_22", MapColor.TERRACOTTA_ORANGE);
    public static final DeferredBlock<Block> PLACEHOLDER_BLOCK_23 = registerPlaceholderBlock("placeholder_block_23", MapColor.TERRACOTTA_YELLOW);
    public static final DeferredBlock<Block> PLACEHOLDER_BLOCK_24 = registerPlaceholderBlock("placeholder_block_24", MapColor.TERRACOTTA_BLUE);
    public static final DeferredBlock<Block> PLACEHOLDER_BLOCK_25 = registerPlaceholderBlock("placeholder_block_25", MapColor.TERRACOTTA_BROWN);
    public static final DeferredBlock<Block> PLACEHOLDER_BLOCK_26 = registerPlaceholderBlock("placeholder_block_26", MapColor.TERRACOTTA_PURPLE);
    public static final DeferredBlock<Block> PLACEHOLDER_BLOCK_27 = registerPlaceholderBlock("placeholder_block_27", MapColor.TERRACOTTA_BLACK);
    
    // Additional blocks (28-127) for expanded capacity
    public static final DeferredBlock<Block> PLACEHOLDER_BLOCK_28 = registerPlaceholderBlock("placeholder_block_28", MapColor.TERRACOTTA_RED);
    public static final DeferredBlock<Block> PLACEHOLDER_BLOCK_29 = registerPlaceholderBlock("placeholder_block_29", MapColor.TERRACOTTA_GREEN);
    public static final DeferredBlock<Block> PLACEHOLDER_BLOCK_30 = registerPlaceholderBlock("placeholder_block_30", MapColor.CLAY);
    public static final DeferredBlock<Block> PLACEHOLDER_BLOCK_31 = registerPlaceholderBlock("placeholder_block_31", MapColor.GRASS);
    public static final DeferredBlock<Block> PLACEHOLDER_BLOCK_32 = registerPlaceholderBlock("placeholder_block_32", MapColor.SAND);
    public static final DeferredBlock<Block> PLACEHOLDER_BLOCK_33 = registerPlaceholderBlock("placeholder_block_33", MapColor.TERRACOTTA_LIGHT_BLUE);
    public static final DeferredBlock<Block> PLACEHOLDER_BLOCK_34 = registerPlaceholderBlock("placeholder_block_34", MapColor.METAL);
    public static final DeferredBlock<Block> PLACEHOLDER_BLOCK_35 = registerPlaceholderBlock("placeholder_block_35", MapColor.PLANT);
    public static final DeferredBlock<Block> PLACEHOLDER_BLOCK_36 = registerPlaceholderBlock("placeholder_block_36", MapColor.WATER);
    public static final DeferredBlock<Block> PLACEHOLDER_BLOCK_37 = registerPlaceholderBlock("placeholder_block_37", MapColor.WOOL);
    public static final DeferredBlock<Block> PLACEHOLDER_BLOCK_38 = registerPlaceholderBlock("placeholder_block_38", MapColor.FIRE);
    public static final DeferredBlock<Block> PLACEHOLDER_BLOCK_39 = registerPlaceholderBlock("placeholder_block_39", MapColor.ICE);
    public static final DeferredBlock<Block> PLACEHOLDER_BLOCK_40 = registerPlaceholderBlock("placeholder_block_40", MapColor.SNOW);
    public static final DeferredBlock<Block> PLACEHOLDER_BLOCK_41 = registerPlaceholderBlock("placeholder_block_41", MapColor.COLOR_BLACK);
    public static final DeferredBlock<Block> PLACEHOLDER_BLOCK_42 = registerPlaceholderBlock("placeholder_block_42", MapColor.COLOR_BROWN);
    public static final DeferredBlock<Block> PLACEHOLDER_BLOCK_43 = registerPlaceholderBlock("placeholder_block_43", MapColor.COLOR_CYAN);
    public static final DeferredBlock<Block> PLACEHOLDER_BLOCK_44 = registerPlaceholderBlock("placeholder_block_44", MapColor.COLOR_GRAY);
    public static final DeferredBlock<Block> PLACEHOLDER_BLOCK_45 = registerPlaceholderBlock("placeholder_block_45", MapColor.COLOR_LIGHT_GRAY);
    public static final DeferredBlock<Block> PLACEHOLDER_BLOCK_46 = registerPlaceholderBlock("placeholder_block_46", MapColor.GLOW_LICHEN);
    public static final DeferredBlock<Block> PLACEHOLDER_BLOCK_47 = registerPlaceholderBlock("placeholder_block_47", MapColor.CRIMSON_NYLIUM);
    public static final DeferredBlock<Block> PLACEHOLDER_BLOCK_48 = registerPlaceholderBlock("placeholder_block_48", MapColor.CRIMSON_STEM);
    public static final DeferredBlock<Block> PLACEHOLDER_BLOCK_49 = registerPlaceholderBlock("placeholder_block_49", MapColor.CRIMSON_HYPHAE);
    public static final DeferredBlock<Block> PLACEHOLDER_BLOCK_50 = registerPlaceholderBlock("placeholder_block_50", MapColor.WARPED_NYLIUM);
    public static final DeferredBlock<Block> PLACEHOLDER_BLOCK_51 = registerPlaceholderBlock("placeholder_block_51", MapColor.WARPED_STEM);
    public static final DeferredBlock<Block> PLACEHOLDER_BLOCK_52 = registerPlaceholderBlock("placeholder_block_52", MapColor.WARPED_HYPHAE);
    public static final DeferredBlock<Block> PLACEHOLDER_BLOCK_53 = registerPlaceholderBlock("placeholder_block_53", MapColor.WARPED_WART_BLOCK);
    public static final DeferredBlock<Block> PLACEHOLDER_BLOCK_54 = registerPlaceholderBlock("placeholder_block_54", MapColor.RAW_IRON);
    public static final DeferredBlock<Block> PLACEHOLDER_BLOCK_55 = registerPlaceholderBlock("placeholder_block_55", MapColor.TERRACOTTA_PINK);
    public static final DeferredBlock<Block> PLACEHOLDER_BLOCK_56 = registerPlaceholderBlock("placeholder_block_56", MapColor.TERRACOTTA_CYAN);
    public static final DeferredBlock<Block> PLACEHOLDER_BLOCK_57 = registerPlaceholderBlock("placeholder_block_57", MapColor.COLOR_LIGHT_GREEN);
    public static final DeferredBlock<Block> PLACEHOLDER_BLOCK_58 = registerPlaceholderBlock("placeholder_block_58", MapColor.TERRACOTTA_GRAY);
    public static final DeferredBlock<Block> PLACEHOLDER_BLOCK_59 = registerPlaceholderBlock("placeholder_block_59", MapColor.TERRACOTTA_LIGHT_GRAY);
    public static final DeferredBlock<Block> PLACEHOLDER_BLOCK_60 = registerPlaceholderBlock("placeholder_block_60", MapColor.TERRACOTTA_MAGENTA);
    public static final DeferredBlock<Block> PLACEHOLDER_BLOCK_61 = registerPlaceholderBlock("placeholder_block_61", MapColor.NONE);
    public static final DeferredBlock<Block> PLACEHOLDER_BLOCK_62 = registerPlaceholderBlock("placeholder_block_62", MapColor.COLOR_ORANGE);
    public static final DeferredBlock<Block> PLACEHOLDER_BLOCK_63 = registerPlaceholderBlock("placeholder_block_63", MapColor.GOLD);
    // Creating more color variations by mixing existing MapColors with different intensities
    public static final DeferredBlock<Block> PLACEHOLDER_BLOCK_64 = registerPlaceholderBlock("placeholder_block_64", MapColor.COLOR_RED);
    public static final DeferredBlock<Block> PLACEHOLDER_BLOCK_65 = registerPlaceholderBlock("placeholder_block_65", MapColor.COLOR_ORANGE);
    public static final DeferredBlock<Block> PLACEHOLDER_BLOCK_66 = registerPlaceholderBlock("placeholder_block_66", MapColor.COLOR_YELLOW);
    public static final DeferredBlock<Block> PLACEHOLDER_BLOCK_67 = registerPlaceholderBlock("placeholder_block_67", MapColor.COLOR_GREEN);
    public static final DeferredBlock<Block> PLACEHOLDER_BLOCK_68 = registerPlaceholderBlock("placeholder_block_68", MapColor.COLOR_LIGHT_BLUE);
    public static final DeferredBlock<Block> PLACEHOLDER_BLOCK_69 = registerPlaceholderBlock("placeholder_block_69", MapColor.COLOR_BLUE);
    public static final DeferredBlock<Block> PLACEHOLDER_BLOCK_70 = registerPlaceholderBlock("placeholder_block_70", MapColor.COLOR_PURPLE);
    public static final DeferredBlock<Block> PLACEHOLDER_BLOCK_71 = registerPlaceholderBlock("placeholder_block_71", MapColor.COLOR_PINK);
    public static final DeferredBlock<Block> PLACEHOLDER_BLOCK_72 = registerPlaceholderBlock("placeholder_block_72", MapColor.COLOR_MAGENTA);
    public static final DeferredBlock<Block> PLACEHOLDER_BLOCK_73 = registerPlaceholderBlock("placeholder_block_73", MapColor.COLOR_BLACK);
    public static final DeferredBlock<Block> PLACEHOLDER_BLOCK_74 = registerPlaceholderBlock("placeholder_block_74", MapColor.STONE);
    public static final DeferredBlock<Block> PLACEHOLDER_BLOCK_75 = registerPlaceholderBlock("placeholder_block_75", MapColor.DIRT);
    public static final DeferredBlock<Block> PLACEHOLDER_BLOCK_76 = registerPlaceholderBlock("placeholder_block_76", MapColor.WOOD);
    public static final DeferredBlock<Block> PLACEHOLDER_BLOCK_77 = registerPlaceholderBlock("placeholder_block_77", MapColor.QUARTZ);
    public static final DeferredBlock<Block> PLACEHOLDER_BLOCK_78 = registerPlaceholderBlock("placeholder_block_78", MapColor.NETHER);
    public static final DeferredBlock<Block> PLACEHOLDER_BLOCK_79 = registerPlaceholderBlock("placeholder_block_79", MapColor.DEEPSLATE);
    public static final DeferredBlock<Block> PLACEHOLDER_BLOCK_80 = registerPlaceholderBlock("placeholder_block_80", MapColor.CLAY);
    public static final DeferredBlock<Block> PLACEHOLDER_BLOCK_81 = registerPlaceholderBlock("placeholder_block_81", MapColor.GRASS);
    public static final DeferredBlock<Block> PLACEHOLDER_BLOCK_82 = registerPlaceholderBlock("placeholder_block_82", MapColor.EMERALD);
    public static final DeferredBlock<Block> PLACEHOLDER_BLOCK_83 = registerPlaceholderBlock("placeholder_block_83", MapColor.PODZOL);
    public static final DeferredBlock<Block> PLACEHOLDER_BLOCK_84 = registerPlaceholderBlock("placeholder_block_84", MapColor.TERRACOTTA_WHITE);
    public static final DeferredBlock<Block> PLACEHOLDER_BLOCK_85 = registerPlaceholderBlock("placeholder_block_85", MapColor.TERRACOTTA_ORANGE);
    public static final DeferredBlock<Block> PLACEHOLDER_BLOCK_86 = registerPlaceholderBlock("placeholder_block_86", MapColor.TERRACOTTA_YELLOW);
    public static final DeferredBlock<Block> PLACEHOLDER_BLOCK_87 = registerPlaceholderBlock("placeholder_block_87", MapColor.COLOR_LIGHT_GREEN);
    public static final DeferredBlock<Block> PLACEHOLDER_BLOCK_88 = registerPlaceholderBlock("placeholder_block_88", MapColor.TERRACOTTA_GREEN);
    public static final DeferredBlock<Block> PLACEHOLDER_BLOCK_89 = registerPlaceholderBlock("placeholder_block_89", MapColor.TERRACOTTA_CYAN);
    public static final DeferredBlock<Block> PLACEHOLDER_BLOCK_90 = registerPlaceholderBlock("placeholder_block_90", MapColor.TERRACOTTA_LIGHT_BLUE);
    public static final DeferredBlock<Block> PLACEHOLDER_BLOCK_91 = registerPlaceholderBlock("placeholder_block_91", MapColor.TERRACOTTA_BLUE);
    public static final DeferredBlock<Block> PLACEHOLDER_BLOCK_92 = registerPlaceholderBlock("placeholder_block_92", MapColor.TERRACOTTA_PURPLE);
    public static final DeferredBlock<Block> PLACEHOLDER_BLOCK_93 = registerPlaceholderBlock("placeholder_block_93", MapColor.TERRACOTTA_MAGENTA);
    public static final DeferredBlock<Block> PLACEHOLDER_BLOCK_94 = registerPlaceholderBlock("placeholder_block_94", MapColor.TERRACOTTA_PINK);
    public static final DeferredBlock<Block> PLACEHOLDER_BLOCK_95 = registerPlaceholderBlock("placeholder_block_95", MapColor.TERRACOTTA_GRAY);
    public static final DeferredBlock<Block> PLACEHOLDER_BLOCK_96 = registerPlaceholderBlock("placeholder_block_96", MapColor.TERRACOTTA_LIGHT_GRAY);
    public static final DeferredBlock<Block> PLACEHOLDER_BLOCK_97 = registerPlaceholderBlock("placeholder_block_97", MapColor.TERRACOTTA_BROWN);
    public static final DeferredBlock<Block> PLACEHOLDER_BLOCK_98 = registerPlaceholderBlock("placeholder_block_98", MapColor.TERRACOTTA_RED);
    public static final DeferredBlock<Block> PLACEHOLDER_BLOCK_99 = registerPlaceholderBlock("placeholder_block_99", MapColor.TERRACOTTA_BLACK);
    public static final DeferredBlock<Block> PLACEHOLDER_BLOCK_100 = registerPlaceholderBlock("placeholder_block_100", MapColor.GOLD);
    public static final DeferredBlock<Block> PLACEHOLDER_BLOCK_101 = registerPlaceholderBlock("placeholder_block_101", MapColor.DIAMOND);
    public static final DeferredBlock<Block> PLACEHOLDER_BLOCK_102 = registerPlaceholderBlock("placeholder_block_102", MapColor.LAPIS);
    public static final DeferredBlock<Block> PLACEHOLDER_BLOCK_103 = registerPlaceholderBlock("placeholder_block_103", MapColor.EMERALD);
    public static final DeferredBlock<Block> PLACEHOLDER_BLOCK_104 = registerPlaceholderBlock("placeholder_block_104", MapColor.PODZOL);
    public static final DeferredBlock<Block> PLACEHOLDER_BLOCK_105 = registerPlaceholderBlock("placeholder_block_105", MapColor.SAND);
    public static final DeferredBlock<Block> PLACEHOLDER_BLOCK_106 = registerPlaceholderBlock("placeholder_block_106", MapColor.SNOW);
    public static final DeferredBlock<Block> PLACEHOLDER_BLOCK_107 = registerPlaceholderBlock("placeholder_block_107", MapColor.WOOL);
    public static final DeferredBlock<Block> PLACEHOLDER_BLOCK_108 = registerPlaceholderBlock("placeholder_block_108", MapColor.COLOR_ORANGE);
    public static final DeferredBlock<Block> PLACEHOLDER_BLOCK_109 = registerPlaceholderBlock("placeholder_block_109", MapColor.COLOR_MAGENTA);
    public static final DeferredBlock<Block> PLACEHOLDER_BLOCK_110 = registerPlaceholderBlock("placeholder_block_110", MapColor.COLOR_LIGHT_BLUE);
    public static final DeferredBlock<Block> PLACEHOLDER_BLOCK_111 = registerPlaceholderBlock("placeholder_block_111", MapColor.COLOR_YELLOW);
    public static final DeferredBlock<Block> PLACEHOLDER_BLOCK_112 = registerPlaceholderBlock("placeholder_block_112", MapColor.COLOR_LIGHT_GREEN);
    public static final DeferredBlock<Block> PLACEHOLDER_BLOCK_113 = registerPlaceholderBlock("placeholder_block_113", MapColor.COLOR_PINK);
    public static final DeferredBlock<Block> PLACEHOLDER_BLOCK_114 = registerPlaceholderBlock("placeholder_block_114", MapColor.COLOR_GRAY);
    public static final DeferredBlock<Block> PLACEHOLDER_BLOCK_115 = registerPlaceholderBlock("placeholder_block_115", MapColor.COLOR_LIGHT_GRAY);
    public static final DeferredBlock<Block> PLACEHOLDER_BLOCK_116 = registerPlaceholderBlock("placeholder_block_116", MapColor.COLOR_CYAN);
    public static final DeferredBlock<Block> PLACEHOLDER_BLOCK_117 = registerPlaceholderBlock("placeholder_block_117", MapColor.COLOR_PURPLE);
    public static final DeferredBlock<Block> PLACEHOLDER_BLOCK_118 = registerPlaceholderBlock("placeholder_block_118", MapColor.COLOR_BLUE);
    public static final DeferredBlock<Block> PLACEHOLDER_BLOCK_119 = registerPlaceholderBlock("placeholder_block_119", MapColor.COLOR_BROWN);
    public static final DeferredBlock<Block> PLACEHOLDER_BLOCK_120 = registerPlaceholderBlock("placeholder_block_120", MapColor.COLOR_GREEN);
    public static final DeferredBlock<Block> PLACEHOLDER_BLOCK_121 = registerPlaceholderBlock("placeholder_block_121", MapColor.COLOR_RED);
    public static final DeferredBlock<Block> PLACEHOLDER_BLOCK_122 = registerPlaceholderBlock("placeholder_block_122", MapColor.COLOR_BLACK);
    public static final DeferredBlock<Block> PLACEHOLDER_BLOCK_123 = registerPlaceholderBlock("placeholder_block_123", MapColor.GOLD);
    public static final DeferredBlock<Block> PLACEHOLDER_BLOCK_124 = registerPlaceholderBlock("placeholder_block_124", MapColor.WARPED_WART_BLOCK);
    public static final DeferredBlock<Block> PLACEHOLDER_BLOCK_125 = registerPlaceholderBlock("placeholder_block_125", MapColor.PLANT);
    public static final DeferredBlock<Block> PLACEHOLDER_BLOCK_126 = registerPlaceholderBlock("placeholder_block_126", MapColor.RAW_IRON);
    public static final DeferredBlock<Block> PLACEHOLDER_BLOCK_127 = registerPlaceholderBlock("placeholder_block_127", MapColor.GLOW_LICHEN);
    
    /**
     * Helper method to register a placeholder block with specific color
     */
    private static DeferredBlock<Block> registerPlaceholderBlock(String name, MapColor color) {
        return Failsafeblocks.BLOCKS.registerSimpleBlock(name, 
            BlockBehaviour.Properties.of()
                .mapColor(color)
                .strength(1.5f)
                .sound(SoundType.AMETHYST)
                .pushReaction(PushReaction.NORMAL)
                .noLootTable());
    }
} 