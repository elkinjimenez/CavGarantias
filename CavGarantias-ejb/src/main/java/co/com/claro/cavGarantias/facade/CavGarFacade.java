/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.claro.cavGarantias.facade;

import co.com.claro.cavGarantias.entity.CavGar;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author jimenezelkg
 */
@Stateless
public class CavGarFacade extends AbstractFacade<CavGar> {

    @PersistenceContext(unitName = "co.com.claro.cavGarantias_CavGarantias-ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CavGarFacade() {
        super(CavGar.class);
    }
    
}
