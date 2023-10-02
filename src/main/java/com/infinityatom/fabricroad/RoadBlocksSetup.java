package com.infinityatom.fabricroad;

import com.infinityatom.fabricroad.block.HorizontalRotationRoadSign;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;

import static com.infinityatom.fabricroad.RoadBlocksHandler.registerBlock;

public class RoadBlocksSetup {

    public static final Block ROAD_SIGN_POLE = registerBlock("road_sign_pole",
            new HorizontalRotationRoadSign(FabricBlockSettings
                    .of(Material.METAL)
                    .strength(2f)
                    .requiresTool()
                    .nonOpaque()
            ), RoadItemGroup.ROADGROUP);

    public static final Block ROAD_SIGN_POLE_SLAB = registerBlock("road_sign_pole_slab",
            new HorizontalRotationRoadSign(FabricBlockSettings
                    .of(Material.METAL)
                    .strength(2f)
                    .requiresTool()
                    .nonOpaque()
            ), RoadItemGroup.ROADGROUP);


    // Australian Speed Signs

    public static final Block AU_SPEED_SIGN_10 = registerBlock("au_speed_sign_10",
            new HorizontalRotationRoadSign(FabricBlockSettings
                    .of(Material.METAL)
                    .strength(2f)
                    .requiresTool()
                    .nonOpaque()
            ), RoadItemGroup.ROADGROUP);

    public static final Block AU_SPEED_SIGN_20 = registerBlock("au_speed_sign_20",
            new HorizontalRotationRoadSign(FabricBlockSettings
                    .of(Material.METAL)
                    .strength(2f)
                    .requiresTool()
                    .nonOpaque()
            ), RoadItemGroup.ROADGROUP);

    public static final Block AU_SPEED_SIGN_30 = registerBlock("au_speed_sign_30",
            new HorizontalRotationRoadSign(FabricBlockSettings
                    .of(Material.METAL)
                    .strength(2f)
                    .requiresTool()
                    .nonOpaque()
            ), RoadItemGroup.ROADGROUP);

    public static final Block AU_SPEED_SIGN_40 = registerBlock("au_speed_sign_40",
            new HorizontalRotationRoadSign(FabricBlockSettings
                    .of(Material.METAL)
                    .strength(2f)
                    .requiresTool()
                    .nonOpaque()
            ), RoadItemGroup.ROADGROUP);

    public static final Block AU_SPEED_SIGN_50 = registerBlock("au_speed_sign_50",
            new HorizontalRotationRoadSign(FabricBlockSettings
                    .of(Material.METAL)
                    .strength(2f)
                    .requiresTool()
                    .nonOpaque()
            ), RoadItemGroup.ROADGROUP);

    public static final Block AU_SPEED_SIGN_60 = registerBlock("au_speed_sign_60",
            new HorizontalRotationRoadSign(FabricBlockSettings
                    .of(Material.METAL)
                    .strength(2f)
                    .requiresTool()
                    .nonOpaque()
            ), RoadItemGroup.ROADGROUP);

    public static final Block AU_SPEED_SIGN_70 = registerBlock("au_speed_sign_70",
            new HorizontalRotationRoadSign(FabricBlockSettings
                    .of(Material.METAL)
                    .strength(2f)
                    .requiresTool()
                    .nonOpaque()
            ), RoadItemGroup.ROADGROUP);

    public static final Block AU_SPEED_SIGN_80 = registerBlock("au_speed_sign_80",
            new HorizontalRotationRoadSign(FabricBlockSettings
                    .of(Material.METAL)
                    .strength(2f)
                    .requiresTool()
                    .nonOpaque()
            ), RoadItemGroup.ROADGROUP);

    public static final Block AU_SPEED_SIGN_90 = registerBlock("au_speed_sign_90",
            new HorizontalRotationRoadSign(FabricBlockSettings
                    .of(Material.METAL)
                    .strength(2f)
                    .requiresTool()
                    .nonOpaque()
            ), RoadItemGroup.ROADGROUP);

    public static final Block AU_SPEED_SIGN_100 = registerBlock("au_speed_sign_100",
            new HorizontalRotationRoadSign(FabricBlockSettings
                    .of(Material.METAL)
                    .strength(2f)
                    .requiresTool()
                    .nonOpaque()
            ), RoadItemGroup.ROADGROUP);

