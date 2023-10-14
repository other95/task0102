package ru.childnov;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int a = Integer.parseInt(br.readLine());
            int b = Integer.parseInt(br.readLine());
            GCD c = new GCD();
            System.out.println( "1-е число : " + a + "\n" +
                                "2-е число : " + b + "\n" +
                                 "Наибольший общий делитель : " + c.getDivisor(a,b));

        }
        catch (IOException e) {
            System.out.println("Ощибка ввода/вывод");
        }

    }
}
