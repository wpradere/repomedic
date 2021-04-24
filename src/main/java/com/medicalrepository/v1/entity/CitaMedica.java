package com.medicalrepository.v1.entity;


import com.sun.istack.NotNull;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "cita_medicas")

public class CitaMedica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCirtaMedica;

    @Column(name = "nombre_cita")
    private String nombreCita;

    @Column(name = "tipo_cita")
    private String tipoCita;

    @Column(name = "asistencia")
    private String asistencia;

    @Column(name = "descripcion_Cita")
    private String descripcionCita;

    @Column(name = "createAt")
    @NotNull
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date createAt;

    @Column(name = "update_user")
    private String updateUser;

    @ManyToOne
    @JoinColumn(name ="idPaciente_f" )
    Paciente paciente;


    public Long getIdCirtaMedica() {
        return idCirtaMedica;
    }

    public void setIdCirtaMedica(Long idCirtaMedica) {
        this.idCirtaMedica = idCirtaMedica;
    }

    public String getNombreCita() {
        return nombreCita;
    }

    public void setNombreCita(String nombreCita) {
        this.nombreCita = nombreCita;
    }

    public String getTipoCita() {
        return tipoCita;
    }

    public void setTipoCita(String tipoCita) {
        this.tipoCita = tipoCita;
    }

    public String getAsistencia() {
        return asistencia;
    }

    public void setAsistencia(String asistencia) {
        this.asistencia = asistencia;
    }

    public String getDescripcionCita() {
        return descripcionCita;
    }

    public void setDescripcionCita(String descripcionCita) {
        this.descripcionCita = descripcionCita;
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
