package javabuckets.mods.rcm.skills.mining;

import javabuckets.mods.rcm.main.RCM;
import javabuckets.mods.rcm.skills.BaseSkill;
import javabuckets.mods.rcm.utility.DailyChallengeReference;
import javabuckets.mods.rcm.utility.LevelUpUtil;
import javabuckets.mods.rcm.utility.SkillReference;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class MiningHandler extends BaseSkill
{
	public static boolean isMining = false;
	private int miningResetTimer = 10;

	public void mining(EntityPlayer player, World world) 
	{
		setLvlFromXPList();
		miningChecker();
	}

	public void miningChecker()
	{
		if (isMining)
		{
			--miningResetTimer;

			if (miningResetTimer <= 0)
			{
				isMining = false;
				miningResetTimer = 10;
			}
		}
	}

	public void setLvlFromXPList()
	{
		if (isMining)
		{
			for (int i = 1; i <= 120; i++)
			{
				setLvlFromXP(SkillReference.getXpFromLvl(i), SkillReference.getXpFromLvl(i+1), i);
			}

			setbackXPIfTooHigh(200000000D);
			setbackLvlIfTooHigh(99);
			
			if (!(LevelUpUtil.getLevel(SkillReference.mine) == RCM.instance.skillHandler.getLevel(SkillReference.mine)))
			{
				RCM.instance.skillHandler.levelUp(SkillReference.mine, RCM.instance.skillHandler.getLevel(SkillReference.mine));
				LevelUpUtil.lvlHandling();
			}
		}
	}

	public void setLvlFromXP(double xpMin, double xpMax, int level) 
	{
		if (RCM.instance.skillHandler.getExperience(SkillReference.mine) >= xpMin && RCM.instance.skillHandler.getExperience(SkillReference.mine) < xpMax)
		{
			RCM.instance.skillHandler.setLevel(SkillReference.mine, level, RCM.instance.skillHandler.getExperience(SkillReference.mine));
		}
	}

	public void setbackLvlIfTooHigh(int level) 
	{
		if (RCM.instance.skillHandler.getLevel(SkillReference.mine) > level) 
		{
			RCM.instance.skillHandler.setLevel(SkillReference.mine, level, RCM.instance.skillHandler.getExperience(SkillReference.mine));
		}
	}

	public void setbackXPIfTooHigh(double xp) 
	{
		if (RCM.instance.skillHandler.getExperience(SkillReference.mine) > xp)
		{
			RCM.instance.skillHandler.setExperience(SkillReference.mine, xp);
		}
	}
}