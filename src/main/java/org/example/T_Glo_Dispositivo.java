package org.example;

import java.util.Date;
import java.util.UUID;

public class T_Glo_Dispositivo implements LocalizacaoDispositivo {
    private int nrDispositivo;
    private String dsDispositivo;
    private Date dtInstalacao;
    private String cdRastreamento;
    private boolean inAtivo;
    private UUID cdLocalizacao;

    public T_Glo_Dispositivo(int nrDispositivo, String dsDispositivo, Date dtInstalacao, String cdRastreamento, boolean inAtivo, UUID cdLocalizacao) {
        this.nrDispositivo = nrDispositivo;
        this.dsDispositivo = dsDispositivo;
        this.dtInstalacao = dtInstalacao;
        this.cdRastreamento = cdRastreamento;
        this.inAtivo = inAtivo;
        this.cdLocalizacao = cdLocalizacao;
    }

    // Getters e Setters
    public int getNrDispositivo() {
        return nrDispositivo;
    }

    public void setNrDispositivo(int nrDispositivo) {
        this.nrDispositivo = nrDispositivo;
    }

    public String getDsDispositivo() {
        return dsDispositivo;
    }

    public void setDsDispositivo(String dsDispositivo) {
        this.dsDispositivo = dsDispositivo;
    }

    public Date getDtInstalacao() {
        return dtInstalacao;
    }

    public void setDtInstalacao(Date dtInstalacao) {
        this.dtInstalacao = dtInstalacao;
    }

    public String getCdRastreamento() {
        return cdRastreamento;
    }

    public void setCdRastreamento(String cdRastreamento) {
        this.cdRastreamento = cdRastreamento;
    }

    public boolean isInAtivo() {
        return inAtivo;
    }

    public void setInAtivo(boolean inAtivo) {
        this.inAtivo = inAtivo;
    }

    @Override
    public UUID getCdLocalizacao() {
        return cdLocalizacao;
    }

    @Override
    public void setCdLocalizacao(UUID cdLocalizacao) {
        this.cdLocalizacao = cdLocalizacao;
    }
}
