/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auth;

import entities.User;
import javax.ejb.Local;

/**
 *
 * @author ppitbull
 */
@Local
public interface authLocal {
    boolean isAuthentificate();
    boolean login(User entity);
    boolean register(User entity);
    void forgotPassword(User entity);
}
