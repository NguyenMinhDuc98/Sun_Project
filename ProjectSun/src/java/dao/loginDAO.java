/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ASUS
 */
public class loginDAO extends CommonDAO {

    public boolean checkAccount(String username, String password) {
        try {
            Connection connection = connect();
            String sql = "SELECT * FROM openedu_project.user;";
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String user = rs.getString("username");
                String pass = rs.getString("password");
                if(user.equals(username) && pass.equals(password)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(loginDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

//    public static void main(String[] args) {
//        loginDAO dao = new loginDAO();
//        dao.check();
//    }
}
