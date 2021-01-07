/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.claro.cavGarantias.ws;

import co.com.claro.cavGarantias.model.DataResponse;
import co.com.claro.cavGarantias.model.GenericResponse;
import java.util.List;
import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.*;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;

/**
 *
 * @author ElkinJ
 */
@Path("cavGarantias")
@Stateless
@TransactionManagement
public class cavGarantiasService {

//    @EJB
//    private CavGarFacade cavGarFacade;
    public cavGarantiasService() {
    }

    @GET
    @Consumes("application/json")
    @Produces("application/json")
    @Path("queryCavsAll")
    public DataResponse queryCavsAll(@QueryParam("codeCav") String codeCav) {
        DataResponse responseEnd = new DataResponse();
        try {
            GenericResponse response = new GenericResponse(true, "Consulta exitosa.");
            // List<CavGar> list = cavGarFacade.queryCodeCav("2");
//            responseEnd.setCavs(cavGarFacade.findAll());
            responseEnd.setResponse(response);
        } catch (Exception e) {
            GenericResponse response = new GenericResponse(false, "Ocurrió un error al consultar los CAVs. Detalle:" + e.getMessage());
//            responseEnd.setCavs(null);
            responseEnd.setResponse(response);
        }
        return responseEnd;
    }

}
