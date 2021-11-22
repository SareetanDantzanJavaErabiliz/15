/**
 *
 * Egileak: Iñaki Goirizelaia eta Maider Huarte
 */

package webbezeroa2019;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Teklatua {

    public static String irakurriKatea( ) {
        String karakKatea;
        try( BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) ) ) {
            karakKatea = br.readLine( );
        } 
        catch( Exception e ) {
            karakKatea = "";
        }

        return karakKatea;
    }

    public static int irakurriOsoa( ) {
        int osoa;

        try {
            osoa = Integer.parseInt( irakurriKatea( ).trim( ) );
        } 
        catch( Exception e ) {
            osoa = 0;
        }

        return osoa;
    }
}

