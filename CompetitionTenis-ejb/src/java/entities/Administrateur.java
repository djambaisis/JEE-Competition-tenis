/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ppitbull
 */
@Entity
@Table(name = "administrateur")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Administrateur.findAll", query = "SELECT a FROM Administrateur a")
    , @NamedQuery(name = "Administrateur.findById", query = "SELECT a FROM Administrateur a WHERE a.id = :id")
    , @NamedQuery(name = "Administrateur.findByNom", query = "SELECT a FROM Administrateur a WHERE a.nom = :nom")
    , @NamedQuery(name = "Administrateur.findByPrenom", query = "SELECT a FROM Administrateur a WHERE a.prenom = :prenom")
    , @NamedQuery(name = "Administrateur.findByEmail", query = "SELECT a FROM Administrateur a WHERE a.email = :email")
    , @NamedQuery(name = "Administrateur.findByTel", query = "SELECT a FROM Administrateur a WHERE a.tel = :tel")
    , @NamedQuery(name = "Administrateur.findBySexe", query = "SELECT a FROM Administrateur a WHERE a.sexe = :sexe")
    , @NamedQuery(name = "Administrateur.findByMdp", query = "SELECT a FROM Administrateur a WHERE a.mdp = :mdp")
    , @NamedQuery(name ="Administrateur.findByEmailAndMdp", query="SELECT a FROM Administrateur a WHERE a.email=:email AND a.mdp=:mdp")
})
public class Administrateur extends User implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private String mdp;

    public Administrateur() {
        super();
    }

    public Administrateur(Integer id) {
        super(id);
    }

    public Administrateur(Integer id, String nom, String prenom, String email, int tel, Character sexe, String mdp) {
        super(id, nom, prenom, email, tel, sexe, mdp);
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Administrateur)) {
            return false;
        }
        Administrateur other = (Administrateur) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Administrateur[ id=" + id + " ]";
    }
    
}
