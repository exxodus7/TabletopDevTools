/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.schroetech.game.cantstop.player;

import com.schroetech.game.AbstractPlayer;
import com.schroetech.game.object.Dice;
import java.util.Collection;
import java.util.Map;

/**
 *
 * @author lauren
 */
public abstract class AbstractCantStopPlayer extends AbstractPlayer {

    public abstract int[] takeTurn(Map<String, int[]> board, Collection<Dice> dice);

    public abstract boolean continueOrStop(Map<String, int[]> board);
}
