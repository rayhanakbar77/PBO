/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

public class Pendaftaran {
    private int idPendaftaran;
    private String nim;
    private int idJurusan;
    private Date tanggalDaftar;

    public Pendaftaran(int idPendaftaran, String nim, int idJurusan, Date tanggalDaftar) {
        this.idPendaftaran = idPendaftaran;
        this.nim = nim;
        this.idJurusan = idJurusan;
        this.tanggalDaftar = tanggalDaftar;
    }

    // Getter dan setter
    public int getIdPendaftaran() {
        return idPendaftaran;
    }

    public void setIdPendaftaran(int idPendaftaran) {
        this.idPendaftaran = idPendaftaran;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public int getIdJurusan() {
        return idJurusan;
    }

    public void setIdJurusan(int idJurusan) {
        this.idJurusan = idJurusan;
    }

    public Date getTanggalDaftar() {
        return tanggalDaftar;
    }

    public void setTanggalDaftar(Date tanggalDaftar) {
        this.tanggalDaftar = tanggalDaftar;
    }
}
