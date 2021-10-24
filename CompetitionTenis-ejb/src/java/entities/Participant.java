/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ppitbull
 */
@Entity
@Table(name = "participant")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Participant.findAll", query = "SELECT p FROM Participant p")
    , @NamedQuery(name = "Participant.findById", query = "SELECT p FROM Participant p WHERE p.id = :id")
    , @NamedQuery(name = "Participant.findByNom", query = "SELECT p FROM Participant p WHERE p.nom = :nom")
    , @NamedQuery(name = "Participant.findByPrenom", query = "SELECT p FROM Participant p WHERE p.prenom = :prenom")
    , @NamedQuery(name = "Participant.findByPhoto", query = "SELECT p FROM Participant p WHERE p.photo = :photo")
    , @NamedQuery(name = "Participant.findByEmail", query = "SELECT p FROM Participant p WHERE p.email = :email")
    , @NamedQuery(name = "Participant.findByTel", query = "SELECT p FROM Participant p WHERE p.tel = :tel")
    , @NamedQuery(name = "Participant.findBySexe", query = "SELECT p FROM Participant p WHERE p.sexe = :sexe")
    , @NamedQuery(name = "Participant.findByMdp", query = "SELECT p FROM Participant p WHERE p.mdp = :mdp")
    , @NamedQuery(name = "Participant.findByCandidatureId", query = "SELECT p FROM Participant p WHERE p.candidatureId = :candidatureId")
    , @NamedQuery(name ="Participant.findByEmailAndMdp", query="SELECT a FROM Participant a WHERE a.email=:email AND a.mdp=:mdp")
})
public class Participant extends User implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "photo")
    private String photo;
       
    public Participant() {
        super();
    }

    public Participant(Integer id) {
        super(id);
    }

    public Participant(Integer id, String nom, String prenom, String photo, String email, int tel, Character sexe, String mdp) {
        super(id, nom, prenom, email, tel, sexe, mdp); 
        this.photo=photo;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Participant)) {
            return false;
        }
        Participant other = (Participant) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Participant[ id=" + id + " ]";
    }
    
}
