/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managers;

import entities.User;

/**
 *
 * @author ppitbull
 */
public abstract class UserManager extends ManagerTennisCompetition {
    abstract public User exist(User user);    
}
