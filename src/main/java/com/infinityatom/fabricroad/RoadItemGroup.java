package com.infinityatom.fabricroad;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class RoadItemGroup {
    public static final ItemGroup ROADGROUP = FabricItemGroupBuilder.build(
            new Identifier(FabricRoad.MODID, "fabricroaditems"), () -> new ItemStack(RoadBlocksSetup.AU_SPEED_SIGN_10));
}
