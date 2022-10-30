package net.sanberdir.lessen.world.surface;

import com.mojang.serialization.Codec;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.IChunk;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;

import java.util.Random;

public class ConcreteGraySurfaceBuilder extends SurfaceBuilder<SurfaceBuilderConfig> {
    public static final BlockState CLAY = Blocks.CLAY.getDefaultState();
    public static final BlockState GRAY_CONCRETE = Blocks.GRAY_CONCRETE_POWDER.getDefaultState();

    public static final SurfaceBuilderConfig GRAY_CONCRETE_BLOCK_CONFIG = new SurfaceBuilderConfig(GRAY_CONCRETE, CLAY, CLAY);

    public ConcreteGraySurfaceBuilder(Codec<SurfaceBuilderConfig> codec) {
        super(codec);
    }
    @Override
    public void buildSurface(Random random, IChunk chunkIn, Biome biomeIn, int x, int z, int startHeight, double noise,
                             BlockState defaultBlock, BlockState defaultFluid, int seaLevel, long seed, SurfaceBuilderConfig config) {
        if (random.nextInt(2) == 0){
            SurfaceBuilder.DEFAULT.buildSurface(random, chunkIn, biomeIn, x, z, startHeight, noise, defaultBlock, defaultFluid, seaLevel, seed, GRAY_CONCRETE_BLOCK_CONFIG);
        }
        else {
            SurfaceBuilder.DEFAULT.buildSurface(random, chunkIn, biomeIn, x, z, startHeight, noise, defaultBlock, defaultFluid, seaLevel, seed, GRAY_CONCRETE_BLOCK_CONFIG);
        }
    }
}
