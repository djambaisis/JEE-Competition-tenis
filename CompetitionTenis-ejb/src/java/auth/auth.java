/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auth;

import entities.User;
import javax.ejb.EJB;
import javax.ejb.Stateful;
import managers.AdministrateurManager;
import managers.ParticipantManager;

/**
 *
 * @author ppitbull
 */
@Stateful
public class auth implements authLocal {

    @EJB(beanName="AdministrateurManager") 
    private AdministrateurManager adminManager;
    private ParticipantManager participantManager;
    
    private User authUser=null;
    
    @Override
    public boolean login(User entity) {
       User user=participantManager.exist(entity);
       if(user==null) 
       {
           user=adminManager.exist(user);
           if(user==null) return false;
       }
       authUser=user;
       return true;
    }

    @Override
    public boolean register(User entity) {
        if(login(entity))
        {
            authUser=null;
            return false;
        }
        participantManager.create(entity);
        return login(entity);
    }

    @Override
    public void forgotPassword(User entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isAuthentificate() {
        return authUser!=null;
    }
    
}
