package modelo.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

/**
 *
 * @author 57311 Jeniffer Perez Urbina - 20182578127
 */
public class UsuarioDTO implements Serializable{
    
    private int id_usuario;
    private String nombre1_usuario;
    private String nombre2_usuario;
    private String apellido1_usuario;
    private String apellido2_usuario;
    private int n_identificacion_usuario;
    private String correo_usuario;
    private String clave_usuario;
    private String sexo_usuario;
    private Date fecha_nac_usuario;
    private int estado_usuario;

    public UsuarioDTO() {
    }

    public UsuarioDTO(int id_usuario, String nombre1_usuario, String nombre2_usuario, String apellido1_usuario, String apellido2_usuario, int n_identificacion_usuario, String correo_usuario, String clave_usuario, String sexo_usuario, Date fecha_nac_usuario, int estado_usuario) {
        this.id_usuario = id_usuario;
        this.nombre1_usuario = nombre1_usuario;
        this.nombre2_usuario = nombre2_usuario;
        this.apellido1_usuario = apellido1_usuario;
        this.apellido2_usuario = apellido2_usuario;
        this.n_identificacion_usuario = n_identificacion_usuario;
        this.correo_usuario = correo_usuario;
        this.clave_usuario = clave_usuario;
        this.sexo_usuario = sexo_usuario;
        this.fecha_nac_usuario = fecha_nac_usuario;
        this.estado_usuario = estado_usuario;
    }

    public UsuarioDTO(String nombre1_usuario, String nombre2_usuario, String apellido1_usuario, String apellido2_usuario, int n_identificacion_usuario, String correo_usuario, String clave_usuario, String sexo_usuario, Date fecha_nac_usuario, int estado_usuario) {
        this.nombre1_usuario = nombre1_usuario;
        this.nombre2_usuario = nombre2_usuario;
        this.apellido1_usuario = apellido1_usuario;
        this.apellido2_usuario = apellido2_usuario;
        this.n_identificacion_usuario = n_identificacion_usuario;
        this.correo_usuario = correo_usuario;
        this.clave_usuario = clave_usuario;
        this.sexo_usuario = sexo_usuario;
        this.fecha_nac_usuario = fecha_nac_usuario;
        this.estado_usuario = estado_usuario;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getNombre1_usuario() {
        return nombre1_usuario;
    }

    public void setNombre1_usuario(String nombre1_usuario) {
        this.nombre1_usuario = nombre1_usuario;
    }

    public String getNombre2_usuario() {
        return nombre2_usuario;
    }

    public void setNombre2_usuario(String nombre2_usuario) {
        this.nombre2_usuario = nombre2_usuario;
    }

    public String getApellido1_usuario() {
        return apellido1_usuario;
    }

    public void setApellido1_usuario(String apellido1_usuario) {
        this.apellido1_usuario = apellido1_usuario;
    }

    public String getApellido2_usuario() {
        return apellido2_usuario;
    }

    public void setApellido2_usuario(String apellido2_usuario) {
        this.apellido2_usuario = apellido2_usuario;
    }

    public int getN_identificacion_usuario() {
        return n_identificacion_usuario;
    }

    public void setN_identificacion_usuario(int n_identificacion_usuario) {
        this.n_identificacion_usuario = n_identificacion_usuario;
    }

    public String getCorreo_usuario() {
        return correo_usuario;
    }

    public void setCorreo_usuario(String correo_usuario) {
        this.correo_usuario = correo_usuario;
    }

    public String getClave_usuario() {
        return clave_usuario;
    }

    public void setClave_usuario(String clave_usuario) {
        this.clave_usuario = clave_usuario;
    }

    public String getSexo_usuario() {
        return sexo_usuario;
    }

    public void setSexo_usuario(String sexo_usuario) {
        this.sexo_usuario = sexo_usuario;
    }

    public Date getFecha_nac_usuario() {
        return fecha_nac_usuario;
    }

    public void setFecha_nac_usuario(Date fecha_nac_usuario) {
        this.fecha_nac_usuario = fecha_nac_usuario;
    }

    public int getEstado_usuario() {
        return estado_usuario;
    }

    public void setEstado_usuario(int estado_usuario) {
        this.estado_usuario = estado_usuario;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + this.id_usuario;
        hash = 53 * hash + Objects.hashCode(this.nombre1_usuario);
        hash = 53 * hash + Objects.hashCode(this.nombre2_usuario);
        hash = 53 * hash + Objects.hashCode(this.apellido1_usuario);
        hash = 53 * hash + Objects.hashCode(this.apellido2_usuario);
        hash = 53 * hash + this.n_identificacion_usuario;
        hash = 53 * hash + Objects.hashCode(this.correo_usuario);
        hash = 53 * hash + Objects.hashCode(this.clave_usuario);
        hash = 53 * hash + Objects.hashCode(this.sexo_usuario);
        hash = 53 * hash + Objects.hashCode(this.fecha_nac_usuario);
        hash = 53 * hash + this.estado_usuario;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final UsuarioDTO other = (UsuarioDTO) obj;
        if (this.id_usuario != other.id_usuario) {
            return false;
        }
        if (this.n_identificacion_usuario != other.n_identificacion_usuario) {
            return false;
        }
        if (this.estado_usuario != other.estado_usuario) {
            return false;
        }
        if (!Objects.equals(this.nombre1_usuario, other.nombre1_usuario)) {
            return false;
        }
        if (!Objects.equals(this.nombre2_usuario, other.nombre2_usuario)) {
            return false;
        }
        if (!Objects.equals(this.apellido1_usuario, other.apellido1_usuario)) {
            return false;
        }
        if (!Objects.equals(this.apellido2_usuario, other.apellido2_usuario)) {
            return false;
        }
        if (!Objects.equals(this.correo_usuario, other.correo_usuario)) {
            return false;
        }
        if (!Objects.equals(this.clave_usuario, other.clave_usuario)) {
            return false;
        }
        if (!Objects.equals(this.sexo_usuario, other.sexo_usuario)) {
            return false;
        }
        if (!Objects.equals(this.fecha_nac_usuario, other.fecha_nac_usuario)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return id_usuario + " " + nombre1_usuario + " " + nombre2_usuario + " " + apellido1_usuario + " " + apellido2_usuario + " " + n_identificacion_usuario;
    }
    
    
    
}
