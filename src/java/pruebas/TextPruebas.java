package pruebas;

import conexiones.ConexionMysql;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import modelo.dao.ProductoDAO;
import modelo.dao.UsuarioDAO;
import modelo.dto.ProductoDTO;
import modelo.dto.UsuarioDTO;

/**
 *
 * @author 57311 Jeniffer Perez Urbina - 20182578127
 */
public class TextPruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        ConexionMysql con = ConexionMysql.getInstance();
//        PreparedStatement psnt = null;
//        ResultSet rs = null;
//        try {
//            psnt = con.getCnn().prepareStatement("SELECT * FROM tb_producto ");
//            rs = psnt.executeQuery();
//            while (rs.next()) {
//                System.out.println(rs.getString("nombre_producto"));
//            }
//        } catch (SQLException ex) {
//            System.out.println("Error2" + ex.getMessage());
//        } finally {
//            try {
//                if (psnt != null) {
//                    psnt.close();
//                }
//
//                if (rs != null) {
//                    rs.close();
//                }
//
//            } catch (SQLException ex2) {
//               System.out.println("Error3" + ex2.getMessage());
//            }
//
//            con.cerrarConexion();
//        }
//    }
        //TEXT PARA CONSULTA
//        ProductoDAO dao = new ProductoDAO();
//        List<ProductoDTO> list = dao.readAll();
//
//        for (ProductoDTO p : list) {
//            System.out.println(p);
//        }

        //TEXT PARA CREATE
//        ProductoDTO nuevo = new ProductoDTO("Platano", "Maduro",20,1000);
//        if(dao.create(nuevo)){
//            System.out.println("Se creo con exito");
//        }else{
//            System.out.println("No se creo");
//        }
//        
//
//        list = dao.readAll();
//        for (ProductoDTO p : list) {
//            System.out.println(p);
//        }
        //TEXT PARA UNA SOLA CONSULTA
//        ProductoDTO f = new ProductoDTO();
//        f.setId_pro(10);
//        f = dao.read(f);
//
//        if (f != null) {
//            System.out.println(f);
//        } else {
//            System.out.println("No se encontro en la lista");
//        }
        //TEXT PARA ELIMINAR
//           ProductoDTO elim = new ProductoDTO();
//           elim.setId_pro(11);
//           
//           if(dao.delete(elim)){
//             System.out.println("La operacion se realizo con exito");
//           }else{
//             System.out.println("Fallo eliminacion");
//           }
//           
//           list = dao.readAll();
//           for(ProductoDTO p : list){
//              System.out.println(p);
//           }
        //TEXT PARA ACTUALIZAR
//        f.setValor_pro(3550);
//        f.setUnidades_pro(100);
//
//        if (dao.update(f)) {
//            System.out.println("Se actualizo con exito ");
//        } else {
//            System.out.println("no se actualizo");
//        }
//
//        list = dao.readAll();
//        for (ProductoDTO p : list) {
//            System.out.println(p);
//        }





//-----------------------------------------------------------------------------------USUARIO------------------------------------------------------------------
        //TEXT PARA CONSULTA USUARIO
//        UsuarioDAO dao = new UsuarioDAO();
//        List<UsuarioDTO> list = dao.readAll();
//
//        for (UsuarioDTO u : list) {
//            System.out.println(u);
//        }

          //TEXT CREAR USUARIO
//        UsuarioDTO nuevo = new UsuarioDTO("David", "Santiago","Perez","Urbina",123243478,"santiago@correo","2302235","M",Date.valueOf("2006-05-13"),0);
//        if(dao.create(nuevo)){
//            System.out.println("Se creo con exito");
//        }else{
//            System.out.println("no se creo");
//        }
//        
//
//        list = dao.readAll();
//        for (UsuarioDTO u : list) {
//            System.out.println(u);
//        }


         //TEXT CONSULTA SOLO UN USUARIO
//        UsuarioDTO f = new UsuarioDTO();
//        f.setId_usuario(3);
//        f = dao.read(f);
//
//        if (f != null) {
//            System.out.println(f);
//        } else {
//            System.out.println("No se encontro en la lista");
//        }

         //TEXT PARA ELIMINAR USUARIO
//           UsuarioDTO elim = new UsuarioDTO();
//           elim.setId_usuario(11);
//           
//           if(dao.delete(elim)){
//             System.out.println("La operacion se realizo con exito");
//           }else{
//             System.out.println("Fallo eliminacion");
//           }
//           
//           list = dao.readAll();
//           for(UsuarioDTO u : list){
//              System.out.println(u);
//           }

          //TEXT PARA ACTUALIZAR USUARIO
//        f.setEstado_usuario(1);
//      
//
//        if (dao.update(f)) {
//            System.out.println("Se actualizo con exito ");
//        } else {
//            System.out.println("no se actualizo");
//        }
//
//        list = dao.readAll();
//        for (UsuarioDTO u : list) {
//            System.out.println(u);
//        }
    }
}
