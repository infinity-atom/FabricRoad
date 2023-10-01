package com.infinityatom.fabricroad;

import com.infinityatom.fabricroad.block.RoadSignPole;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.ItemGroup;

import static com.infinityatom.fabricroad.RoadBlocksHandler.registerBlock;

public class RoadBlocksSetup {

    public static final Block ROAD_SIGN_POLE = registerBlock("road_sign_pole",
            new RoadSignPole(FabricBlockSettings
                    .of(Material.METAL)
                    .strength(2f)
                    .requiresTool()
                    .nonOpaque()
            ), ItemGroup.MISC);

    public static void registerModBlocks() {
        FabricRoad.LOGGER.info("FabricRoads blocks init");
    }

}
