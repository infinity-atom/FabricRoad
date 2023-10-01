package com.infinityatom.fabricroad.block;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;

public class RoadSignPole extends Block {

    public RoadSignPole(Settings settings) {
        super(settings);
    }

    private static VoxelShape SHAPE = Block.createCuboidShape(6, 0, 6, 10, 16, 10);


}

