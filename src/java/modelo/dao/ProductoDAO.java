package modelo.dao;

import conexiones.ConexionMysql;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.dto.ProductoDTO;

/**
 *
 * @author 57311 Jeniffer Perez Urbina - 20182578127
 */
public class ProductoDAO implements Contrato<ProductoDTO> {

    private static final String SQL_READALL = "SELECT * FROM tb_producto";
    private static final String SQL_INSERT = "INSERT INTO tb_producto"
            + "(nombre_producto,descripcion_producto,unidades,valor)"
            + "VALUES (?,?,?,?)";
    private static final String SQL_READ = "SELECT * FROM tb_producto WHERE id_producto= ?";
    private static final String SQL_DELETE = "DELETE FROM tb_producto WHERE id_producto = ?";
    private static final String SQL_UPDATE = "UPDATE tb_producto SET "
            + "nombre_producto=?, descripcion_producto=?, unidades=?, valor=? "
            + "WHERE id_producto= ?";
    private static final ConexionMysql CON = ConexionMysql.getInstance();

    public ProductoDAO() {
    }

    @Override
    public boolean create(ProductoDTO obj) {
        PreparedStatement ps = null;
        try {
            ps = CON.getCnn().prepareStatement(SQL_INSERT);
            ps.setString(1, obj.getNombre_pro());
            ps.setString(2, obj.getDescripcion_pro());
            ps.setInt(3, obj.getUnidades_pro());
            ps.setInt(4, obj.getValor_pro());
            int res = ps.executeUpdate();
            System.out.println("res =" + res);
            if (res > 0) {
                return true;
            }

        } catch (SQLException ex) {
            System.out.println("Error8" + ex.getMessage());
        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException ex2) {
                    System.out.println("Error9" + ex2.getMessage());
                }
            }
            CON.cerrarConexion();

        }

        return false;
    }

    @Override
    public List<ProductoDTO> readAll() {
        List<ProductoDTO> lst = null;
        PreparedStatement psnt = null;
        ResultSet rs = null;
        try {
            psnt = CON.getCnn().prepareStatement(SQL_READALL);
            rs = psnt.executeQuery();
            lst = new ArrayList<>();
            while (rs.next()) {
                ProductoDTO obj = new ProductoDTO(rs.getInt("id_producto"),
                        rs.getString("nombre_producto"),
                        rs.getString("descripcion_producto"),
                        rs.getInt("unidades"),
                        rs.getInt("valor"));
                lst.add(obj);
            }

        } catch (SQLException ex2) {
            System.out.println("Error6 " + ex2.getMessage());
        } finally {
            try {
                if (psnt != null) {
                    psnt.close();
                }

                if (rs != null) {
                    rs.close();
                }

            } catch (SQLException ex3) {
                System.out.println("Error7" + ex3.getMessage());
            }

            CON.cerrarConexion();
        }
        return lst;
    }

    @Override
    public ProductoDTO read(ProductoDTO filter) {
        ProductoDTO objRes = null;
        PreparedStatement psnt = null;
        ResultSet rs = null;
        try {
            psnt = CON.getCnn().prepareStatement(SQL_READ);
            psnt.setInt(1, filter.getId_pro());
            rs = psnt.executeQuery();
            while (rs.next()) {
                objRes = new ProductoDTO(
                        rs.getInt("id_producto"),
                        rs.getString("nombre_producto"),
                        rs.getString("descripcion_producto"),
                        rs.getInt("unidades"),
                        rs.getInt("valor"));
            }
        } catch (SQLException ex) {
            System.out.println("Error10" + ex.getMessage());
        } finally {
            try {
                if (psnt != null) {
                    psnt.close();
                }

                if (rs != null) {
                    rs.close();
                }

            } catch (SQLException ex3) {
                System.out.println("Error7" + ex3.getMessage());
            }

            CON.cerrarConexion();
        }

        return objRes;
    }

    @Override
    public boolean update(ProductoDTO obj) {
        PreparedStatement ps = null;

        try {
            ps = CON.getCnn().prepareStatement(SQL_UPDATE);
            ps.setString(1, obj.getNombre_pro());
            ps.setString(2, obj.getDescripcion_pro());
            ps.setInt(3, obj.getUnidades_pro());
            ps.setInt(4, obj.getValor_pro());
            ps.setInt(5, obj.getId_pro());
            int res = ps.executeUpdate();
            System.out.println("res= " + res);

            if (res > 0) {
                return true;
            }
        } catch (SQLException ex) {
            System.out.println("error13" + ex.getMessage());
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
            } catch (SQLException ex2) {
                System.out.println("error14" + ex2.getMessage());
            }
            
            CON.cerrarConexion();
        }

        return false;
    }

    @Override
    public boolean delete(ProductoDTO obj) {
        PreparedStatement ps = null;
        try {
            ps = CON.getCnn().prepareStatement(SQL_DELETE);
            ps.setInt(1, obj.getId_pro());
            int res = ps.executeUpdate();
            System.out.println("res= " + res);

            if (res > 0) {
                return true;
            }
        } catch (SQLException ex) {
            System.out.println("Error11" + ex.getMessage());
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
            } catch (SQLException ex2) {
                System.out.println("Error12" + ex2.getMessage());
            }
            CON.cerrarConexion();
        }

        return false;
    }

}
