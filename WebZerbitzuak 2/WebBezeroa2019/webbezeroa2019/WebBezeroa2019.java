
package webbezeroa2019;

/**
 *
 * Egileak: Iñaki Goirizelaia eta Maider Huarte
 */
public class WebBezeroa2019 {

     public static void main( String[ ] parametroak ) {
        
        System.out.println( "Mesedez, sartu esaldia eta zerbitzariak buelta emango dio:" );
        String esaldia = Teklatua.irakurriKatea( );
        String emaitza = esaldiariBueltaEman( esaldia );
        System.out.println( "Zerbitzariak buelta eman dio esaldiari" );
        System.out.println( "Esaldi berria irakurri: "+emaitza );
    }

    private static String esaldiariBueltaEman( java.lang.String esaldia ) {
        wsinaki.WebZerbitzariaAzterketa2019_Service service = new wsinaki.WebZerbitzariaAzterketa2019_Service( );
        wsinaki.WebZerbitzariaAzterketa2019 port = service.getWebZerbitzariaAzterketa2019Port( );
        return port.esaldiariBueltaEman( esaldia );
    }
    
}
