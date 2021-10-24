/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managers;

import entities.Candidature;
import entities.EntityTennisCompetition;
import java.util.List;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author ppitbull
 */
@Stateless
@LocalBean
public class CandidatureManager extends ManagerTennisCompetition {
    
    @Override
    public List<EntityTennisCompetition> getAll() {
        Query query=em.createNamedQuery("Candidature.findAll");
        return query.getResultList();
    }
}
