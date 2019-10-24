/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dao;

import entity.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ASUS
 */
public class signupDAO extends CommonDAO{
    public void signup(String username, String email, String password){
        try {
            Connection connection = connect();
            String sql = "insert into user(username, password, email) values(?, ?, ?)";
            PreparedStatement ps = connection.prepareCall(sql);
            ps.setString(1, username);
            ps.setString(2, password);
            ps.setString(3, email);
            ps.execute();
        } catch (SQLException ex) {
            Logger.getLogger(signupDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
