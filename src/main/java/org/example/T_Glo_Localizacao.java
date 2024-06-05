package org.example;

import java.util.UUID;

public class T_Glo_Localizacao implements LocalizacaoDispositivo, LocalizacaoColeta {
    private UUID cdLocalizacao;
    private int nrLatitude;
    private int ngLongitude;

    public T_Glo_Localizacao(UUID cdLocalizacao, int nrLatitude, int ngLongitude) {
        this.cdLocalizacao = cdLocalizacao;
        this.nrLatitude = nrLatitude;
        this.ngLongitude = ngLongitude;
    }

    @Override
    public UUID getCdLocalizacao() {
        return cdLocalizacao;
    }

    @Override
    public void setCdLocalizacao(UUID cdLocalizacao) {
        this.cdLocalizacao = cdLocalizacao;
    }

    public int getNrLatitude() {
        return nrLatitude;
    }

    public void setNrLatitude(int nrLatitude) {
        this.nrLatitude = nrLatitude;
    }

    public int getNgLongitude() {
        return ngLongitude;
    }

    public void setNgLongitude(int ngLongitude) {
        this.ngLongitude = ngLongitude;
    }

    public static void main(String[] args) {
        // Criando uma localização
        UUID localizacaoId = UUID.randomUUID();
        T_Glo_Localizacao localizacao = new T_Glo_Localizacao(localizacaoId, 123456789, 987654321);

        // Exemplo de uso
        System.out.println("Localização ID: " + localizacao.getCdLocalizacao());
        System.out.println("Latitude: " + localizacao.getNrLatitude());
        System.out.println("Longitude: " + localizacao.getNgLongitude());
    }
}
