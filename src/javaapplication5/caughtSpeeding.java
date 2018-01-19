/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

/**
 *
 * @author xp
 */
public class caughtSpeeding {
     public int caughtSpeeding(int speed, boolean isBirthday) {
  if ( speed > 65 && speed <= 85 && isBirthday == true )
   return 1;
  if ( speed >= 86 && isBirthday == true )
   return 2;
  if ( speed <= 65 && isBirthday == true )
   return 0;
  if ( speed > 60 && speed <= 80 )
   return 1;
  if ( speed >= 81 )
   return 2;
  else
   return 0;
   
}
    
}
