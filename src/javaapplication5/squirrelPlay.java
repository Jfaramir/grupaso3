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
public class squirrelPlay {
        public boolean squirrelPlay(int temp, boolean isSummer) {
        if (isSummer && 60 <= temp && temp <= 100) {
            return true;
        }

        if (!isSummer && 60 <= temp && temp <= 90) {
            return true;
        }

        return false;
    }

}
