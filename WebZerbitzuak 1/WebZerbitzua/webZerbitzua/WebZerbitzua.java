/**
 *
 * Egileak: Iñaki Goirizelaia eta Maider Huarte. UPV/EHU
 */

package webZerbitzua;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService( serviceName = "WebZerbitzua" )
public class WebZerbitzua {

    @WebMethod( operationName = "ongiEtorria" )
    public String ongiEtorria( @WebParam(name = "izena" ) String i, @WebParam( name = "adina" ) int a) {
        return "Kaixo " + i + "! "+a+" urte dituzu, ezta?";
    }
}
