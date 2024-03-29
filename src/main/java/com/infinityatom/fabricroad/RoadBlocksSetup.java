package com.infinityatom.fabricroad;

import com.infinityatom.fabricroad.block.HorizontalRotationLightingFixRegularBlock;
import com.infinityatom.fabricroad.block.HorizontalRotationRoadSign;
import com.infinityatom.fabricroad.block.TrafficCone;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;

import static com.infinityatom.fabricroad.RoadBlocksHandler.registerBlock;

public class RoadBlocksSetup {

    public static final Block ROAD_SIGN_POLE = registerBlock("road_sign_pole",
            new HorizontalRotationRoadSign(FabricBlockSettings
                    .of(Material.METAL)
                    .strength(0.5f)
                    .requiresTool()
                    .nonOpaque()
            ), RoadItemGroup.ROADGROUP);

    public static final Block ROAD_SIGN_POLE_SLAB = registerBlock("road_sign_pole_slab",
            new HorizontalRotationRoadSign(FabricBlockSettings
                    .of(Material.METAL)
                    .strength(0.5f)
                    .requiresTool()
                    .nonOpaque()
            ), RoadItemGroup.ROADGROUP);

    public static final Block BUS_STOP_POLE = registerBlock("bus_stop_pole",
            new HorizontalRotationRoadSign(FabricBlockSettings
                    .of(Material.METAL)
                    .strength(0.5f)
                    .requiresTool()
                    .nonOpaque()
            ), RoadItemGroup.ROADGROUP);


    // Australian Speed Signs

    public static final Block AU_SPEED_SIGN_10 = registerBlock("au_speed_sign_10",
            new HorizontalRotationRoadSign(FabricBlockSettings
                    .of(Material.METAL)
                    .strength(0.5f)
                    .requiresTool()
                    .nonOpaque()
            ), RoadItemGroup.ROADGROUP);

    public static final Block AU_SPEED_SIGN_20 = registerBlock("au_speed_sign_20",
            new HorizontalRotationRoadSign(FabricBlockSettings
                    .of(Material.METAL)
                    .strength(0.5f)
                    .requiresTool()
                    .nonOpaque()
            ), RoadItemGroup.ROADGROUP);

    public static final Block AU_SPEED_SIGN_30 = registerBlock("au_speed_sign_30",
            new HorizontalRotationRoadSign(FabricBlockSettings
                    .of(Material.METAL)
                    .strength(0.5f)
                    .requiresTool()
                    .nonOpaque()
            ), RoadItemGroup.ROADGROUP);

    public static final Block AU_SPEED_SIGN_40 = registerBlock("au_speed_sign_40",
            new HorizontalRotationRoadSign(FabricBlockSettings
                    .of(Material.METAL)
                    .strength(0.5f)
                    .requiresTool()
                    .nonOpaque()
            ), RoadItemGroup.ROADGROUP);

    public static final Block AU_SPEED_SIGN_50 = registerBlock("au_speed_sign_50",
            new HorizontalRotationRoadSign(FabricBlockSettings
                    .of(Material.METAL)
                    .strength(0.5f)
                    .requiresTool()
                    .nonOpaque()
            ), RoadItemGroup.ROADGROUP);

    public static final Block AU_SPEED_SIGN_60 = registerBlock("au_speed_sign_60",
            new HorizontalRotationRoadSign(FabricBlockSettings
                    .of(Material.METAL)
                    .strength(0.5f)
                    .requiresTool()
                    .nonOpaque()
            ), RoadItemGroup.ROADGROUP);

    public static final Block AU_SPEED_SIGN_70 = registerBlock("au_speed_sign_70",
            new HorizontalRotationRoadSign(FabricBlockSettings
                    .of(Material.METAL)
                    .strength(0.5f)
                    .requiresTool()
                    .nonOpaque()
            ), RoadItemGroup.ROADGROUP);

    public static final Block AU_SPEED_SIGN_80 = registerBlock("au_speed_sign_80",
            new HorizontalRotationRoadSign(FabricBlockSettings
                    .of(Material.METAL)
                    .strength(0.5f)
                    .requiresTool()
                    .nonOpaque()
            ), RoadItemGroup.ROADGROUP);

