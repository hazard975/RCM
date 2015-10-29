package javabuckets.mods.rcm.skills.woodcutting;

import cpw.mods.fml.common.registry.GameRegistry;
import javabuckets.mods.rcm.blocks.BlockRSWood;
import net.minecraft.block.Block;

public class ModWoodcuttingBlocks 
{
	public static Block willowLog;
	public static Block teakLog;
	public static Block mapleLog;
	public static Block mahoganyLog;
	public static Block yewLog;
	public static Block chokingIvy;
	public static Block magicLog;
	public static Block elderLog;

	public static void init()
	{
		willowLog = new BlockRSWood().setHardness(3F).setBlockTextureName("willow_log").setBlockName("willow_log");
		GameRegistry.registerBlock(willowLog, "willow_log");
		
		teakLog = new BlockRSWood().setHardness(3.5F).setBlockTextureName("teak_log").setBlockName("teak_log");
		GameRegistry.registerBlock(teakLog, "teak_log");
		
		mapleLog = new BlockRSWood().setHardness(4F).setBlockTextureName("maple_log").setBlockName("maple_log");
		GameRegistry.registerBlock(mapleLog, "maple_log");
		
		mahoganyLog = new BlockRSWood().setHardness(5F).setBlockTextureName("mahogany_log").setBlockName("mahogany_log");
		GameRegistry.registerBlock(mahoganyLog, "mahogany_log");
		
		yewLog = new BlockRSWood().setHardness(6.5F).setBlockTextureName("yew_log").setBlockName("yew_log");
		GameRegistry.registerBlock(yewLog, "yew_log");
		
		/*chokingIvy = new BlockChokingIvy().setHardness(7F).setBlockTextureName("choking_ivy").setBlockName("choking_ivy");
		GameRegistry.registerBlock(chokingIvy, "choking_ivy");*/
		
		magicLog = new BlockRSWood().setHardness(7.5F).setBlockTextureName("magic_log").setBlockName("magic_log");
		GameRegistry.registerBlock(magicLog, "magic_log");
		
		elderLog = new BlockRSWood().setHardness(9F).setBlockTextureName("elder_log").setBlockName("elder_log");
		GameRegistry.registerBlock(elderLog, "elder_log");
	}
}