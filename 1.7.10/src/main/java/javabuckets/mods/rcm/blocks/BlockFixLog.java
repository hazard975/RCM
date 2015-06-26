package javabuckets.mods.rcm.blocks;

import javabuckets.mods.rcm.utility.Reference;
import net.minecraft.block.BlockRotatedPillar;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockFixLog extends BlockRotatedPillar
{
	@SideOnly(Side.CLIENT)
	private IIcon topAndBottom;
	@SideOnly(Side.CLIENT)
	private IIcon sides;
	
	public BlockFixLog() 
	{
		super(Material.wood);
		this.setStepSound(soundTypeWood);
	}

	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister par1IconRegister) 
	{
		blockIcon = par1IconRegister.registerIcon(Reference.MOD_ID + ":" + getTextureName() + "_top_and_bottom");
		sides = par1IconRegister.registerIcon(Reference.MOD_ID + ":" + getTextureName() + "_sides");
		topAndBottom = par1IconRegister.registerIcon(Reference.MOD_ID + ":" + getTextureName() + "_top_and_bottom");
	}

	@Override
	protected IIcon getSideIcon(int p_150163_1_) 
	{
		return sides;
	}
	
	@Override
	protected IIcon getTopIcon(int p_150161_1_)
	{
		return topAndBottom;
	}
}