    public static final Block AU_SPEED_SIGN_90 = registerBlock("au_speed_sign_90",
            new HorizontalRotationRoadSign(FabricBlockSettings
                    .of(Material.METAL)
                    .strength(0.5f)
                    .requiresTool()
                    .nonOpaque()
            ), RoadItemGroup.ROADGROUP);

    public static final Block AU_SPEED_SIGN_100 = registerBlock("au_speed_sign_100",
            new HorizontalRotationRoadSign(FabricBlockSettings
                    .of(Material.METAL)
                    .strength(0.5f)
                    .requiresTool()
                    .nonOpaque()
            ), RoadItemGroup.ROADGROUP);

    public static final Block AU_SPEED_SIGN_110 = registerBlock("au_speed_sign_110",
            new HorizontalRotationRoadSign(FabricBlockSettings
                    .of(Material.METAL)
                    .strength(0.5f)
                    .requiresTool()
                    .nonOpaque()
            ), RoadItemGroup.ROADGROUP);

    // US SPEED SIGNS

    public static final Block US_SPEED_SIGN_20 = registerBlock("us_speed_sign_20",
            new HorizontalRotationRoadSign(FabricBlockSettings
                    .of(Material.METAL)
                    .strength(0.5f)
                    .requiresTool()
                    .nonOpaque()
            ), RoadItemGroup.ROADGROUP);

    public static final Block US_SPEED_SIGN_25 = registerBlock("us_speed_sign_25",
            new HorizontalRotationRoadSign(FabricBlockSettings
                    .of(Material.METAL)
                    .strength(0.5f)
                    .requiresTool()
                    .nonOpaque()
            ), RoadItemGroup.ROADGROUP);

    public static final Block US_SPEED_SIGN_30 = registerBlock("us_speed_sign_30",
            new HorizontalRotationRoadSign(FabricBlockSettings
                    .of(Material.METAL)
                    .strength(0.5f)
                    .requiresTool()
                    .nonOpaque()
            ), RoadItemGroup.ROADGROUP);

    public static final Block US_SPEED_SIGN_35 = registerBlock("us_speed_sign_35",
            new HorizontalRotationRoadSign(FabricBlockSettings
                    .of(Material.METAL)
                    .strength(0.5f)
                    .requiresTool()
                    .nonOpaque()
            ), RoadItemGroup.ROADGROUP);

    public static final Block US_SPEED_SIGN_40 = registerBlock("us_speed_sign_40",
            new HorizontalRotationRoadSign(FabricBlockSettings
                    .of(Material.METAL)
                    .strength(0.5f)
                    .requiresTool()
                    .nonOpaque()
            ), RoadItemGroup.ROADGROUP);

    public static final Block US_SPEED_SIGN_45 = registerBlock("us_speed_sign_45",
            new HorizontalRotationRoadSign(FabricBlockSettings
                    .of(Material.METAL)
                    .strength(0.5f)
                    .requiresTool()
                    .nonOpaque()
            ), RoadItemGroup.ROADGROUP);

    public static final Block US_SPEED_SIGN_50 = registerBlock("us_speed_sign_50",
            new HorizontalRotationRoadSign(FabricBlockSettings
                    .of(Material.METAL)
                    .strength(0.5f)
                    .requiresTool()
                    .nonOpaque()
            ), RoadItemGroup.ROADGROUP);

    public static final Block US_SPEED_SIGN_60 = registerBlock("us_speed_sign_60",
            new HorizontalRotationRoadSign(FabricBlockSettings
                    .of(Material.METAL)
                    .strength(0.5f)
                    .requiresTool()
                    .nonOpaque()
            ), RoadItemGroup.ROADGROUP);

    public static final Block US_SPEED_SIGN_65 = registerBlock("us_speed_sign_65",
            new HorizontalRotationRoadSign(FabricBlockSettings
                    .of(Material.METAL)
                    .strength(0.5f)
                    .requiresTool()
                    .nonOpaque()
            ), RoadItemGroup.ROADGROUP);

