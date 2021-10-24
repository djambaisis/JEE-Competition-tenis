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
@Table(name = "candidature")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Candidature.findAll", query = "SELECT c FROM Candidature c")
    , @NamedQuery(name = "Candidature.findById", query = "SELECT c FROM Candidature c WHERE c.id = :id")
    , @NamedQuery(name = "Candidature.findByEtatSante", query = "SELECT c FROM Candidature c WHERE c.etatSante = :etatSante")
    , @NamedQuery(name = "Candidature.findByMotivation", query = "SELECT c FROM Candidature c WHERE c.motivation = :motivation")
    , @NamedQuery(name = "Candidature.findByDateSoumission", query = "SELECT c FROM Candidature c WHERE c.dateSoumission = :dateSoumission")
    , @NamedQuery(name = "Candidature.findByDateRejet", query = "SELECT c FROM Candidature c WHERE c.dateRejet = :dateRejet")
    , @NamedQuery(name = "Candidature.findByDateValidation", query = "SELECT c FROM Candidature c WHERE c.dateValidation = :dateValidation")
    , @NamedQuery(name = "Candidature.findByRaison", query = "SELECT c FROM Candidature c WHERE c.raison = :raison")
    , @NamedQuery(name = "Candidature.findByType", query = "SELECT c FROM Candidature c WHERE c.type = :type")
    , @NamedQuery(name = "Candidature.findByJugeId", query = "SELECT c FROM Candidature c WHERE c.jugeId = :jugeId")})
public class Candidature implements Serializable,EntityTennisCompetition {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "etat_sante")
    private String etatSante;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "motivation")
    private String motivation;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "date_soumission")
    private String dateSoumission;
    @Size(max = 10)
    @Column(name = "date_rejet")
    private String dateRejet;
    @Size(max = 10)
    @Column(name = "date_validation")
    private String dateValidation;
    @Size(max = 255)
    @Column(name = "raison")
    private String raison;
    @Column(name = "type")
    private Integer type;
    @Column(name = "juge_id")
    private Integer jugeId;

    public Candidature() {
    }

    public Candidature(Integer id) {
        this.id = id;
    }

    public Candidature(Integer id, String etatSante, String motivation, String dateSoumission) {
        this.id = id;
        this.etatSante = etatSante;
        this.motivation = motivation;
        this.dateSoumission = dateSoumission;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEtatSante() {
        return etatSante;
    }

    public void setEtatSante(String etatSante) {
        this.etatSante = etatSante;
    }

    public String getMotivation() {
        return motivation;
    }

    public void setMotivation(String motivation) {
        this.motivation = motivation;
    }

    public String getDateSoumission() {
        return dateSoumission;
    }

    public void setDateSoumission(String dateSoumission) {
        this.dateSoumission = dateSoumission;
    }

    public String getDateRejet() {
        return dateRejet;
    }

    public void setDateRejet(String dateRejet) {
        this.dateRejet = dateRejet;
    }

    public String getDateValidation() {
        return dateValidation;
    }

    public void setDateValidation(String dateValidation) {
        this.dateValidation = dateValidation;
    }

    public String getRaison() {
        return raison;
    }

    public void setRaison(String raison) {
        this.raison = raison;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getJugeId() {
        return jugeId;
    }

    public void setJugeId(Integer jugeId) {
        this.jugeId = jugeId;
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
        if (!(object instanceof Candidature)) {
            return false;
        }
        Candidature other = (Candidature) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Candidature[ id=" + id + " ]";
    }
    
}
