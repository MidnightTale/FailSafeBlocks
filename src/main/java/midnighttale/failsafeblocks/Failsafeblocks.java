package midnighttale.failsafeblocks;

import com.mojang.logging.LogUtils;
import midnighttale.failsafeblocks.blocks.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/neoforge.mods.toml file
@Mod(Failsafeblocks.MODID)
public class Failsafeblocks {
    // Define mod id in a common place for everything to reference
    public static final String MODID = "failsafeblocks";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();
    // Create a Deferred Register to hold Blocks which will all be registered under the "failsafeblocks" namespace
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MODID);
    // Create a Deferred Register to hold Items which will all be registered under the "failsafeblocks" namespace
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MODID);
    // Create a Deferred Register to hold CreativeModeTabs which will all be registered under the "failsafeblocks" namespace
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MODID);

    // Creates BlockItems for all placeholder blocks
    public static final DeferredItem<BlockItem> PLACEHOLDER_BLOCK_ITEM = ITEMS.registerSimpleBlockItem("placeholder_block", ModBlocks.PLACEHOLDER_BLOCK);
    public static final DeferredItem<BlockItem> PLACEHOLDER_BLOCK_ITEM_1 = ITEMS.registerSimpleBlockItem("placeholder_block_1", ModBlocks.PLACEHOLDER_BLOCK_1);
    public static final DeferredItem<BlockItem> PLACEHOLDER_BLOCK_ITEM_2 = ITEMS.registerSimpleBlockItem("placeholder_block_2", ModBlocks.PLACEHOLDER_BLOCK_2);
    public static final DeferredItem<BlockItem> PLACEHOLDER_BLOCK_ITEM_3 = ITEMS.registerSimpleBlockItem("placeholder_block_3", ModBlocks.PLACEHOLDER_BLOCK_3);
    public static final DeferredItem<BlockItem> PLACEHOLDER_BLOCK_ITEM_4 = ITEMS.registerSimpleBlockItem("placeholder_block_4", ModBlocks.PLACEHOLDER_BLOCK_4);
    public static final DeferredItem<BlockItem> PLACEHOLDER_BLOCK_ITEM_5 = ITEMS.registerSimpleBlockItem("placeholder_block_5", ModBlocks.PLACEHOLDER_BLOCK_5);
    public static final DeferredItem<BlockItem> PLACEHOLDER_BLOCK_ITEM_6 = ITEMS.registerSimpleBlockItem("placeholder_block_6", ModBlocks.PLACEHOLDER_BLOCK_6);
    public static final DeferredItem<BlockItem> PLACEHOLDER_BLOCK_ITEM_7 = ITEMS.registerSimpleBlockItem("placeholder_block_7", ModBlocks.PLACEHOLDER_BLOCK_7);
    public static final DeferredItem<BlockItem> PLACEHOLDER_BLOCK_ITEM_8 = ITEMS.registerSimpleBlockItem("placeholder_block_8", ModBlocks.PLACEHOLDER_BLOCK_8);
    public static final DeferredItem<BlockItem> PLACEHOLDER_BLOCK_ITEM_9 = ITEMS.registerSimpleBlockItem("placeholder_block_9", ModBlocks.PLACEHOLDER_BLOCK_9);
    public static final DeferredItem<BlockItem> PLACEHOLDER_BLOCK_ITEM_10 = ITEMS.registerSimpleBlockItem("placeholder_block_10", ModBlocks.PLACEHOLDER_BLOCK_10);
    public static final DeferredItem<BlockItem> PLACEHOLDER_BLOCK_ITEM_11 = ITEMS.registerSimpleBlockItem("placeholder_block_11", ModBlocks.PLACEHOLDER_BLOCK_11);
    public static final DeferredItem<BlockItem> PLACEHOLDER_BLOCK_ITEM_12 = ITEMS.registerSimpleBlockItem("placeholder_block_12", ModBlocks.PLACEHOLDER_BLOCK_12);
    public static final DeferredItem<BlockItem> PLACEHOLDER_BLOCK_ITEM_13 = ITEMS.registerSimpleBlockItem("placeholder_block_13", ModBlocks.PLACEHOLDER_BLOCK_13);
    public static final DeferredItem<BlockItem> PLACEHOLDER_BLOCK_ITEM_14 = ITEMS.registerSimpleBlockItem("placeholder_block_14", ModBlocks.PLACEHOLDER_BLOCK_14);
    public static final DeferredItem<BlockItem> PLACEHOLDER_BLOCK_ITEM_15 = ITEMS.registerSimpleBlockItem("placeholder_block_15", ModBlocks.PLACEHOLDER_BLOCK_15);
    public static final DeferredItem<BlockItem> PLACEHOLDER_BLOCK_ITEM_16 = ITEMS.registerSimpleBlockItem("placeholder_block_16", ModBlocks.PLACEHOLDER_BLOCK_16);
    public static final DeferredItem<BlockItem> PLACEHOLDER_BLOCK_ITEM_17 = ITEMS.registerSimpleBlockItem("placeholder_block_17", ModBlocks.PLACEHOLDER_BLOCK_17);
    public static final DeferredItem<BlockItem> PLACEHOLDER_BLOCK_ITEM_18 = ITEMS.registerSimpleBlockItem("placeholder_block_18", ModBlocks.PLACEHOLDER_BLOCK_18);
    public static final DeferredItem<BlockItem> PLACEHOLDER_BLOCK_ITEM_19 = ITEMS.registerSimpleBlockItem("placeholder_block_19", ModBlocks.PLACEHOLDER_BLOCK_19);
    public static final DeferredItem<BlockItem> PLACEHOLDER_BLOCK_ITEM_20 = ITEMS.registerSimpleBlockItem("placeholder_block_20", ModBlocks.PLACEHOLDER_BLOCK_20);
    public static final DeferredItem<BlockItem> PLACEHOLDER_BLOCK_ITEM_21 = ITEMS.registerSimpleBlockItem("placeholder_block_21", ModBlocks.PLACEHOLDER_BLOCK_21);
    public static final DeferredItem<BlockItem> PLACEHOLDER_BLOCK_ITEM_22 = ITEMS.registerSimpleBlockItem("placeholder_block_22", ModBlocks.PLACEHOLDER_BLOCK_22);
    public static final DeferredItem<BlockItem> PLACEHOLDER_BLOCK_ITEM_23 = ITEMS.registerSimpleBlockItem("placeholder_block_23", ModBlocks.PLACEHOLDER_BLOCK_23);
    public static final DeferredItem<BlockItem> PLACEHOLDER_BLOCK_ITEM_24 = ITEMS.registerSimpleBlockItem("placeholder_block_24", ModBlocks.PLACEHOLDER_BLOCK_24);
    public static final DeferredItem<BlockItem> PLACEHOLDER_BLOCK_ITEM_25 = ITEMS.registerSimpleBlockItem("placeholder_block_25", ModBlocks.PLACEHOLDER_BLOCK_25);
    public static final DeferredItem<BlockItem> PLACEHOLDER_BLOCK_ITEM_26 = ITEMS.registerSimpleBlockItem("placeholder_block_26", ModBlocks.PLACEHOLDER_BLOCK_26);
    public static final DeferredItem<BlockItem> PLACEHOLDER_BLOCK_ITEM_27 = ITEMS.registerSimpleBlockItem("placeholder_block_27", ModBlocks.PLACEHOLDER_BLOCK_27);
    
    // Additional BlockItems for the expanded capacity (blocks 28-127)
    public static final DeferredItem<BlockItem> PLACEHOLDER_BLOCK_ITEM_28 = ITEMS.registerSimpleBlockItem("placeholder_block_28", ModBlocks.PLACEHOLDER_BLOCK_28);
    public static final DeferredItem<BlockItem> PLACEHOLDER_BLOCK_ITEM_29 = ITEMS.registerSimpleBlockItem("placeholder_block_29", ModBlocks.PLACEHOLDER_BLOCK_29);
    public static final DeferredItem<BlockItem> PLACEHOLDER_BLOCK_ITEM_30 = ITEMS.registerSimpleBlockItem("placeholder_block_30", ModBlocks.PLACEHOLDER_BLOCK_30);
    public static final DeferredItem<BlockItem> PLACEHOLDER_BLOCK_ITEM_31 = ITEMS.registerSimpleBlockItem("placeholder_block_31", ModBlocks.PLACEHOLDER_BLOCK_31);
    public static final DeferredItem<BlockItem> PLACEHOLDER_BLOCK_ITEM_32 = ITEMS.registerSimpleBlockItem("placeholder_block_32", ModBlocks.PLACEHOLDER_BLOCK_32);
    public static final DeferredItem<BlockItem> PLACEHOLDER_BLOCK_ITEM_33 = ITEMS.registerSimpleBlockItem("placeholder_block_33", ModBlocks.PLACEHOLDER_BLOCK_33);
    public static final DeferredItem<BlockItem> PLACEHOLDER_BLOCK_ITEM_34 = ITEMS.registerSimpleBlockItem("placeholder_block_34", ModBlocks.PLACEHOLDER_BLOCK_34);
    public static final DeferredItem<BlockItem> PLACEHOLDER_BLOCK_ITEM_35 = ITEMS.registerSimpleBlockItem("placeholder_block_35", ModBlocks.PLACEHOLDER_BLOCK_35);
    public static final DeferredItem<BlockItem> PLACEHOLDER_BLOCK_ITEM_36 = ITEMS.registerSimpleBlockItem("placeholder_block_36", ModBlocks.PLACEHOLDER_BLOCK_36);
    public static final DeferredItem<BlockItem> PLACEHOLDER_BLOCK_ITEM_37 = ITEMS.registerSimpleBlockItem("placeholder_block_37", ModBlocks.PLACEHOLDER_BLOCK_37);
    public static final DeferredItem<BlockItem> PLACEHOLDER_BLOCK_ITEM_38 = ITEMS.registerSimpleBlockItem("placeholder_block_38", ModBlocks.PLACEHOLDER_BLOCK_38);
    public static final DeferredItem<BlockItem> PLACEHOLDER_BLOCK_ITEM_39 = ITEMS.registerSimpleBlockItem("placeholder_block_39", ModBlocks.PLACEHOLDER_BLOCK_39);
    public static final DeferredItem<BlockItem> PLACEHOLDER_BLOCK_ITEM_40 = ITEMS.registerSimpleBlockItem("placeholder_block_40", ModBlocks.PLACEHOLDER_BLOCK_40);
    public static final DeferredItem<BlockItem> PLACEHOLDER_BLOCK_ITEM_41 = ITEMS.registerSimpleBlockItem("placeholder_block_41", ModBlocks.PLACEHOLDER_BLOCK_41);
    public static final DeferredItem<BlockItem> PLACEHOLDER_BLOCK_ITEM_42 = ITEMS.registerSimpleBlockItem("placeholder_block_42", ModBlocks.PLACEHOLDER_BLOCK_42);
    public static final DeferredItem<BlockItem> PLACEHOLDER_BLOCK_ITEM_43 = ITEMS.registerSimpleBlockItem("placeholder_block_43", ModBlocks.PLACEHOLDER_BLOCK_43);
    public static final DeferredItem<BlockItem> PLACEHOLDER_BLOCK_ITEM_44 = ITEMS.registerSimpleBlockItem("placeholder_block_44", ModBlocks.PLACEHOLDER_BLOCK_44);
    public static final DeferredItem<BlockItem> PLACEHOLDER_BLOCK_ITEM_45 = ITEMS.registerSimpleBlockItem("placeholder_block_45", ModBlocks.PLACEHOLDER_BLOCK_45);
    public static final DeferredItem<BlockItem> PLACEHOLDER_BLOCK_ITEM_46 = ITEMS.registerSimpleBlockItem("placeholder_block_46", ModBlocks.PLACEHOLDER_BLOCK_46);
    public static final DeferredItem<BlockItem> PLACEHOLDER_BLOCK_ITEM_47 = ITEMS.registerSimpleBlockItem("placeholder_block_47", ModBlocks.PLACEHOLDER_BLOCK_47);
    public static final DeferredItem<BlockItem> PLACEHOLDER_BLOCK_ITEM_48 = ITEMS.registerSimpleBlockItem("placeholder_block_48", ModBlocks.PLACEHOLDER_BLOCK_48);
    public static final DeferredItem<BlockItem> PLACEHOLDER_BLOCK_ITEM_49 = ITEMS.registerSimpleBlockItem("placeholder_block_49", ModBlocks.PLACEHOLDER_BLOCK_49);
    public static final DeferredItem<BlockItem> PLACEHOLDER_BLOCK_ITEM_50 = ITEMS.registerSimpleBlockItem("placeholder_block_50", ModBlocks.PLACEHOLDER_BLOCK_50);
    public static final DeferredItem<BlockItem> PLACEHOLDER_BLOCK_ITEM_51 = ITEMS.registerSimpleBlockItem("placeholder_block_51", ModBlocks.PLACEHOLDER_BLOCK_51);
    public static final DeferredItem<BlockItem> PLACEHOLDER_BLOCK_ITEM_52 = ITEMS.registerSimpleBlockItem("placeholder_block_52", ModBlocks.PLACEHOLDER_BLOCK_52);
    public static final DeferredItem<BlockItem> PLACEHOLDER_BLOCK_ITEM_53 = ITEMS.registerSimpleBlockItem("placeholder_block_53", ModBlocks.PLACEHOLDER_BLOCK_53);
    public static final DeferredItem<BlockItem> PLACEHOLDER_BLOCK_ITEM_54 = ITEMS.registerSimpleBlockItem("placeholder_block_54", ModBlocks.PLACEHOLDER_BLOCK_54);
    public static final DeferredItem<BlockItem> PLACEHOLDER_BLOCK_ITEM_55 = ITEMS.registerSimpleBlockItem("placeholder_block_55", ModBlocks.PLACEHOLDER_BLOCK_55);
    public static final DeferredItem<BlockItem> PLACEHOLDER_BLOCK_ITEM_56 = ITEMS.registerSimpleBlockItem("placeholder_block_56", ModBlocks.PLACEHOLDER_BLOCK_56);
    public static final DeferredItem<BlockItem> PLACEHOLDER_BLOCK_ITEM_57 = ITEMS.registerSimpleBlockItem("placeholder_block_57", ModBlocks.PLACEHOLDER_BLOCK_57);
    public static final DeferredItem<BlockItem> PLACEHOLDER_BLOCK_ITEM_58 = ITEMS.registerSimpleBlockItem("placeholder_block_58", ModBlocks.PLACEHOLDER_BLOCK_58);
    public static final DeferredItem<BlockItem> PLACEHOLDER_BLOCK_ITEM_59 = ITEMS.registerSimpleBlockItem("placeholder_block_59", ModBlocks.PLACEHOLDER_BLOCK_59);
    public static final DeferredItem<BlockItem> PLACEHOLDER_BLOCK_ITEM_60 = ITEMS.registerSimpleBlockItem("placeholder_block_60", ModBlocks.PLACEHOLDER_BLOCK_60);
    public static final DeferredItem<BlockItem> PLACEHOLDER_BLOCK_ITEM_61 = ITEMS.registerSimpleBlockItem("placeholder_block_61", ModBlocks.PLACEHOLDER_BLOCK_61);
    public static final DeferredItem<BlockItem> PLACEHOLDER_BLOCK_ITEM_62 = ITEMS.registerSimpleBlockItem("placeholder_block_62", ModBlocks.PLACEHOLDER_BLOCK_62);
    public static final DeferredItem<BlockItem> PLACEHOLDER_BLOCK_ITEM_63 = ITEMS.registerSimpleBlockItem("placeholder_block_63", ModBlocks.PLACEHOLDER_BLOCK_63);
    public static final DeferredItem<BlockItem> PLACEHOLDER_BLOCK_ITEM_64 = ITEMS.registerSimpleBlockItem("placeholder_block_64", ModBlocks.PLACEHOLDER_BLOCK_64);
    public static final DeferredItem<BlockItem> PLACEHOLDER_BLOCK_ITEM_65 = ITEMS.registerSimpleBlockItem("placeholder_block_65", ModBlocks.PLACEHOLDER_BLOCK_65);
    public static final DeferredItem<BlockItem> PLACEHOLDER_BLOCK_ITEM_66 = ITEMS.registerSimpleBlockItem("placeholder_block_66", ModBlocks.PLACEHOLDER_BLOCK_66);
    public static final DeferredItem<BlockItem> PLACEHOLDER_BLOCK_ITEM_67 = ITEMS.registerSimpleBlockItem("placeholder_block_67", ModBlocks.PLACEHOLDER_BLOCK_67);
    public static final DeferredItem<BlockItem> PLACEHOLDER_BLOCK_ITEM_68 = ITEMS.registerSimpleBlockItem("placeholder_block_68", ModBlocks.PLACEHOLDER_BLOCK_68);
    public static final DeferredItem<BlockItem> PLACEHOLDER_BLOCK_ITEM_69 = ITEMS.registerSimpleBlockItem("placeholder_block_69", ModBlocks.PLACEHOLDER_BLOCK_69);
    public static final DeferredItem<BlockItem> PLACEHOLDER_BLOCK_ITEM_70 = ITEMS.registerSimpleBlockItem("placeholder_block_70", ModBlocks.PLACEHOLDER_BLOCK_70);
    public static final DeferredItem<BlockItem> PLACEHOLDER_BLOCK_ITEM_71 = ITEMS.registerSimpleBlockItem("placeholder_block_71", ModBlocks.PLACEHOLDER_BLOCK_71);
    public static final DeferredItem<BlockItem> PLACEHOLDER_BLOCK_ITEM_72 = ITEMS.registerSimpleBlockItem("placeholder_block_72", ModBlocks.PLACEHOLDER_BLOCK_72);
    public static final DeferredItem<BlockItem> PLACEHOLDER_BLOCK_ITEM_73 = ITEMS.registerSimpleBlockItem("placeholder_block_73", ModBlocks.PLACEHOLDER_BLOCK_73);
    public static final DeferredItem<BlockItem> PLACEHOLDER_BLOCK_ITEM_74 = ITEMS.registerSimpleBlockItem("placeholder_block_74", ModBlocks.PLACEHOLDER_BLOCK_74);
    public static final DeferredItem<BlockItem> PLACEHOLDER_BLOCK_ITEM_75 = ITEMS.registerSimpleBlockItem("placeholder_block_75", ModBlocks.PLACEHOLDER_BLOCK_75);
    public static final DeferredItem<BlockItem> PLACEHOLDER_BLOCK_ITEM_76 = ITEMS.registerSimpleBlockItem("placeholder_block_76", ModBlocks.PLACEHOLDER_BLOCK_76);
    public static final DeferredItem<BlockItem> PLACEHOLDER_BLOCK_ITEM_77 = ITEMS.registerSimpleBlockItem("placeholder_block_77", ModBlocks.PLACEHOLDER_BLOCK_77);
    public static final DeferredItem<BlockItem> PLACEHOLDER_BLOCK_ITEM_78 = ITEMS.registerSimpleBlockItem("placeholder_block_78", ModBlocks.PLACEHOLDER_BLOCK_78);
    public static final DeferredItem<BlockItem> PLACEHOLDER_BLOCK_ITEM_79 = ITEMS.registerSimpleBlockItem("placeholder_block_79", ModBlocks.PLACEHOLDER_BLOCK_79);
    public static final DeferredItem<BlockItem> PLACEHOLDER_BLOCK_ITEM_80 = ITEMS.registerSimpleBlockItem("placeholder_block_80", ModBlocks.PLACEHOLDER_BLOCK_80);
    public static final DeferredItem<BlockItem> PLACEHOLDER_BLOCK_ITEM_81 = ITEMS.registerSimpleBlockItem("placeholder_block_81", ModBlocks.PLACEHOLDER_BLOCK_81);
    public static final DeferredItem<BlockItem> PLACEHOLDER_BLOCK_ITEM_82 = ITEMS.registerSimpleBlockItem("placeholder_block_82", ModBlocks.PLACEHOLDER_BLOCK_82);
    public static final DeferredItem<BlockItem> PLACEHOLDER_BLOCK_ITEM_83 = ITEMS.registerSimpleBlockItem("placeholder_block_83", ModBlocks.PLACEHOLDER_BLOCK_83);
    public static final DeferredItem<BlockItem> PLACEHOLDER_BLOCK_ITEM_84 = ITEMS.registerSimpleBlockItem("placeholder_block_84", ModBlocks.PLACEHOLDER_BLOCK_84);
    public static final DeferredItem<BlockItem> PLACEHOLDER_BLOCK_ITEM_85 = ITEMS.registerSimpleBlockItem("placeholder_block_85", ModBlocks.PLACEHOLDER_BLOCK_85);
    public static final DeferredItem<BlockItem> PLACEHOLDER_BLOCK_ITEM_86 = ITEMS.registerSimpleBlockItem("placeholder_block_86", ModBlocks.PLACEHOLDER_BLOCK_86);
    public static final DeferredItem<BlockItem> PLACEHOLDER_BLOCK_ITEM_87 = ITEMS.registerSimpleBlockItem("placeholder_block_87", ModBlocks.PLACEHOLDER_BLOCK_87);
    public static final DeferredItem<BlockItem> PLACEHOLDER_BLOCK_ITEM_88 = ITEMS.registerSimpleBlockItem("placeholder_block_88", ModBlocks.PLACEHOLDER_BLOCK_88);
    public static final DeferredItem<BlockItem> PLACEHOLDER_BLOCK_ITEM_89 = ITEMS.registerSimpleBlockItem("placeholder_block_89", ModBlocks.PLACEHOLDER_BLOCK_89);
    public static final DeferredItem<BlockItem> PLACEHOLDER_BLOCK_ITEM_90 = ITEMS.registerSimpleBlockItem("placeholder_block_90", ModBlocks.PLACEHOLDER_BLOCK_90);
    public static final DeferredItem<BlockItem> PLACEHOLDER_BLOCK_ITEM_91 = ITEMS.registerSimpleBlockItem("placeholder_block_91", ModBlocks.PLACEHOLDER_BLOCK_91);
    public static final DeferredItem<BlockItem> PLACEHOLDER_BLOCK_ITEM_92 = ITEMS.registerSimpleBlockItem("placeholder_block_92", ModBlocks.PLACEHOLDER_BLOCK_92);
    public static final DeferredItem<BlockItem> PLACEHOLDER_BLOCK_ITEM_93 = ITEMS.registerSimpleBlockItem("placeholder_block_93", ModBlocks.PLACEHOLDER_BLOCK_93);
    public static final DeferredItem<BlockItem> PLACEHOLDER_BLOCK_ITEM_94 = ITEMS.registerSimpleBlockItem("placeholder_block_94", ModBlocks.PLACEHOLDER_BLOCK_94);
    public static final DeferredItem<BlockItem> PLACEHOLDER_BLOCK_ITEM_95 = ITEMS.registerSimpleBlockItem("placeholder_block_95", ModBlocks.PLACEHOLDER_BLOCK_95);
    public static final DeferredItem<BlockItem> PLACEHOLDER_BLOCK_ITEM_96 = ITEMS.registerSimpleBlockItem("placeholder_block_96", ModBlocks.PLACEHOLDER_BLOCK_96);
    public static final DeferredItem<BlockItem> PLACEHOLDER_BLOCK_ITEM_97 = ITEMS.registerSimpleBlockItem("placeholder_block_97", ModBlocks.PLACEHOLDER_BLOCK_97);
    public static final DeferredItem<BlockItem> PLACEHOLDER_BLOCK_ITEM_98 = ITEMS.registerSimpleBlockItem("placeholder_block_98", ModBlocks.PLACEHOLDER_BLOCK_98);
    public static final DeferredItem<BlockItem> PLACEHOLDER_BLOCK_ITEM_99 = ITEMS.registerSimpleBlockItem("placeholder_block_99", ModBlocks.PLACEHOLDER_BLOCK_99);
    public static final DeferredItem<BlockItem> PLACEHOLDER_BLOCK_ITEM_100 = ITEMS.registerSimpleBlockItem("placeholder_block_100", ModBlocks.PLACEHOLDER_BLOCK_100);
    public static final DeferredItem<BlockItem> PLACEHOLDER_BLOCK_ITEM_101 = ITEMS.registerSimpleBlockItem("placeholder_block_101", ModBlocks.PLACEHOLDER_BLOCK_101);
    public static final DeferredItem<BlockItem> PLACEHOLDER_BLOCK_ITEM_102 = ITEMS.registerSimpleBlockItem("placeholder_block_102", ModBlocks.PLACEHOLDER_BLOCK_102);
    public static final DeferredItem<BlockItem> PLACEHOLDER_BLOCK_ITEM_103 = ITEMS.registerSimpleBlockItem("placeholder_block_103", ModBlocks.PLACEHOLDER_BLOCK_103);
    public static final DeferredItem<BlockItem> PLACEHOLDER_BLOCK_ITEM_104 = ITEMS.registerSimpleBlockItem("placeholder_block_104", ModBlocks.PLACEHOLDER_BLOCK_104);
    public static final DeferredItem<BlockItem> PLACEHOLDER_BLOCK_ITEM_105 = ITEMS.registerSimpleBlockItem("placeholder_block_105", ModBlocks.PLACEHOLDER_BLOCK_105);
    public static final DeferredItem<BlockItem> PLACEHOLDER_BLOCK_ITEM_106 = ITEMS.registerSimpleBlockItem("placeholder_block_106", ModBlocks.PLACEHOLDER_BLOCK_106);
    public static final DeferredItem<BlockItem> PLACEHOLDER_BLOCK_ITEM_107 = ITEMS.registerSimpleBlockItem("placeholder_block_107", ModBlocks.PLACEHOLDER_BLOCK_107);
    public static final DeferredItem<BlockItem> PLACEHOLDER_BLOCK_ITEM_108 = ITEMS.registerSimpleBlockItem("placeholder_block_108", ModBlocks.PLACEHOLDER_BLOCK_108);
    public static final DeferredItem<BlockItem> PLACEHOLDER_BLOCK_ITEM_109 = ITEMS.registerSimpleBlockItem("placeholder_block_109", ModBlocks.PLACEHOLDER_BLOCK_109);
    public static final DeferredItem<BlockItem> PLACEHOLDER_BLOCK_ITEM_110 = ITEMS.registerSimpleBlockItem("placeholder_block_110", ModBlocks.PLACEHOLDER_BLOCK_110);
    public static final DeferredItem<BlockItem> PLACEHOLDER_BLOCK_ITEM_111 = ITEMS.registerSimpleBlockItem("placeholder_block_111", ModBlocks.PLACEHOLDER_BLOCK_111);
    public static final DeferredItem<BlockItem> PLACEHOLDER_BLOCK_ITEM_112 = ITEMS.registerSimpleBlockItem("placeholder_block_112", ModBlocks.PLACEHOLDER_BLOCK_112);
    public static final DeferredItem<BlockItem> PLACEHOLDER_BLOCK_ITEM_113 = ITEMS.registerSimpleBlockItem("placeholder_block_113", ModBlocks.PLACEHOLDER_BLOCK_113);
    public static final DeferredItem<BlockItem> PLACEHOLDER_BLOCK_ITEM_114 = ITEMS.registerSimpleBlockItem("placeholder_block_114", ModBlocks.PLACEHOLDER_BLOCK_114);
    public static final DeferredItem<BlockItem> PLACEHOLDER_BLOCK_ITEM_115 = ITEMS.registerSimpleBlockItem("placeholder_block_115", ModBlocks.PLACEHOLDER_BLOCK_115);
    public static final DeferredItem<BlockItem> PLACEHOLDER_BLOCK_ITEM_116 = ITEMS.registerSimpleBlockItem("placeholder_block_116", ModBlocks.PLACEHOLDER_BLOCK_116);
    public static final DeferredItem<BlockItem> PLACEHOLDER_BLOCK_ITEM_117 = ITEMS.registerSimpleBlockItem("placeholder_block_117", ModBlocks.PLACEHOLDER_BLOCK_117);
    public static final DeferredItem<BlockItem> PLACEHOLDER_BLOCK_ITEM_118 = ITEMS.registerSimpleBlockItem("placeholder_block_118", ModBlocks.PLACEHOLDER_BLOCK_118);
    public static final DeferredItem<BlockItem> PLACEHOLDER_BLOCK_ITEM_119 = ITEMS.registerSimpleBlockItem("placeholder_block_119", ModBlocks.PLACEHOLDER_BLOCK_119);
    public static final DeferredItem<BlockItem> PLACEHOLDER_BLOCK_ITEM_120 = ITEMS.registerSimpleBlockItem("placeholder_block_120", ModBlocks.PLACEHOLDER_BLOCK_120);
    public static final DeferredItem<BlockItem> PLACEHOLDER_BLOCK_ITEM_121 = ITEMS.registerSimpleBlockItem("placeholder_block_121", ModBlocks.PLACEHOLDER_BLOCK_121);
    public static final DeferredItem<BlockItem> PLACEHOLDER_BLOCK_ITEM_122 = ITEMS.registerSimpleBlockItem("placeholder_block_122", ModBlocks.PLACEHOLDER_BLOCK_122);
    public static final DeferredItem<BlockItem> PLACEHOLDER_BLOCK_ITEM_123 = ITEMS.registerSimpleBlockItem("placeholder_block_123", ModBlocks.PLACEHOLDER_BLOCK_123);
    public static final DeferredItem<BlockItem> PLACEHOLDER_BLOCK_ITEM_124 = ITEMS.registerSimpleBlockItem("placeholder_block_124", ModBlocks.PLACEHOLDER_BLOCK_124);
    public static final DeferredItem<BlockItem> PLACEHOLDER_BLOCK_ITEM_125 = ITEMS.registerSimpleBlockItem("placeholder_block_125", ModBlocks.PLACEHOLDER_BLOCK_125);
    public static final DeferredItem<BlockItem> PLACEHOLDER_BLOCK_ITEM_126 = ITEMS.registerSimpleBlockItem("placeholder_block_126", ModBlocks.PLACEHOLDER_BLOCK_126);
    public static final DeferredItem<BlockItem> PLACEHOLDER_BLOCK_ITEM_127 = ITEMS.registerSimpleBlockItem("placeholder_block_127", ModBlocks.PLACEHOLDER_BLOCK_127);

    // Creates a creative tab with the id "failsafeblocks:placeholder_tab" for the placeholder blocks
    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> PLACEHOLDER_TAB = CREATIVE_MODE_TABS.register("placeholder_tab", () -> 
        CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.failsafeblocks"))
            .icon(() -> PLACEHOLDER_BLOCK_ITEM.get().getDefaultInstance())
            .displayItems((parameters, output) -> {
                // Add all placeholder blocks to the creative tab
                output.accept(PLACEHOLDER_BLOCK_ITEM.get());
                output.accept(PLACEHOLDER_BLOCK_ITEM_1.get());
                output.accept(PLACEHOLDER_BLOCK_ITEM_2.get());
                output.accept(PLACEHOLDER_BLOCK_ITEM_3.get());
                output.accept(PLACEHOLDER_BLOCK_ITEM_4.get());
                output.accept(PLACEHOLDER_BLOCK_ITEM_5.get());
                output.accept(PLACEHOLDER_BLOCK_ITEM_6.get());
                output.accept(PLACEHOLDER_BLOCK_ITEM_7.get());
                output.accept(PLACEHOLDER_BLOCK_ITEM_8.get());
                output.accept(PLACEHOLDER_BLOCK_ITEM_9.get());
                output.accept(PLACEHOLDER_BLOCK_ITEM_10.get());
                output.accept(PLACEHOLDER_BLOCK_ITEM_11.get());
                output.accept(PLACEHOLDER_BLOCK_ITEM_12.get());
                output.accept(PLACEHOLDER_BLOCK_ITEM_13.get());
                output.accept(PLACEHOLDER_BLOCK_ITEM_14.get());
                output.accept(PLACEHOLDER_BLOCK_ITEM_15.get());
                output.accept(PLACEHOLDER_BLOCK_ITEM_16.get());
                output.accept(PLACEHOLDER_BLOCK_ITEM_17.get());
                output.accept(PLACEHOLDER_BLOCK_ITEM_18.get());
                output.accept(PLACEHOLDER_BLOCK_ITEM_19.get());
                output.accept(PLACEHOLDER_BLOCK_ITEM_20.get());
                output.accept(PLACEHOLDER_BLOCK_ITEM_21.get());
                output.accept(PLACEHOLDER_BLOCK_ITEM_22.get());
                output.accept(PLACEHOLDER_BLOCK_ITEM_23.get());
                output.accept(PLACEHOLDER_BLOCK_ITEM_24.get());
                output.accept(PLACEHOLDER_BLOCK_ITEM_25.get());
                output.accept(PLACEHOLDER_BLOCK_ITEM_26.get());
                output.accept(PLACEHOLDER_BLOCK_ITEM_27.get());
                output.accept(PLACEHOLDER_BLOCK_ITEM_28.get());
                output.accept(PLACEHOLDER_BLOCK_ITEM_29.get());
                output.accept(PLACEHOLDER_BLOCK_ITEM_30.get());
                output.accept(PLACEHOLDER_BLOCK_ITEM_31.get());
                output.accept(PLACEHOLDER_BLOCK_ITEM_32.get());
                output.accept(PLACEHOLDER_BLOCK_ITEM_33.get());
                output.accept(PLACEHOLDER_BLOCK_ITEM_34.get());
                output.accept(PLACEHOLDER_BLOCK_ITEM_35.get());
                output.accept(PLACEHOLDER_BLOCK_ITEM_36.get());
                output.accept(PLACEHOLDER_BLOCK_ITEM_37.get());
                output.accept(PLACEHOLDER_BLOCK_ITEM_38.get());
                output.accept(PLACEHOLDER_BLOCK_ITEM_39.get());
                output.accept(PLACEHOLDER_BLOCK_ITEM_40.get());
                output.accept(PLACEHOLDER_BLOCK_ITEM_41.get());
                output.accept(PLACEHOLDER_BLOCK_ITEM_42.get());
                output.accept(PLACEHOLDER_BLOCK_ITEM_43.get());
                output.accept(PLACEHOLDER_BLOCK_ITEM_44.get());
                output.accept(PLACEHOLDER_BLOCK_ITEM_45.get());
                output.accept(PLACEHOLDER_BLOCK_ITEM_46.get());
                output.accept(PLACEHOLDER_BLOCK_ITEM_47.get());
                output.accept(PLACEHOLDER_BLOCK_ITEM_48.get());
                output.accept(PLACEHOLDER_BLOCK_ITEM_49.get());
                output.accept(PLACEHOLDER_BLOCK_ITEM_50.get());
                output.accept(PLACEHOLDER_BLOCK_ITEM_51.get());
                output.accept(PLACEHOLDER_BLOCK_ITEM_52.get());
                output.accept(PLACEHOLDER_BLOCK_ITEM_53.get());
                output.accept(PLACEHOLDER_BLOCK_ITEM_54.get());
                output.accept(PLACEHOLDER_BLOCK_ITEM_55.get());
                output.accept(PLACEHOLDER_BLOCK_ITEM_56.get());
                output.accept(PLACEHOLDER_BLOCK_ITEM_57.get());
                output.accept(PLACEHOLDER_BLOCK_ITEM_58.get());
                output.accept(PLACEHOLDER_BLOCK_ITEM_59.get());
                output.accept(PLACEHOLDER_BLOCK_ITEM_60.get());
                output.accept(PLACEHOLDER_BLOCK_ITEM_61.get());
                output.accept(PLACEHOLDER_BLOCK_ITEM_62.get());
                output.accept(PLACEHOLDER_BLOCK_ITEM_63.get());
                output.accept(PLACEHOLDER_BLOCK_ITEM_64.get());
                output.accept(PLACEHOLDER_BLOCK_ITEM_65.get());
                output.accept(PLACEHOLDER_BLOCK_ITEM_66.get());
                output.accept(PLACEHOLDER_BLOCK_ITEM_67.get());
                output.accept(PLACEHOLDER_BLOCK_ITEM_68.get());
                output.accept(PLACEHOLDER_BLOCK_ITEM_69.get());
                output.accept(PLACEHOLDER_BLOCK_ITEM_70.get());
                output.accept(PLACEHOLDER_BLOCK_ITEM_71.get());
                output.accept(PLACEHOLDER_BLOCK_ITEM_72.get());
                output.accept(PLACEHOLDER_BLOCK_ITEM_73.get());
                output.accept(PLACEHOLDER_BLOCK_ITEM_74.get());
                output.accept(PLACEHOLDER_BLOCK_ITEM_75.get());
                output.accept(PLACEHOLDER_BLOCK_ITEM_76.get());
                output.accept(PLACEHOLDER_BLOCK_ITEM_77.get());
                output.accept(PLACEHOLDER_BLOCK_ITEM_78.get());
                output.accept(PLACEHOLDER_BLOCK_ITEM_79.get());
                output.accept(PLACEHOLDER_BLOCK_ITEM_80.get());
                output.accept(PLACEHOLDER_BLOCK_ITEM_81.get());
                output.accept(PLACEHOLDER_BLOCK_ITEM_82.get());
                output.accept(PLACEHOLDER_BLOCK_ITEM_83.get());
                output.accept(PLACEHOLDER_BLOCK_ITEM_84.get());
                output.accept(PLACEHOLDER_BLOCK_ITEM_85.get());
                output.accept(PLACEHOLDER_BLOCK_ITEM_86.get());
                output.accept(PLACEHOLDER_BLOCK_ITEM_87.get());
                output.accept(PLACEHOLDER_BLOCK_ITEM_88.get());
                output.accept(PLACEHOLDER_BLOCK_ITEM_89.get());
                output.accept(PLACEHOLDER_BLOCK_ITEM_90.get());
                output.accept(PLACEHOLDER_BLOCK_ITEM_91.get());
                output.accept(PLACEHOLDER_BLOCK_ITEM_92.get());
                output.accept(PLACEHOLDER_BLOCK_ITEM_93.get());
                output.accept(PLACEHOLDER_BLOCK_ITEM_94.get());
                output.accept(PLACEHOLDER_BLOCK_ITEM_95.get());
                output.accept(PLACEHOLDER_BLOCK_ITEM_96.get());
                output.accept(PLACEHOLDER_BLOCK_ITEM_97.get());
                output.accept(PLACEHOLDER_BLOCK_ITEM_98.get());
                output.accept(PLACEHOLDER_BLOCK_ITEM_99.get());
                output.accept(PLACEHOLDER_BLOCK_ITEM_100.get());
                output.accept(PLACEHOLDER_BLOCK_ITEM_101.get());
                output.accept(PLACEHOLDER_BLOCK_ITEM_102.get());
                output.accept(PLACEHOLDER_BLOCK_ITEM_103.get());
                output.accept(PLACEHOLDER_BLOCK_ITEM_104.get());
                output.accept(PLACEHOLDER_BLOCK_ITEM_105.get());
                output.accept(PLACEHOLDER_BLOCK_ITEM_106.get());
                output.accept(PLACEHOLDER_BLOCK_ITEM_107.get());
                output.accept(PLACEHOLDER_BLOCK_ITEM_108.get());
                output.accept(PLACEHOLDER_BLOCK_ITEM_109.get());
                output.accept(PLACEHOLDER_BLOCK_ITEM_110.get());
                output.accept(PLACEHOLDER_BLOCK_ITEM_111.get());
                output.accept(PLACEHOLDER_BLOCK_ITEM_112.get());
                output.accept(PLACEHOLDER_BLOCK_ITEM_113.get());
                output.accept(PLACEHOLDER_BLOCK_ITEM_114.get());
                output.accept(PLACEHOLDER_BLOCK_ITEM_115.get());
                output.accept(PLACEHOLDER_BLOCK_ITEM_116.get());
                output.accept(PLACEHOLDER_BLOCK_ITEM_117.get());
                output.accept(PLACEHOLDER_BLOCK_ITEM_118.get());
                output.accept(PLACEHOLDER_BLOCK_ITEM_119.get());
                output.accept(PLACEHOLDER_BLOCK_ITEM_120.get());
                output.accept(PLACEHOLDER_BLOCK_ITEM_121.get());
                output.accept(PLACEHOLDER_BLOCK_ITEM_122.get());
                output.accept(PLACEHOLDER_BLOCK_ITEM_123.get());
                output.accept(PLACEHOLDER_BLOCK_ITEM_124.get());
                output.accept(PLACEHOLDER_BLOCK_ITEM_125.get());
                output.accept(PLACEHOLDER_BLOCK_ITEM_126.get());
                output.accept(PLACEHOLDER_BLOCK_ITEM_127.get());
            }).build());

    // The constructor for the mod class is the first code that is run when your mod is loaded.
    public Failsafeblocks(IEventBus modEventBus, ModContainer modContainer) {
        // Register the Deferred Register to the mod event bus so blocks get registered
        BLOCKS.register(modEventBus);
        // Register the Deferred Register to the mod event bus so items get registered
        ITEMS.register(modEventBus);
        // Register the Deferred Register to the mod event bus so tabs get registered
        CREATIVE_MODE_TABS.register(modEventBus);

        // Register the item to a creative tab
        modEventBus.addListener(this::addCreative);

        
        LOGGER.info("FailSafe Blocks Mod initialized - Missing blocks will be replaced with placeholders");
    }

    // Add the placeholder block items to the building blocks tab
    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
            event.accept(PLACEHOLDER_BLOCK_ITEM);
            event.accept(PLACEHOLDER_BLOCK_ITEM_1);
            event.accept(PLACEHOLDER_BLOCK_ITEM_2);
            event.accept(PLACEHOLDER_BLOCK_ITEM_3);
            event.accept(PLACEHOLDER_BLOCK_ITEM_4);
            event.accept(PLACEHOLDER_BLOCK_ITEM_5);
            event.accept(PLACEHOLDER_BLOCK_ITEM_6);
            event.accept(PLACEHOLDER_BLOCK_ITEM_7);
            event.accept(PLACEHOLDER_BLOCK_ITEM_8);
            event.accept(PLACEHOLDER_BLOCK_ITEM_9);
            event.accept(PLACEHOLDER_BLOCK_ITEM_10);
            event.accept(PLACEHOLDER_BLOCK_ITEM_11);
            event.accept(PLACEHOLDER_BLOCK_ITEM_12);
            event.accept(PLACEHOLDER_BLOCK_ITEM_13);
            event.accept(PLACEHOLDER_BLOCK_ITEM_14);
            event.accept(PLACEHOLDER_BLOCK_ITEM_15);
            event.accept(PLACEHOLDER_BLOCK_ITEM_16);
            event.accept(PLACEHOLDER_BLOCK_ITEM_17);
            event.accept(PLACEHOLDER_BLOCK_ITEM_18);
            event.accept(PLACEHOLDER_BLOCK_ITEM_19);
            event.accept(PLACEHOLDER_BLOCK_ITEM_20);
            event.accept(PLACEHOLDER_BLOCK_ITEM_21);
            event.accept(PLACEHOLDER_BLOCK_ITEM_22);
            event.accept(PLACEHOLDER_BLOCK_ITEM_23);
            event.accept(PLACEHOLDER_BLOCK_ITEM_24);
            event.accept(PLACEHOLDER_BLOCK_ITEM_25);
            event.accept(PLACEHOLDER_BLOCK_ITEM_26);
            event.accept(PLACEHOLDER_BLOCK_ITEM_27);
            event.accept(PLACEHOLDER_BLOCK_ITEM_28);
            event.accept(PLACEHOLDER_BLOCK_ITEM_29);
            event.accept(PLACEHOLDER_BLOCK_ITEM_30);
            event.accept(PLACEHOLDER_BLOCK_ITEM_31);
            event.accept(PLACEHOLDER_BLOCK_ITEM_32);
            event.accept(PLACEHOLDER_BLOCK_ITEM_33);
            event.accept(PLACEHOLDER_BLOCK_ITEM_34);
            event.accept(PLACEHOLDER_BLOCK_ITEM_35);
            event.accept(PLACEHOLDER_BLOCK_ITEM_36);
            event.accept(PLACEHOLDER_BLOCK_ITEM_37);
            event.accept(PLACEHOLDER_BLOCK_ITEM_38);
            event.accept(PLACEHOLDER_BLOCK_ITEM_39);
            event.accept(PLACEHOLDER_BLOCK_ITEM_40);
            event.accept(PLACEHOLDER_BLOCK_ITEM_41);
            event.accept(PLACEHOLDER_BLOCK_ITEM_42);
            event.accept(PLACEHOLDER_BLOCK_ITEM_43);
            event.accept(PLACEHOLDER_BLOCK_ITEM_44);
            event.accept(PLACEHOLDER_BLOCK_ITEM_45);
            event.accept(PLACEHOLDER_BLOCK_ITEM_46);
            event.accept(PLACEHOLDER_BLOCK_ITEM_47);
            event.accept(PLACEHOLDER_BLOCK_ITEM_48);
            event.accept(PLACEHOLDER_BLOCK_ITEM_49);
            event.accept(PLACEHOLDER_BLOCK_ITEM_50);
            event.accept(PLACEHOLDER_BLOCK_ITEM_51);
            event.accept(PLACEHOLDER_BLOCK_ITEM_52);
            event.accept(PLACEHOLDER_BLOCK_ITEM_53);
            event.accept(PLACEHOLDER_BLOCK_ITEM_54);
            event.accept(PLACEHOLDER_BLOCK_ITEM_55);
            event.accept(PLACEHOLDER_BLOCK_ITEM_56);
            event.accept(PLACEHOLDER_BLOCK_ITEM_57);
            event.accept(PLACEHOLDER_BLOCK_ITEM_58);
            event.accept(PLACEHOLDER_BLOCK_ITEM_59);
            event.accept(PLACEHOLDER_BLOCK_ITEM_60);
            event.accept(PLACEHOLDER_BLOCK_ITEM_61);
            event.accept(PLACEHOLDER_BLOCK_ITEM_62);
            event.accept(PLACEHOLDER_BLOCK_ITEM_63);
            event.accept(PLACEHOLDER_BLOCK_ITEM_64);
            event.accept(PLACEHOLDER_BLOCK_ITEM_65);
            event.accept(PLACEHOLDER_BLOCK_ITEM_66);
            event.accept(PLACEHOLDER_BLOCK_ITEM_67);
            event.accept(PLACEHOLDER_BLOCK_ITEM_68);
            event.accept(PLACEHOLDER_BLOCK_ITEM_69);
            event.accept(PLACEHOLDER_BLOCK_ITEM_70);
            event.accept(PLACEHOLDER_BLOCK_ITEM_71);
            event.accept(PLACEHOLDER_BLOCK_ITEM_72);
            event.accept(PLACEHOLDER_BLOCK_ITEM_73);
            event.accept(PLACEHOLDER_BLOCK_ITEM_74);
            event.accept(PLACEHOLDER_BLOCK_ITEM_75);
            event.accept(PLACEHOLDER_BLOCK_ITEM_76);
            event.accept(PLACEHOLDER_BLOCK_ITEM_77);
            event.accept(PLACEHOLDER_BLOCK_ITEM_78);
            event.accept(PLACEHOLDER_BLOCK_ITEM_79);
            event.accept(PLACEHOLDER_BLOCK_ITEM_80);
            event.accept(PLACEHOLDER_BLOCK_ITEM_81);
            event.accept(PLACEHOLDER_BLOCK_ITEM_82);
            event.accept(PLACEHOLDER_BLOCK_ITEM_83);
            event.accept(PLACEHOLDER_BLOCK_ITEM_84);
            event.accept(PLACEHOLDER_BLOCK_ITEM_85);
            event.accept(PLACEHOLDER_BLOCK_ITEM_86);
            event.accept(PLACEHOLDER_BLOCK_ITEM_87);
            event.accept(PLACEHOLDER_BLOCK_ITEM_88);
            event.accept(PLACEHOLDER_BLOCK_ITEM_89);
            event.accept(PLACEHOLDER_BLOCK_ITEM_90);
            event.accept(PLACEHOLDER_BLOCK_ITEM_91);
            event.accept(PLACEHOLDER_BLOCK_ITEM_92);
            event.accept(PLACEHOLDER_BLOCK_ITEM_93);
            event.accept(PLACEHOLDER_BLOCK_ITEM_94);
            event.accept(PLACEHOLDER_BLOCK_ITEM_95);
            event.accept(PLACEHOLDER_BLOCK_ITEM_96);
            event.accept(PLACEHOLDER_BLOCK_ITEM_97);
            event.accept(PLACEHOLDER_BLOCK_ITEM_98);
            event.accept(PLACEHOLDER_BLOCK_ITEM_99);
            event.accept(PLACEHOLDER_BLOCK_ITEM_100);
            event.accept(PLACEHOLDER_BLOCK_ITEM_101);
            event.accept(PLACEHOLDER_BLOCK_ITEM_102);
            event.accept(PLACEHOLDER_BLOCK_ITEM_103);
            event.accept(PLACEHOLDER_BLOCK_ITEM_104);
            event.accept(PLACEHOLDER_BLOCK_ITEM_105);
            event.accept(PLACEHOLDER_BLOCK_ITEM_106);
            event.accept(PLACEHOLDER_BLOCK_ITEM_107);
            event.accept(PLACEHOLDER_BLOCK_ITEM_108);
            event.accept(PLACEHOLDER_BLOCK_ITEM_109);
            event.accept(PLACEHOLDER_BLOCK_ITEM_110);
            event.accept(PLACEHOLDER_BLOCK_ITEM_111);
            event.accept(PLACEHOLDER_BLOCK_ITEM_112);
            event.accept(PLACEHOLDER_BLOCK_ITEM_113);
            event.accept(PLACEHOLDER_BLOCK_ITEM_114);
            event.accept(PLACEHOLDER_BLOCK_ITEM_115);
            event.accept(PLACEHOLDER_BLOCK_ITEM_116);
            event.accept(PLACEHOLDER_BLOCK_ITEM_117);
            event.accept(PLACEHOLDER_BLOCK_ITEM_118);
            event.accept(PLACEHOLDER_BLOCK_ITEM_119);
            event.accept(PLACEHOLDER_BLOCK_ITEM_120);
            event.accept(PLACEHOLDER_BLOCK_ITEM_121);
            event.accept(PLACEHOLDER_BLOCK_ITEM_122);
            event.accept(PLACEHOLDER_BLOCK_ITEM_123);
            event.accept(PLACEHOLDER_BLOCK_ITEM_124);
            event.accept(PLACEHOLDER_BLOCK_ITEM_125);
            event.accept(PLACEHOLDER_BLOCK_ITEM_126);
            event.accept(PLACEHOLDER_BLOCK_ITEM_127);
        }
    }
}
