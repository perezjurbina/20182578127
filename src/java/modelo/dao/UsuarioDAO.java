package modelo.dao;

import conexiones.ConexionMysql;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.dto.UsuarioDTO;

/**
 *
 * @author 57311 Jeniffer Perez Urbina - 20182578127
 */
public class UsuarioDAO implements Contrato<UsuarioDTO> {

    private static final String SQL_READALL = "SELECT * FROM tb_usuario";
    private static final String SQL_INSERT = "INSERT INTO tb_usuario"
            + "(nombre1,nombre2,apellido1,apellido2,n_identificacion,correo,clave,sexo,fecha_nac,estado)"
            + "VALUES (?,?,?,?,?,?,?,?,?,?)";
    private static final String SQL_READ = "SELECT * FROM tb_usuario WHERE id= ?";
    private static final String SQL_DELETE = "DELETE FROM tb_usuario WHERE id = ?";
    private static final String SQL_UPDATE = "UPDATE tb_usuario SET "
            + "nombre1=?, nombre2=?, apellido1=?, apellido=?, n_identificacion=?, correo=?,"
            + "clave=?, sexo=?, fecha_nac=?,estado=?"
            + "WHERE id=?";
    private static final ConexionMysql CON = ConexionMysql.getInstance();

    @Override
    public boolean create(UsuarioDTO obj) {
        PreparedStatement ps = null;
        try {
            ps = CON.getCnn().prepareStatement(SQL_INSERT);
            ps.setString(1, obj.getNombre1_usuario());
            ps.setString(2, obj.getNombre2_usuario());
            ps.setString(3, obj.getApellido1_usuario());
            ps.setString(4, obj.getApellido2_usuario());
            ps.setInt(5, obj.getN_identificacion_usuario());
            ps.setString(6, obj.getCorreo_usuario());
            ps.setString(7, obj.getClave_usuario());
            ps.setString(8, obj.getSexo_usuario());
            ps.setDate(9, (Date) obj.getFecha_nac_usuario());
            ps.setInt(10, obj.getEstado_usuario());
            int res = ps.executeUpdate();
            System.out.println("res =" + res);

            if (res > 0) {
                return true;
            }
        } catch (SQLException ex) {
            System.out.println("Error3" + ex.getMessage());
        } finally {

            try {
                if (ps != null) {
                    ps.close();
                }
            } catch (SQLException ex2) {
                System.out.println("Error4" + ex2.getMessage());
            }
            CON.cerrarConexion();
        }
        return false;
    }

    @Override
    public List<UsuarioDTO> readAll() {
        List<UsuarioDTO> lst = null;
        PreparedStatement psnt = null;
        ResultSet rs = null;
        try {
            psnt = CON.getCnn().prepareStatement(SQL_READALL);
            lst = new ArrayList<>();
            rs = psnt.executeQuery();
            while (rs.next()) {
                UsuarioDTO obj = new UsuarioDTO(rs.getInt("id"),
                        rs.getString("nombre1"),
                        rs.getString("nombre2"),
                        rs.getString("apellido1"),
                        rs.getString("apellido2"),
                        rs.getInt("n_identificacion"),
                        rs.getString("correo"),
                        rs.getString("clave"),
                        rs.getString("sexo"),
                        rs.getDate("fecha_nac"),
                        rs.getInt("estado"));

                lst.add(obj);
            }
        } catch (SQLException ex) {
            System.out.println("Error1 " + ex.getMessage());
        } finally {

            try {
                if (psnt != null) {
                    psnt.close();
                }
            } catch (SQLException ex2) {
                System.out.println("Error2 " + ex2.getMessage());
            }

            CON.cerrarConexion();
        }
        return lst;
    }

    @Override
    public UsuarioDTO read(UsuarioDTO filter) {
        UsuarioDTO objRes = null;
        PreparedStatement psnt = null;
        ResultSet rs = null;
        try {
            psnt = CON.getCnn().prepareStatement(SQL_READ);
            psnt.setInt(1, filter.getId_usuario());
            rs = psnt.executeQuery();
            while (rs.next()) {
                objRes = new UsuarioDTO(
                        rs.getInt("id"),
                        rs.getString("nombre1"),
                        rs.getString("nombre2"),
                        rs.getString("apellido1"),
                        rs.getString("apellido2"),
                        rs.getInt("n_identificacion"),
                        rs.getString("correo"),
                        rs.getString("clave"),
                        rs.getString("sexo"),
                        rs.getDate("fecha_nac"),
                        rs.getInt("estado"));
            }
        } catch (SQLException ex) {
            System.out.println("Error5 " + ex.getMessage());
        } finally {

            try {
                if (psnt != null) {
                    psnt.close();
                }
                if (rs != null) {
                    rs.close();
                }
            } catch (SQLException ex2) {
                System.out.println("Error6 " + ex2.getMessage());
            }
            CON.cerrarConexion();

        }
        return objRes;
    }

    @Override
    public boolean update(UsuarioDTO obj) {
        PreparedStatement ps = null;
        try {
            ps = CON.getCnn().prepareStatement(SQL_UPDATE);
            ps.setString(1, obj.getNombre1_usuario());
            ps.setString(2, obj.getNombre2_usuario());
            ps.setString(3, obj.getApellido1_usuario());
            ps.setString(4, obj.getApellido2_usuario());
            ps.setInt(5, obj.getN_identificacion_usuario());
            ps.setString(6, obj.getCorreo_usuario());
            ps.setString(7, obj.getClave_usuario());
            ps.setString(8, obj.getSexo_usuario());
            ps.setDate(9, (Date) obj.getFecha_nac_usuario());
            ps.setInt(10, obj.getEstado_usuario());
            ps.setInt(11, obj.getId_usuario());
            int res = ps.executeUpdate();
            System.out.println("res= " + res);

            if (res > 0) {
                return true;
            }
        } catch (SQLException ex) {
            System.out.println("Error9" + ex.getMessage());
        } finally {

            try {
                if (ps != null) {
                    ps.close();
                }
            } catch (SQLException ex2) {
                System.out.println("Error10" + ex2.getMessage());
            }
            CON.cerrarConexion();
        }
        return false;
    }

    @Override
    public boolean delete(UsuarioDTO obj) {
        PreparedStatement ps = null;
        try {
            ps = CON.getCnn().prepareStatement(SQL_DELETE);
            ps.setInt(1, obj.getId_usuario());
            int res = ps.executeUpdate();
            System.out.println("res= " + res);

            if (res > 0) {
                return true;
            }
        } catch (SQLException ex) {
            System.out.println("Error7" + ex.getMessage());
        } finally {

            try {
                if (ps != null) {
                    ps.close();
                }
            } catch (SQLException ex2) {
                System.out.println("Error8" + ex2.getMessage());
            }
            CON.cerrarConexion();
        }
        return false;
    }

}
