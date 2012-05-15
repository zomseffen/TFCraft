package net.minecraft.src.TFC_Core;

import net.minecraft.src.ItemBlock;
import net.minecraft.src.ItemStack;
import net.minecraft.src.forge.ITextureProvider;

public class ItemMMCobble extends ItemBlock implements ITextureProvider
{
	public static String[] blockNames = { "Quartzite", "Slate", "Phyllite", "Schist", "Gneiss", "Marble", };


	public ItemMMCobble(int i) 
	{
		super(i);
		setHasSubtypes(true);
		this.setMaxDamage(0);
	}

	@Override
	public String getItemNameIS(ItemStack itemstack) 
	{
		String s = new StringBuilder().append(super.getItemName()).append(".").append(blockNames[itemstack.getItemDamage()]).toString();
		return s;
	}
	@Override
	public int getMetadata(int i) 
	{		
		return i;
	}

	@Override
	public String getTextureFile()
	{
		return "/bioxx/terraRock.png";
	}
}
