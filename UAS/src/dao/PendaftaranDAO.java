/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import model.Pendaftaran;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PendaftaranDAO {
    public void tambahPendaftaran(Pendaftaran pendaftaran) throws SQLException {
        String sql = "INSERT INTO Pendaftaran (nim, id_jurusan, tanggal_daftar) VALUES (?, ?, ?)";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, pendaftaran.getNim());
            pstmt.setInt(2, pendaftaran.getIdJurusan());
            pstmt.setDate(3, new java.sql.Date(pendaftaran.getTanggalDaftar().getTime()));
            pstmt.executeUpdate();
        }
    }

    public List<Pendaftaran> getAllPendaftaran() throws SQLException {
        List<Pendaftaran> pendaftaranList = new ArrayList<>();
        String sql = "SELECT * FROM Pendaftaran";
        try (Connection conn = DatabaseConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                pendaftaranList.add(new Pendaftaran(rs.getInt("id_pendaftaran"), rs.getString("nim"),
                        rs.getInt("id_jurusan"), rs.getDate("tanggal_daftar")));
            }
        }
        return pendaftaranList;
    }
}