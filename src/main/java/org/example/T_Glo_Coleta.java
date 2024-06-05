package org.example;
import java.util.Date;
import java.util.UUID;

public class T_Glo_Coleta implements LocalizacaoColeta {
    private UUID idColeta;
    private T_Glo_Dispositivo dispositivo;
    private UUID cdLocalizacao;
    private Date dtColeta;
    private double vlVolume;
    private String dsResiduo;
    private Date dtReciclagem;
    private UUID idRelatorio;

    public T_Glo_Coleta(UUID idColeta, T_Glo_Dispositivo dispositivo, UUID cdLocalizacao, Date dtColeta, double vlVolume, String dsResiduo, Date dtReciclagem, UUID idRelatorio) {
        this.idColeta = idColeta;
        this.dispositivo = dispositivo;
        this.cdLocalizacao = cdLocalizacao;
        this.dtColeta = dtColeta;
        this.vlVolume = vlVolume;
        this.dsResiduo = dsResiduo;
        this.dtReciclagem = dtReciclagem;
        this.idRelatorio = idRelatorio;
    }

    // Getters e Setters
    public UUID getIdColeta() {
        return idColeta;
    }

    public void setIdColeta(UUID idColeta) {
        this.idColeta = idColeta;
    }

    public T_Glo_Dispositivo getDispositivo() {
        return dispositivo;
    }

    public void setDispositivo(T_Glo_Dispositivo dispositivo) {
        this.dispositivo = dispositivo;
    }

    @Override
    public UUID getCdLocalizacao() {
        return cdLocalizacao;
    }

    @Override
    public void setCdLocalizacao(UUID cdLocalizacao) {
        this.cdLocalizacao = cdLocalizacao;
    }

    public Date getDtColeta() {
        return dtColeta;
    }

    public void setDtColeta(Date dtColeta) {
        this.dtColeta = dtColeta;
    }

    public double getVlVolume() {
        return vlVolume;
    }

    public void setVlVolume(double vlVolume) {
        this.vlVolume = vlVolume;
    }

    public String getDsResiduo() {
        return dsResiduo;
    }

    public void setDsResiduo(String dsResiduo) {
        this.dsResiduo = dsResiduo;
    }

    public Date getDtReciclagem() {
        return dtReciclagem;
    }

    public void setDtReciclagem(Date dtReciclagem) {
        this.dtReciclagem = dtReciclagem;
    }

    public UUID getIdRelatorio() {
        return idRelatorio;
    }

    public void setIdRelatorio(UUID idRelatorio) {
        this.idRelatorio = idRelatorio;
    }
}

