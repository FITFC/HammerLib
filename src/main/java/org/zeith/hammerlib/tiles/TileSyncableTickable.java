package org.zeith.hammerlib.tiles;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityTicker;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import org.zeith.hammerlib.util.mcf.WorldHelper;

import java.util.Random;

public class TileSyncableTickable
		extends TileSyncable
		implements BlockEntityTicker
{
	/**
	 * If changed in the constructor, may change random's seed.
	 */
	protected boolean positionedRandom = false;
	public int ticksExisted = 0;

	public TileSyncableTickable(BlockEntityType<?> type, BlockPos pos, BlockState state)
	{
		super(type, pos, state);
		rand = null;
	}

	@Override
	public Random getRNG()
	{
		/** Make unique random for each position */
		if(rand == null)
			rand = new Random(positionedRandom && level != null ? ((level instanceof ServerLevel ? ((ServerLevel) level).getSeed() : 0L) + worldPosition.asLong() + WorldHelper.getLevelId(level).hashCode() * 41L - getClass().getName().hashCode()) : System.nanoTime());
		return rand;
	}

	public boolean atTickRate(int rate)
	{
		return ticksExisted % rate == 0;
	}

	public void update()
	{
	}

	// 1.17 BS -_-
	@Override
	public final void tick(Level level, BlockPos pos, BlockState state, BlockEntity be)
	{
		if(be == this)
		{
			this.level = level;

			update();
			ticksExisted++;
		}
	}
}