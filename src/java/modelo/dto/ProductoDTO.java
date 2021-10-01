package modelo.dto;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author 57311 Jeniffer Perez Urbina - 20182578127
 */
public class ProductoDTO implements Serializable{
    
    private int id_pro;
    private String nombre_pro;
    private String descripcion_pro;
    private int unidades_pro;
    private int valor_pro;

    public ProductoDTO() {
    }

    public ProductoDTO(int id_pro, String nombre_pro, String descripcion_pro, int unidades_pro, int valor_pro) {
        this.id_pro = id_pro;
        this.nombre_pro = nombre_pro;
        this.descripcion_pro = descripcion_pro;
        this.unidades_pro = unidades_pro;
        this.valor_pro = valor_pro;
    }

    public ProductoDTO(String nombre_pro, String descripcion_pro, int unidades_pro, int valor_pro) {
        this.nombre_pro = nombre_pro;
        this.descripcion_pro = descripcion_pro;
        this.unidades_pro = unidades_pro;
        this.valor_pro = valor_pro;
    }

    public int getId_pro() {
        return id_pro;
    }

    public void setId_pro(int id_pro) {
        this.id_pro = id_pro;
    }

    public String getNombre_pro() {
        return nombre_pro;
    }

    public void setNombre_pro(String nombre_pro) {
        this.nombre_pro = nombre_pro;
    }

    public String getDescripcion_pro() {
        return descripcion_pro;
    }

    public void setDescripcion_pro(String descripcion_pro) {
        this.descripcion_pro = descripcion_pro;
    }

    public int getUnidades_pro() {
        return unidades_pro;
    }

    public void setUnidades_pro(int unidades_pro) {
        this.unidades_pro = unidades_pro;
    }

    public int getValor_pro() {
        return valor_pro;
    }

    public void setValor_pro(int valor_pro) {
        this.valor_pro = valor_pro;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + this.id_pro;
        hash = 47 * hash + Objects.hashCode(this.nombre_pro);
        hash = 47 * hash + Objects.hashCode(this.descripcion_pro);
        hash = 47 * hash + this.unidades_pro;
        hash = 47 * hash + this.valor_pro;
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
        final ProductoDTO other = (ProductoDTO) obj;
        if (this.id_pro != other.id_pro) {
            return false;
        }
        if (this.unidades_pro != other.unidades_pro) {
            return false;
        }
        if (this.valor_pro != other.valor_pro) {
            return false;
        }
        if (!Objects.equals(this.nombre_pro, other.nombre_pro)) {
            return false;
        }
        if (!Objects.equals(this.descripcion_pro, other.descripcion_pro)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return id_pro+" "+ nombre_pro + " $" + valor_pro;
    }
    
    
}
