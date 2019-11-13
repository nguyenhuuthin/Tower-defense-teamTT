package mrmathami.thegame.entity.tile.tower;

import mrmathami.thegame.Config;
import mrmathami.thegame.entity.bullet.SniperBullet;

import javax.annotation.Nonnull;

public class SniperTower extends AbstractTower {
    public SniperTower(long createdTick, long posX, long posY){
        super(createdTick,posX,posY, Config.SNIPER_TOWER_RANGE, Config.SNIPER_TOWER_SPEED);
    }
    @Nonnull
    @Override
    protected SniperBullet doSpawn(long createdTick, double posX, double posY, double deltaX, double deltaY){
        return new SniperBullet(createdTick,posX,posY,deltaX,deltaY);
    }
}
