/*
 * Egileak: Iñaki Goirizelaia eta Maider Huarte
 * 
 * 
*/

public class WebServiceBezeroa {
    public static void main( String parametroak[ ] ) {
        System.out.println( "Web Service frogatzeko bezero programa" );
        System.out.print( "Idatz ezazu zure izena: " );
        String izena = Teklatua.irakurriKatea( );

        System.out.print( "Idatz ezazu zure adina: " );
        int adina = Teklatua.irakurriOsoa( );
        
        String esaldia = ongiEtorria( izena, adina );
        System.out.println( esaldia );       
    }

    private static String ongiEtorria( java.lang.String izena, int adina ) {
        ibp.ws.WebZerbitzua_Service service = new ibp.ws.WebZerbitzua_Service( );
        ibp.ws.WebZerbitzua port = service.getWebZerbitzuaPort( );
        return port.ongiEtorria( izena, adina );
    }
}
