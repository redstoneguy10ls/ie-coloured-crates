package com.redstoneguy10ls.colouredie.blocks;

import blusunrize.immersiveengineering.common.blocks.IEEntityBlock;
import blusunrize.immersiveengineering.common.blocks.wooden.WoodenCrateBlockEntity;
import blusunrize.immersiveengineering.common.register.IEBlockEntities;
import blusunrize.immersiveengineering.common.register.IEBlocks;
import com.redstoneguy10ls.colouredie.items.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;


import static net.minecraftforge.versions.forge.ForgeVersion.MOD_ID;

public class ModBlocks {
    private static final Supplier<BlockBehaviour.Properties> STANDARD_WOOD_PROPERTIES = () -> Block.Properties.of(Material.WOOD)
            .sound(SoundType.WOOD)
            .strength(2, 5);
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, MOD_ID);

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }
    public static final IEBlocks.BlockEntry<IEEntityBlock<WoodenCrateBlockEntity>> REDCRATE = new IEBlocks.BlockEntry<>(
            "red_crate", STANDARD_WOOD_PROPERTIES, p -> new IEEntityBlock<>(IEBlockEntities.WOODEN_CRATE, p, false)
    );
    public static final IEBlocks.BlockEntry<IEEntityBlock<WoodenCrateBlockEntity>> BLACKCRATE = new IEBlocks.BlockEntry<>(
            "black_crate", STANDARD_WOOD_PROPERTIES, p -> new IEEntityBlock<>(IEBlockEntities.WOODEN_CRATE, p, false)
    );
    public static final IEBlocks.BlockEntry<IEEntityBlock<WoodenCrateBlockEntity>> BLUECRATE = new IEBlocks.BlockEntry<>(
            "blue_crate", STANDARD_WOOD_PROPERTIES, p -> new IEEntityBlock<>(IEBlockEntities.WOODEN_CRATE, p, false)
    );
    public static final IEBlocks.BlockEntry<IEEntityBlock<WoodenCrateBlockEntity>> BROWNCRATE = new IEBlocks.BlockEntry<>(
            "brown_crate", STANDARD_WOOD_PROPERTIES, p -> new IEEntityBlock<>(IEBlockEntities.WOODEN_CRATE, p, false)
    );
    public static final IEBlocks.BlockEntry<IEEntityBlock<WoodenCrateBlockEntity>> CYANCRATE = new IEBlocks.BlockEntry<>(
            "cyan_crate", STANDARD_WOOD_PROPERTIES, p -> new IEEntityBlock<>(IEBlockEntities.WOODEN_CRATE, p, false)
    );
    public static final IEBlocks.BlockEntry<IEEntityBlock<WoodenCrateBlockEntity>> GRAYCRATE = new IEBlocks.BlockEntry<>(
            "gray_crate", STANDARD_WOOD_PROPERTIES, p -> new IEEntityBlock<>(IEBlockEntities.WOODEN_CRATE, p, false)
    );
    public static final IEBlocks.BlockEntry<IEEntityBlock<WoodenCrateBlockEntity>> GREENCRATE = new IEBlocks.BlockEntry<>(
            "green_crate", STANDARD_WOOD_PROPERTIES, p -> new IEEntityBlock<>(IEBlockEntities.WOODEN_CRATE, p, false)
    );
    public static final IEBlocks.BlockEntry<IEEntityBlock<WoodenCrateBlockEntity>> LIGHTBLUECRATE = new IEBlocks.BlockEntry<>(
            "light_blue_crate", STANDARD_WOOD_PROPERTIES, p -> new IEEntityBlock<>(IEBlockEntities.WOODEN_CRATE, p, false)
    );
    public static final IEBlocks.BlockEntry<IEEntityBlock<WoodenCrateBlockEntity>> LIGHTGRAYCRATE = new IEBlocks.BlockEntry<>(
            "light_gray_crate", STANDARD_WOOD_PROPERTIES, p -> new IEEntityBlock<>(IEBlockEntities.WOODEN_CRATE, p, false)
    );
    public static final IEBlocks.BlockEntry<IEEntityBlock<WoodenCrateBlockEntity>> LIMECRATE = new IEBlocks.BlockEntry<>(
            "lime_crate", STANDARD_WOOD_PROPERTIES, p -> new IEEntityBlock<>(IEBlockEntities.WOODEN_CRATE, p, false)
    );
    public static final IEBlocks.BlockEntry<IEEntityBlock<WoodenCrateBlockEntity>> MAGENTACRATE = new IEBlocks.BlockEntry<>(
            "magenta_crate", STANDARD_WOOD_PROPERTIES, p -> new IEEntityBlock<>(IEBlockEntities.WOODEN_CRATE, p, false)
    );
    public static final IEBlocks.BlockEntry<IEEntityBlock<WoodenCrateBlockEntity>> ORANGECRATE = new IEBlocks.BlockEntry<>(
            "orange_crate", STANDARD_WOOD_PROPERTIES, p -> new IEEntityBlock<>(IEBlockEntities.WOODEN_CRATE, p, false)
    );
    public static final IEBlocks.BlockEntry<IEEntityBlock<WoodenCrateBlockEntity>> PINKCRATE = new IEBlocks.BlockEntry<>(
            "pink_crate", STANDARD_WOOD_PROPERTIES, p -> new IEEntityBlock<>(IEBlockEntities.WOODEN_CRATE, p, false)
    );
    public static final IEBlocks.BlockEntry<IEEntityBlock<WoodenCrateBlockEntity>> PURPLECRATE = new IEBlocks.BlockEntry<>(
            "purple_crate", STANDARD_WOOD_PROPERTIES, p -> new IEEntityBlock<>(IEBlockEntities.WOODEN_CRATE, p, false)
    );
    public static final IEBlocks.BlockEntry<IEEntityBlock<WoodenCrateBlockEntity>> WHITECRATE = new IEBlocks.BlockEntry<>(
            "white_crate", STANDARD_WOOD_PROPERTIES, p -> new IEEntityBlock<>(IEBlockEntities.WOODEN_CRATE, p, false)
    );
    public static final IEBlocks.BlockEntry<IEEntityBlock<WoodenCrateBlockEntity>> YELLOWCRATE = new IEBlocks.BlockEntry<>(
            "yellow_crate", STANDARD_WOOD_PROPERTIES, p -> new IEEntityBlock<>(IEBlockEntities.WOODEN_CRATE, p, false)
    );


    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }

}