    public static final Block AU_SPEED_SIGN_110 = registerBlock("au_speed_sign_110",
            new HorizontalRotationRoadSign(FabricBlockSettings
                    .of(Material.METAL)
                    .strength(2f)
                    .requiresTool()
                    .nonOpaque()
            ), RoadItemGroup.ROADGROUP);

    // US SPEED SIGNS

    public static final Block US_SPEED_SIGN_20 = registerBlock("us_speed_sign_20",
            new HorizontalRotationRoadSign(FabricBlockSettings
                    .of(Material.METAL)
                    .strength(2f)
                    .requiresTool()
                    .nonOpaque()
            ), RoadItemGroup.ROADGROUP);

    public static final Block US_SPEED_SIGN_25 = registerBlock("us_speed_sign_25",
            new HorizontalRotationRoadSign(FabricBlockSettings
                    .of(Material.METAL)
                    .strength(2f)
                    .requiresTool()
                    .nonOpaque()
            ), RoadItemGroup.ROADGROUP);

    public static final Block US_SPEED_SIGN_30 = registerBlock("us_speed_sign_30",
            new HorizontalRotationRoadSign(FabricBlockSettings
                    .of(Material.METAL)
                    .strength(2f)
                    .requiresTool()
                    .nonOpaque()
            ), RoadItemGroup.ROADGROUP);

    public static final Block US_SPEED_SIGN_35 = registerBlock("us_speed_sign_35",
            new HorizontalRotationRoadSign(FabricBlockSettings
                    .of(Material.METAL)
                    .strength(2f)
                    .requiresTool()
                    .nonOpaque()
            ), RoadItemGroup.ROADGROUP);

    public static final Block US_SPEED_SIGN_40 = registerBlock("us_speed_sign_40",
            new HorizontalRotationRoadSign(FabricBlockSettings
                    .of(Material.METAL)
                    .strength(2f)
                    .requiresTool()
                    .nonOpaque()
            ), RoadItemGroup.ROADGROUP);

    public static final Block US_SPEED_SIGN_45 = registerBlock("us_speed_sign_45",
            new HorizontalRotationRoadSign(FabricBlockSettings
                    .of(Material.METAL)
                    .strength(2f)
                    .requiresTool()
                    .nonOpaque()
            ), RoadItemGroup.ROADGROUP);

    public static final Block US_SPEED_SIGN_50 = registerBlock("us_speed_sign_50",
            new HorizontalRotationRoadSign(FabricBlockSettings
                    .of(Material.METAL)
                    .strength(2f)
                    .requiresTool()
                    .nonOpaque()
            ), RoadItemGroup.ROADGROUP);

    public static final Block US_SPEED_SIGN_60 = registerBlock("us_speed_sign_60",
            new HorizontalRotationRoadSign(FabricBlockSettings
                    .of(Material.METAL)
                    .strength(2f)
                    .requiresTool()
                    .nonOpaque()
            ), RoadItemGroup.ROADGROUP);

    public static final Block US_SPEED_SIGN_65 = registerBlock("us_speed_sign_65",
            new HorizontalRotationRoadSign(FabricBlockSettings
                    .of(Material.METAL)
                    .strength(2f)
                    .requiresTool()
                    .nonOpaque()
            ), RoadItemGroup.ROADGROUP);

    public static final Block US_SPEED_SIGN_70 = registerBlock("us_speed_sign_70",
            new HorizontalRotationRoadSign(FabricBlockSettings
                    .of(Material.METAL)
                    .strength(2f)
                    .requiresTool()
                    .nonOpaque()
            ), RoadItemGroup.ROADGROUP);

    public static final Block US_SPEED_SIGN_80 = registerBlock("us_speed_sign_80",
            new HorizontalRotationRoadSign(FabricBlockSettings
                    .of(Material.METAL)
                    .strength(2f)
                    .requiresTool()
                    .nonOpaque()
            ), RoadItemGroup.ROADGROUP);


    public static void registerModBlocks() {
        FabricRoad.LOGGER.info("FabricRoads blocks init");
    }

}
