package com.example.oso.agente;

public class Nota {
    private int ci;
    private int idMat;
    private int bimestre;
    private String notas;

    public Nota(int ci, int idMat, int bimestre, String notas) {
        this.ci = ci;
        this.idMat = idMat;
        this.bimestre = bimestre;
        this.notas = notas;
    }

    public int getCi() {
        return ci;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }

    public int getIdMat() {
        return idMat;
    }

    public void setIdMat(int idMat) {
        this.idMat = idMat;
    }

    public int getBimestre() {
        return bimestre;
    }

    public void setBimestre(int bimestre) {
        this.bimestre = bimestre;
    }

    public String getNotas() {
        return notas;
    }

    public void setNotas(String notas) {
        this.notas = notas;
    }
}
