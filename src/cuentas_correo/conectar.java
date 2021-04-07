/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentas_correo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Juan David
 */
public class conectar {
    public String db="cuentas_correos";	//Nombre de la base de datos
    public String url="jdbc:mysql://localhost/"+db;
    public String user="root";
    public String pass="123";
    
    
    public Connection conectar(){
        Connection link=null;
        try{
         Class.forName("org.gjt.mm.mysql.Driver");
         link= DriverManager.getConnection(this.url,this.user,this.pass);
        }catch(Exception e){JOptionPane.showMessageDialog(null, "Error al conectarse con el servidor","Error de conexión",JOptionPane.ERROR_MESSAGE);}
        return link;
    }
}
