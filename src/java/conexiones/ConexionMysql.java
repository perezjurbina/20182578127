package conexiones;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author 57311 Jeniffer Perez Urbina- 20182578127
 */
//clase con singleton
public class ConexionMysql {

    //variable de clase
    public static ConexionMysql instance;//singleton
    private Connection cnn;

    private String url = "jdbc:mysql://localhost:3306/bd_tallerjavaweb";
    private String user = "root";
    private String password = "";

    private ConexionMysql() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");//caragar driver
            cnn = DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Error1" + ex.getMessage());
        }
    }

    public static synchronized ConexionMysql getInstance() {
        if (instance == null) {
            instance = new ConexionMysql();
        }
        return instance;
    }

    public Connection getCnn() {
        return cnn;
    }

    public void cerrarConexion() {
        instance = null;
    }

}
