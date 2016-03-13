/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.elina.game.commands;

/**
 *
 * @author NV
 */
public class GameCommandFactory {
    public static GameCommand get(String cmd){
        
        if(cmd.equalsIgnoreCase("walk")){
            return new Walk();
        }
        else if(cmd.equalsIgnoreCase("run")){
            return new RunCommand();
        } 
        else if(cmd.equalsIgnoreCase("pick")){
            return new PickCommand();
        }
        else if(cmd.equalsIgnoreCase("drop")){
            return new DropCommand();
        }
         else if(cmd.equalsIgnoreCase("exist")){
            return new ExistCommand();
        }
        return null;
    }
    
}
