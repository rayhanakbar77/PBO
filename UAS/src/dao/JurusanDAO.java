/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import model.Jurusan;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JurusanDAO {
    public void tambahJurusan(Jurusan jurusan) throws SQLException {
        String sql = "INSERT INTO Jurusan(nama_jurusan) VALUES (?)";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, jurusan.getNamaJurusan());
            pstmt.executeUpdate();
        }
    }

    public List<Jurusan> getAllJurusan() throws SQLException {
        List<Jurusan> jurusanList = new ArrayList<>();
        String sql = "SELECT * FROM Jurusan";
        try (Connection conn = DatabaseConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                jurusanList.add(new Jurusan(rs.getInt("id_jurusan"), rs.getString("nama_jurusan")));
            }
        }
        return jurusanList;
    }
}
