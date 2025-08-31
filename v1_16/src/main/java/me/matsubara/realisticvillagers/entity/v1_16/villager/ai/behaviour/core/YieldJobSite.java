package me.matsubara.realisticvillagers.entity.v1_16.villager.ai.behaviour.core;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.npc.Villager;

public class YieldJobSite extends net.minecraft.world.entity.ai.behavior.YieldJobSite {

    public YieldJobSite(float speedModifier) {
        super(speedModifier);
    }

    @Override
    public boolean checkExtraStartConditions(ServerLevel level, Villager villager) {
        return super.checkExtraStartConditions(level, villager) && GoToPotentialJobSite.isDoingNothing(villager);
    }
}