package com.medicalrepository.v1.entity;

import com.sun.istack.NotNull;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "medicinas")
public class Medicina {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMedicina;

    @Column(name = "nombre_medicina")
    private String nombreMedicina;

    @Column(name = "tipo_medicina")
    private String tipoMedicina;

    @Column(name = "dia_medicina")
    private int diaMedicina;

    @Column(name = "hora_medicina")
    private Date horaMedicina;

    @Column(name ="descripcion_medicina")
    private String DescripcionMedicina;


    @Column(name = "createAt")
    @NotNull
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date createAt;

    @Column(name = "update_user")
    private String updateUser;





    public Long getIdMedicina() {
        return idMedicina;
    }

    public void setIdMedicina(Long idMedicina) {
        this.idMedicina = idMedicina;
    }

    public String getNombreMedicina() {
        return nombreMedicina;
    }

    public void setNombreMedicina(String nombreMedicina) {
        this.nombreMedicina = nombreMedicina;
    }

    public String getTipoMedicina() {
        return tipoMedicina;
    }

    public void setTipoMedicina(String tipoMedicina) {
        this.tipoMedicina = tipoMedicina;
    }

    public int getDiaMedicina() {
        return diaMedicina;
    }

    public void setDiaMedicina(int diaMedicina) {
        this.diaMedicina = diaMedicina;
    }

    public Date getHoraMedicina() {
        return horaMedicina;
    }

    public void setHoraMedicina(Date horaMedicina) {
        this.horaMedicina = horaMedicina;
    }

    public String getDescripcionMedicina() {
        return DescripcionMedicina;
    }

    public void setDescripcionMedicina(String descripcionMedicina) {
        DescripcionMedicina = descripcionMedicina;
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
