package me.sub.angels.common.misc;

import me.sub.angels.common.WAObjects;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class WATabs {
	
	public static CreativeTabs MAIN_TAB = new CreativeTabs("angels") {
		@Override
		public ItemStack getTabIconItem() {
			return new ItemStack(WAObjects.Items.TIMEY_WIMEY_DETECTOR);
		}
	};
	
}
