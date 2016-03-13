/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.elina.game;

import com.elina.game.commands.GameCommand;
import com.elina.game.commands.GameCommandFactory;
import com.elina.game.entity.Player;
import java.util.Scanner;

/**
 *
 * @author NV
 */
public class Engine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("=============================================");
        System.out.println("*welcome to text based game*");
        System.out.println("=============================================");
        Scanner input =new Scanner(System.in);
       
                
        Player player = new Player();
        System.out.print("Please enter your name:");
        player.setPlayer(input.nextLine());
        System.out.println( player.getName()+ "  is ready.....  ");
         
        while(true){
            System.out.println("Enter command >");
            String cmd= input.nextLine();
             String[] params=cmd.split(" ");
           GameCommand gameCmd=GameCommandFactory.get(params[0]);
           if(gameCmd==null){
               System.out.println("Invalid command");
           }else{
               gameCmd.execute(player, params);
           }
       
            
            
            
        }
    }

   
    
}
