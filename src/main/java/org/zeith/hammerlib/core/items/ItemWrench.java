package org.zeith.hammerlib.core.items;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.*;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;
import org.zeith.api.wrench.IWrenchItem;
import org.zeith.hammerlib.annotations.RegistryName;
import org.zeith.hammerlib.annotations.SimplyRegister;
import org.zeith.hammerlib.api.items.IDynamicallyTaggedItem;
import org.zeith.hammerlib.core.init.TagsHL;
import org.zeith.hammerlib.proxy.HLConstants;

import java.util.*;
import java.util.stream.Stream;

@SimplyRegister
public class ItemWrench
		extends Item
		implements IWrenchItem, IDynamicallyTaggedItem
{
	@RegistryName("wrench")
	public static final ItemWrench WRENCH = new ItemWrench(new Properties().tab(HLConstants.HL_TAB).stacksTo(1));
	
	public final List<CreativeModeTab> extraTabs = new ArrayList<>(List.of(HLConstants.HL_TAB));
	
	public ItemWrench(Properties props)
	{
		super(props);
	}
	
	@Override
	public Collection<CreativeModeTab> getCreativeTabs()
	{
		return extraTabs;
	}
	
	@Override
	public void playWrenchSound(UseOnContext context)
	{
		Level world = context.getLevel();
		if(!world.isClientSide && world instanceof ServerLevel)
		{
			Vec3 e = context.getClickLocation();
			world.playSound(null, e.x, e.y, e.z, SoundEvents.TRIPWIRE_CLICK_ON, SoundSource.PLAYERS, 1.0F, 1.5F);
		}
	}
	
	@Override
	public Stream<TagKey<Item>> getExtraItemTags(ItemStack stack)
	{
		return Stream.of(TagsHL.Items.TOOLS_WRENCH);
	}
}