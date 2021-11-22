/**
 *
 * Egileak: Iñaki Goirizelaia eta Maider Huarte. UPV/EHU
 */

import java.util.Scanner;

public class Teklatua {

    public static String irakurriKatea( ) {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        Scanner sc = new Scanner( System.in );
        try {
            //str = br.readLine( );
            str = sc.nextLine( );
        } 
        catch( Exception e ) {
            str = "";
        }

        return str;
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
