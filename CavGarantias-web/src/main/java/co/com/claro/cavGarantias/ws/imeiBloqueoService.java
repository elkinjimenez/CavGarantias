/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.claro.imeiBloqueo.ws;

import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.*;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;

/**
 *
 * @author omarMad
 */
@Path("imeiBloqueo")
@Stateless
@TransactionManagement
public class imeiBloqueoService {

    @EJB
    private CodigoscvcOtpFacade codigosCVCFacade;

    public imeiBloqueoService() {
    }

    @GET
    @Consumes("application/json")
    @Produces("application/json")
    @Path("searchCode")
    public String searchCode(@QueryParam("code") String code) {
        String data = "HOla";
        return data;
    }

}
