/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class Jurusan {
    private int idJurusan;
    private String namaJurusan;

    public Jurusan(int idJurusan, String namaJurusan) {
        this.idJurusan = idJurusan;
        this.namaJurusan = namaJurusan;
    }

    // Getter dan setter
    public int getIdJurusan() {
        return idJurusan;
    }

    public void setIdJurusan(int idJurusan) {
        this.idJurusan = idJurusan;
    }

    public String getNamaJurusan() {
        return namaJurusan;
    }

    public void setNamaJurusan(String namaJurusan) {
        this.namaJurusan = namaJurusan;
    }
}
