package com.medicalrepository.v1.entity;


import com.sun.istack.NotNull;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.lang.NonNull;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "sede_pacientes")

public class SedePaciente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idSedePaciente;

    @Column(name = "nombre_sede")
    private String nombreSede;

    @Column(name = "direccion_sede")
    private String direccionSede;

    @Column(name = "ciudad_sede")
    private String ciudadSede;

    @Column(name = "tipo_sede")
    private String tipoSede;

    @Column(name = "descripcion_Sede")
    private String descripcionSede;

    @Column(name = "createAt")
    @NotNull
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date createAt;


    @Column(name = "update_user")
    private String updateUser;

    @OneToMany (mappedBy = "sedePaciente",cascade = CascadeType.ALL)
    List<Paciente> pacienteList;

    public Long getIdSedePaciente() {
        return idSedePaciente;
    }

    public void setIdSedePaciente(Long idSedePaciente) {
        this.idSedePaciente = idSedePaciente;
    }

    public String getNombreSede() {
        return nombreSede;
    }

    public void setNombreSede(String nombreSede) {
        this.nombreSede = nombreSede;
    }

    public String getDireccionSede() {
        return direccionSede;
    }

    public void setDireccionSede(String direccionSede) {
        this.direccionSede = direccionSede;
    }

    public String getCiudadSede() {
        return ciudadSede;
    }

    public void setCiudadSede(String ciudadSede) {
        this.ciudadSede = ciudadSede;
    }

    public String getTipoSede() {
        return tipoSede;
    }

    public void setTipoSede(String tipoSede) {
        this.tipoSede = tipoSede;
    }

    public String getDescripcionSede() {
        return descripcionSede;
    }

    public void setDescripcionSede(String descripcionSede) {
        this.descripcionSede = descripcionSede;
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
