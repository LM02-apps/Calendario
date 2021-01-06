/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Melone
 */
import java.util.Date;

public class Calendario 
{
    private int giorno;
    private int mese;
    private int anno;

    private int[] giorni={31,28,31,30,31,30,31,31,30,31,30,31};
    
    public Calendario(int giorno, int mese, int anno) 
    {
        this.giorno = giorno;
        this.mese = mese-1;
        this.anno = anno;
        if(anno%400==0 || (anno%4==0) && anno%100!=0)
        {
            giorni[1]=29;
        }
    }
    
    
    public String Giornosettimana()
    {
        int t=0;
        String nome="";
        for (int i=0;i<mese;i++)
        {
            t+=giorni[i];
        }
        t+=giorno;
    
    
    
        double x=anno+java.lang.Math.floor((anno-1)/4)-java.lang.Math.floor((anno-1)/100)+java.lang.Math.floor((anno-1)/400)+t;
        x=x%7;
        
        if(x==0)
        {
            nome="sabato";
        }
        if(x==1)
        {
            nome="domenica";
        }
        if(x==2)
        {
            nome="lunedi";
        }
        if (x==3)
        {
            nome="martedi";
        }
        if (x==4)
        {
            nome="mercoledi";
        }
        if (x==5)
        {
            nome="giovedi";
        }
        if (x==6)
        {
            nome="venerdi";
        }
        return nome;
    }
    
    public String GiornoSuccessivo()
    {
        String data="";
        if (giorno==31 && mese==11)
        {
            data=1+"/"+1+"/"+(anno+1);
        }
        else
        {
            int t=0, i=0, j=0;
            for (j=0;j<mese;j++)
            {
                t+=giorni[j];
            }
            t+=giorno+1;
            
            
            for(i=0;t>0;i++)
            {
                t-=giorni[i];
            }
            t+=giorni[i-1];
            data=t+"/"+i+"/"+anno;
            }
            return data;
        }
}
    
   //x = 1988 +(q)(1988-1) : 4 - (q)(1988-1) : 100 + (q)(1988-1) : 400 + 122 
   //= 1988 + 496 - 19 + 4 + 122 = 2591
   //q=1988-1:4=496 con resto 3
   
    

