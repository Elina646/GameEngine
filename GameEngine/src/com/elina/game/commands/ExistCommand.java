/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.elina.game.commands;

import com.elina.game.entity.Player;

/**
 *
 * @author NV
 */
public class ExistCommand extends GameCommand {

    @Override
    public void execute(Player player,String[] param) {
        System.out.println("Closing Game .......");
        System.exit(0);
        }
    
    
}
