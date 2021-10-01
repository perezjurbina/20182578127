package modelo.dao;

import java.util.List;

/**
 *
 * @author 57311 Jeniffer Perez Urbina - 20182578127
 * @param <CualquierCosa> //hace referencia a cualquier tipo de objeto
 */
public interface Contrato<CualquierCosa> {
    
    boolean create(CualquierCosa obj);
    public List<CualquierCosa> readAll();
    public CualquierCosa read(CualquierCosa filter);
    public boolean update (CualquierCosa obj);
    public boolean delete (CualquierCosa obj);
}
