package control;

import java.util.List;
import modelo.dao.ProductoDAO;
import modelo.dto.ProductoDTO;

/**
 *
 * @author 57311 - Jeniffer Perez Urbina - 20182578127
 */
public class Facade {

    public List<ProductoDTO> listarProductos() {
        ProductoDAO dao = new ProductoDAO();
       return dao.readAll();
    }
}
