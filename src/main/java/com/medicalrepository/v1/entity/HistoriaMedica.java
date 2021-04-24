package com.medicalrepository.v1.entity;

import com.sun.istack.NotNull;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "historia_medicas")
public class HistoriaMedica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idHistoriaMedica;

    @Column(name = "reference_history")
    private String referneceHistory;

    @Column(name = "description")
    private String description;

    @Column(name = "posologia")
    private String posologia;

    @Column(name = "nombre_entidad")
    private String nombreEntidad;

    @Column(name = "createAt")
    @NotNull
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date createAt;


    @Column(name = "update_user")
    private String updateUser;

   @ManyToOne
   @JoinColumn(name ="idPaciente_f" )
   Paciente paciente;

   @ManyToMany
   @JoinTable(name = "historias_medicina"
            , joinColumns = @JoinColumn(name ="historia_medicais" )
            , inverseJoinColumns = @JoinColumn(name ="medicina_id" )
   )
   private List<Medicina>medicinaList;


    public Long getIdHistoriaMedica() {
        return idHistoriaMedica;
    }

    public void setIdHistoriaMedica(Long idHistoriaMedica) {
        this.idHistoriaMedica = idHistoriaMedica;
    }

    public String getReferneceHistory() {
        return referneceHistory;
    }

    public void setReferneceHistory(String referneceHistory) {
        this.referneceHistory = referneceHistory;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPosologia() {
        return posologia;
    }

    public void setPosologia(String posologia) {
        this.posologia = posologia;
    }

    public String getNombreEntidad() {
        return nombreEntidad;
    }

    public void setNombreEntidad(String nombreEntidad) {
        this.nombreEntidad = nombreEntidad;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }
}
