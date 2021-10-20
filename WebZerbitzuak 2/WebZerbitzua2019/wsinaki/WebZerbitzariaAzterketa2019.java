
package wsinaki;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * Egileak: Iñaki Goirizelaia eta Maider Huarte, UPV/EHU
 * 
 */
@WebService( serviceName = "WebZerbitzariaAzterketa2019" )
public class WebZerbitzariaAzterketa2019 {

    /**
     * Web service operation
     */
    @WebMethod( operationName = "EsaldiariBueltaEman" )
    public String EsaldiariBueltaEman( @WebParam ( name = "Esaldia" ) String esaldia ) {
        
        int i = 0, j = esaldia.length( ) - 1;
        char laguntza, karArray[ ] = esaldia.toCharArray( );
        
        while ( ( i < j ) && ( i < esaldia.length( ) ) ) {
            laguntza = esaldia.charAt( j );
            karArray[ j ] = karArray[ i ];
            karArray[ i ] = laguntza;
            i++;
            j--;
        }
        String esaldiaBueltaEmanda = new String( karArray );
        return esaldiaBueltaEmanda;
    }
}