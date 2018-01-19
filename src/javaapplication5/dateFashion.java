/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

/**
 *
 * @author victoranovertrujillo
 */
public class dateFashion {
    public int dateFashion(int you, int date) {

  if ((you >= 8 && date > 2) || (date >= 8 && you > 2))

    return 2;

  if (you <= 2 || date <= 2)

    return 0;

  else

    return 1;



    
}
}
