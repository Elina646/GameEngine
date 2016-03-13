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
public class PickCommand extends GameCommand {

    @Override
    public void execute(Player player,String[] param) {
        if(param.length==1){
            System.out.println("I dont know what to pick");
        }else{
        System.out.println(player.getName() +"is picking"+ param[1]);    
    }
       
}
}
