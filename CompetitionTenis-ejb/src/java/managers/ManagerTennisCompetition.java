/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managers;

import entities.EntityTennisCompetition;
import java.util.List;
import javax.ejb.Local;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author ppitbull
 */
@Local
public abstract class ManagerTennisCompetition {
   @PersistenceContext(unitName = "CompetitionTenis-ejbPU")
    protected EntityManager em;

    public void create(EntityTennisCompetition entity) {
        this.persist(entity);
    }

    public EntityTennisCompetition update(EntityTennisCompetition entity) {
        return em.merge(entity);
    }

    public void delete(EntityTennisCompetition entity) {
        em.remove(entity);
    }
     public void persist(Object object) {
        em.persist(object);
    }
    abstract List<EntityTennisCompetition> getAll();
    
}
