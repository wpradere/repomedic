package com.medicalrepository.v1.entity;

import com.sun.istack.NotNull;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "pacientes")

public class Paciente {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPaciente;

    @Column(name = "nombre_paciente")
    private String nombrePaciente;

    @Column(name = "tipo_paciente")
    private String tipoPaciente;

    @Column(name = "edad_paciente")
    private int edadPaciente;

    @Column(name="direccion_paciente")
    private String direccionPaciente;

    @Column(name ="ciudad_paciente")
    private String ciudadPaciente;

    @Column(name = "createAt")
    @NotNull
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date createAt;


    @Column(name = "update_user")
    private String updateUser;

    @ManyToOne
    @JoinColumn(name ="idSede_f" )
    SedePaciente sedePaciente;

    @ManyToOne
    @JoinColumn(name ="idMedicina_f" )
    Medicina medicina;

    @OneToMany (mappedBy = "paciente",cascade = CascadeType.ALL)
    List<HistoriaMedica> historiaMedicasList;

    @OneToMany(mappedBy = "paciente",cascade = CascadeType.ALL)
    List< CitaMedica>citaMedicaList;






    public Long getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(Long idPaciente) {
        this.idPaciente = idPaciente;
    }

    public String getNombrePaciente() {
        return nombrePaciente;
    }

    public void setNombrePaciente(String nombrePaciente) {
        this.nombrePaciente = nombrePaciente;
    }

    public String getTipoPaciente() {
        return tipoPaciente;
    }

    public void setTipoPaciente(String tipoPaciente) {
        this.tipoPaciente = tipoPaciente;
    }

    public int getEdadPaciente() {
        return edadPaciente;
    }

    public void setEdadPaciente(int edadPaciente) {
        this.edadPaciente = edadPaciente;
    }

    public String getDireccionPaciente() {
        return direccionPaciente;
    }

    public void setDireccionPaciente(String direccionPaciente) {
        this.direccionPaciente = direccionPaciente;
    }

    public String getCiudadPaciente() {
        return ciudadPaciente;
    }

    public void setCiudadPaciente(String ciudadPaciente) {
        this.ciudadPaciente = ciudadPaciente;
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
