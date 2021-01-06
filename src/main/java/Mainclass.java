/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Melone
 */
public class Mainclass 
{
    public static void main(String[] args)
    {
        Calendario uno=new Calendario (9,11,2015);
        System.out.println(uno.Giornosettimana());
        System.out.println(uno.GiornoSuccessivo());
    }
}
