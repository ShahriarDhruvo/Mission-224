package com.mission224.game.sprites.tileObjects;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.math.Rectangle;
import com.mission224.game.Main;
import com.mission224.game.screens.PlayScreen;
import com.mission224.game.sprites.enemies.SmallFries1;

public class EnemyDetectionArea extends InteractiveTileObject {

    public EnemyDetectionArea(PlayScreen screen, Rectangle bounds) {
        super(screen, bounds);
        fixture.setUserData(this);
        setCategoryFilter(Main.PLAYER_DETECTION_BIT);
    }

    @Override
    public void onSideHit() {
        Gdx.app.log("Player", "Detected");
        SmallFries1.detect = true;
        SmallFries1.playerEnemyCollision = true;
    }
}
