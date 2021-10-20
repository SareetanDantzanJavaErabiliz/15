
package webbezeroa2019;

/**
 *
 * Egileak: Iñaki Goirizelaia eta Maider Huarte
 */
import java.io.*;
//import java.util.*;

public class Teklatua {

    public static String irakurriKatea( ) {
        //BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        String karakKatea;
//        Scanner sc = new Scanner( System.in );
        try( BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) ) ) {
            karakKatea = br.readLine( );
//            str = sc.nextLine( );
        } 
        catch( Exception e ) {
            karakKatea = "";
        }

        return karakKatea;
    }

    public static int irakurriOsoa( ) {
        int osoa;
//        Scanner sc = new Scanner( System.in );

        try {
            osoa = Integer.parseInt( irakurriKatea( ).trim( ) );
//            osoa = sc.nextInt( );
        } 
        catch( Exception e ) {
            osoa = 0;
        }

        return osoa;
    }
}

