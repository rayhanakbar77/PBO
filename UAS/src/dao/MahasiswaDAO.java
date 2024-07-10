/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import model.Mahasiswa;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MahasiswaDAO {
    public void tambahMahasiswa(Mahasiswa mahasiswa) throws SQLException {
        String sql = "INSERT INTO Mahasiswa VALUES(nim, nama, tanggal_lahir, alamat) VALUES (?, ?, ?, ?)";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, mahasiswa.getNim());
            pstmt.setString(2, mahasiswa.getNama());
            pstmt.setDate(3, new java.sql.Date(mahasiswa.getTanggalLahir().getTime()));
            pstmt.setString(4, mahasiswa.getAlamat());
            pstmt.executeUpdate();
        }
    }

    public List<Mahasiswa> getAllMahasiswa() throws SQLException {
        List<Mahasiswa> mahasiswaList = new ArrayList<>();
        String sql = "SELECT * FROM Mahasiswa";
        try (Connection conn = DatabaseConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                mahasiswaList.add(new Mahasiswa(rs.getString("nim"), rs.getString("nama"),
                        rs.getDate("tanggal_lahir"), rs.getString("alamat")));
            }
        }
        return mahasiswaList;
    }
}
