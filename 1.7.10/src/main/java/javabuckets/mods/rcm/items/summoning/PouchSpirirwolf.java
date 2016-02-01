package javabuckets.mods.rcm.items.summoning;

import javabuckets.mods.rcm.entities.summoning.FamiliarSpiritwolf;
import javabuckets.mods.rcm.items.ItemBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class PouchSpirirwolf extends ItemBase
{
	public PouchSpirirwolf(String unlocalizedName) 
	{
		super(unlocalizedName);
		this.setMaxStackSize(1);
	}

	public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer player) 
	{
		FamiliarSpiritwolf entityWolf = new FamiliarSpiritwolf(world);
		
		world.spawnEntityInWorld(entityWolf);
		
		itemstack.stackSize--;
		
		return itemstack;
	}
}