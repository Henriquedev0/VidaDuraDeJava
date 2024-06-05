package org.example;

import java.util.Date;
import java.util.UUID;

public class T_Glo_Relatorio {
    private UUID idRelatorio;
    private String txResumo;
    private Date drRelatorio;
    private T_Glo_Coleta coleta;

    public T_Glo_Relatorio(UUID idRelatorio, String txResumo, Date drRelatorio, T_Glo_Coleta coleta) {
        this.idRelatorio = idRelatorio;
        this.txResumo = txResumo;
        this.drRelatorio = drRelatorio;
        this.coleta = coleta;
    }

    // Getters e Setters
    public UUID getIdRelatorio() {
        return idRelatorio;
    }

    public void setIdRelatorio(UUID idRelatorio) {
        this.idRelatorio = idRelatorio;
    }

    public String getTxResumo() {
        return txResumo;
    }

    public void setTxResumo(String txResumo) {
        this.txResumo = txResumo;
    }

    public Date getDrRelatorio() {
        return drRelatorio;
    }

    public void setDrRelatorio(Date drRelatorio) {
        this.drRelatorio = drRelatorio;
    }

    public T_Glo_Coleta getColeta() {
        return coleta;
    }

    public void setColeta(T_Glo_Coleta coleta) {
        this.coleta = coleta;
    }

//    public static void main(String[] args) {
//        // Criando um dispositivo
//        T_Glo_Dispositivo dispositivo1 = new T_Glo_Dispositivo(1, "Coletor de Plásticos e Metais", new Date(), "Rastreamento123", true, UUID.randomUUID());
//
//        // Criando uma coleta ligada ao dispositivo
//        T_Glo_Coleta coleta1 = new T_Glo_Coleta(
//                UUID.randomUUID(),  // idColeta
//                dispositivo1,       // dispositivo
//                UUID.randomUUID(),  // cdLocalizacao
//                new Date(),         // dtColeta
//                150.5,              // vlVolume
//                "Plástico",         // dsResiduo
//                new Date(),         // dtReciclagem
//                UUID.randomUUID()   // idRelatorio
//        );
//
//        // Criando um relatório ligado à coleta
//        T_Glo_Relatorio relatorio1 = new T_Glo_Relatorio(
//                coleta1.getIdRelatorio(),  // idRelatorio (de coleta1)
//                "Resumo da coleta de plástico e metais.",
//                new Date(),
//                coleta1
//        );
//
//        // Exemplo de uso
//        System.out.println("Relatório ID: " + relatorio1.getIdRelatorio());
//        System.out.println("Resumo: " + relatorio1.getTxResumo());
//        System.out.println("Data do Relatório: " + relatorio1.getDrRelatorio());
//        System.out.println("ID da Coleta associada: " + relatorio1.getColeta().getIdColeta());
//    }
}
