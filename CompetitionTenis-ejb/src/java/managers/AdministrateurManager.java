/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managers;

import entities.EntityTennisCompetition;
import entities.User;
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
public class AdministrateurManager extends UserManager{    

    @Override
    public List<EntityTennisCompetition> getAll() {
        Query query=em.createNamedQuery("Administrateur.findAll");
        return query.getResultList();
    }
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")   

    @Override
    public User exist(User user) {
        Query query=em.createNamedQuery("Participant.findByEmailAndMdp");
        query.setParameter("email", user.getEmail());
        query.setParameter("mdp", user.getMdp());
        return  query.getResultList().size()>0?(User)query.getResultList().get(0):null;
    }
    
}