    public static final Block US_SPEED_SIGN_70 = registerBlock("us_speed_sign_70",
            new HorizontalRotationRoadSign(FabricBlockSettings
                    .of(Material.METAL)
                    .strength(0.5f)
                    .requiresTool()
                    .nonOpaque()
            ), RoadItemGroup.ROADGROUP);

    public static final Block US_SPEED_SIGN_80 = registerBlock("us_speed_sign_80",
            new HorizontalRotationRoadSign(FabricBlockSettings
                    .of(Material.METAL)
                    .strength(0.5f)
                    .requiresTool()
                    .nonOpaque()
            ), RoadItemGroup.ROADGROUP);

    // EXIT SIGNS

    public static final Block EXIT_SIGN_LEFT = registerBlock("exit_sign_left",
            new HorizontalRotationRoadSign(FabricBlockSettings
                    .of(Material.METAL)
                    .strength(0.5f)
                    .requiresTool()
                    .nonOpaque()
            ), RoadItemGroup.ROADGROUP);

    public static final Block EXIT_SIGN_RIGHT = registerBlock("exit_sign_right",
            new HorizontalRotationRoadSign(FabricBlockSettings
                    .of(Material.METAL)
                    .strength(0.5f)
                    .requiresTool()
                    .nonOpaque()
            ), RoadItemGroup.ROADGROUP);

    // ARROW SIGNS

    public static final Block ARROW_SIGN_BOTTOM = registerBlock("arrow_sign_bottom",
            new HorizontalRotationRoadSign(FabricBlockSettings
                    .of(Material.METAL)
                    .strength(0.5f)
                    .requiresTool()
                    .nonOpaque()
            ), RoadItemGroup.ROADGROUP);

    public static final Block ARROW_SIGN_BOTTOMLEFT = registerBlock("arrow_sign_bottomleft",
            new HorizontalRotationRoadSign(FabricBlockSettings
                    .of(Material.METAL)
                    .strength(0.5f)
                    .requiresTool()
                    .nonOpaque()
            ), RoadItemGroup.ROADGROUP);

    public static final Block ARROW_SIGN_LEFT = registerBlock("arrow_sign_left",
            new HorizontalRotationRoadSign(FabricBlockSettings
                    .of(Material.METAL)
                    .strength(0.5f)
                    .requiresTool()
                    .nonOpaque()
            ), RoadItemGroup.ROADGROUP);

    public static final Block ARROW_SIGN_TOPLEFT = registerBlock("arrow_sign_topleft",
            new HorizontalRotationRoadSign(FabricBlockSettings
                    .of(Material.METAL)
                    .strength(0.5f)
                    .requiresTool()
                    .nonOpaque()
            ), RoadItemGroup.ROADGROUP);

    public static final Block ARROW_SIGN_TOP = registerBlock("arrow_sign_top",
            new HorizontalRotationRoadSign(FabricBlockSettings
                    .of(Material.METAL)
                    .strength(0.5f)
                    .requiresTool()
                    .nonOpaque()
            ), RoadItemGroup.ROADGROUP);

    public static final Block ARROW_SIGN_TOPRIGHT = registerBlock("arrow_sign_topright",
            new HorizontalRotationRoadSign(FabricBlockSettings
                    .of(Material.METAL)
                    .strength(0.5f)
                    .requiresTool()
                    .nonOpaque()
            ), RoadItemGroup.ROADGROUP);

    public static final Block ARROW_SIGN_RIGHT = registerBlock("arrow_sign_right",
            new HorizontalRotationRoadSign(FabricBlockSettings
                    .of(Material.METAL)
                    .strength(0.5f)
                    .requiresTool()
                    .nonOpaque()
            ), RoadItemGroup.ROADGROUP);

    public static final Block ARROW_SIGN_BOTTOMRIGHT = registerBlock("arrow_sign_bottomright",
            new HorizontalRotationRoadSign(FabricBlockSettings
                    .of(Material.METAL)
                    .strength(0.5f)
                    .requiresTool()
                    .nonOpaque()
            ), RoadItemGroup.ROADGROUP);

