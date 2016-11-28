/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package info.diit.dao;

import java.sql.*;
  
public class UserDAO {      
     public static boolean login(String jsUserName, String jsPassword) {
        Connection con = null;
        PreparedStatement ps = null;
        try {
            con = Database.getConnection();
            ps = con.prepareStatement(
                    "select jsUserName, jsPassword from jobseekerreg where jsUserName= ? and jsPassword= ? ");
            ps.setString(1, jsUserName);
            ps.setString(2, jsPassword);
  
            ResultSet rs = ps.executeQuery();
            if (rs.next()) // found
            {
                System.out.println(rs.getString("jsUserName"));
                return true;
            }
            else {
                return false;
            }
        } catch (Exception ex) {
            System.out.println("Error in login() -->" + ex.getMessage());
            return false;
        } finally {
            Database.close(con);
        }
    }
}