    public static final Block ARROW_SIGN_UTURN = registerBlock("arrow_sign_uturn",
            new HorizontalRotationRoadSign(FabricBlockSettings
                    .of(Material.METAL)
                    .strength(0.5f)
                    .requiresTool()
                    .nonOpaque()
            ), RoadItemGroup.ROADGROUP);

    // PLACE SIGNS

    public static final Block SIGN_TRAIN = registerBlock("sign_train",
            new HorizontalRotationRoadSign(FabricBlockSettings
                    .of(Material.METAL)
                    .strength(0.5f)
                    .requiresTool()
                    .nonOpaque()
            ), RoadItemGroup.ROADGROUP);

    public static final Block SIGN_FERRY = registerBlock("sign_ferry",
            new HorizontalRotationRoadSign(FabricBlockSettings
                    .of(Material.METAL)
                    .strength(0.5f)
                    .requiresTool()
                    .nonOpaque()
            ), RoadItemGroup.ROADGROUP);

    public static final Block SIGN_AIRPLANE = registerBlock("sign_airplane",
            new HorizontalRotationRoadSign(FabricBlockSettings
                    .of(Material.METAL)
                    .strength(0.5f)
                    .requiresTool()
                    .nonOpaque()
            ), RoadItemGroup.ROADGROUP);

    // OTHER ROAD SIGNS

    public static final Block SIGN_UTURN_PERMITTED = registerBlock("sign_uturn_permitted",
            new HorizontalRotationRoadSign(FabricBlockSettings
                    .of(Material.METAL)
                    .strength(0.5f)
                    .requiresTool()
                    .nonOpaque()
            ), RoadItemGroup.ROADGROUP);

    // MISC



    public static final Block MISC_TRAFFIC_CONE = registerBlock("misc_traffic_cone",
            new TrafficCone(FabricBlockSettings
                    .of(Material.METAL)
                    .strength(0.5f)
                    .requiresTool()
                    .nonOpaque()
            ), RoadItemGroup.ROADGROUP);

    public static final Block MISC_GUTTER_SIDE = registerBlock("misc_gutter_side",
            new HorizontalRotationLightingFixRegularBlock(FabricBlockSettings
                    .of(Material.METAL)
                    .strength(0.5f)
                    .requiresTool()
                    .nonOpaque()
            ), RoadItemGroup.ROADGROUP);

    public static final Block MISC_GUTTER_CORNER_OUT = registerBlock("misc_gutter_corner_out",
            new HorizontalRotationLightingFixRegularBlock(FabricBlockSettings
                    .of(Material.METAL)
                    .strength(0.5f)
                    .requiresTool()
                    .nonOpaque()
            ), RoadItemGroup.ROADGROUP);

    public static final Block MISC_GUTTER_CORNER_IN = registerBlock("misc_gutter_corner_in",
            new HorizontalRotationLightingFixRegularBlock(FabricBlockSettings
                    .of(Material.METAL)
                    .strength(0.5f)
                    .requiresTool()
                    .nonOpaque()
            ), RoadItemGroup.ROADGROUP);

    public static final Block MISC_BUS_STOP_U_SHAPE = registerBlock("misc_bus_stop_u_shape",
            new HorizontalRotationRoadSign(FabricBlockSettings
                    .of(Material.METAL)
                    .strength(0.5f)
                    .requiresTool()
                    .nonOpaque()
            ), RoadItemGroup.ROADGROUP);

    public static final Block MISC_BUS_STOP_REGULAR = registerBlock("misc_bus_stop_regular",
            new HorizontalRotationRoadSign(FabricBlockSettings
                    .of(Material.METAL)
                    .strength(0.5f)
                    .requiresTool()
                    .nonOpaque()
            ), RoadItemGroup.ROADGROUP);




    public static void registerModBlocks() {
        FabricRoad.LOGGER.info("FabricRoads blocks init");
    }

}
