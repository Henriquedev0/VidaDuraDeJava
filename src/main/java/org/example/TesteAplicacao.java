package org.example;

import java.util.Date;
import java.util.UUID;

public class TesteAplicacao {
    public static void main(String[] args) {

        T_Glo_Dispositivo dispositivo1 = new T_Glo_Dispositivo(1, "Coletor de Plásticos e Metais", new Date(), "Rastreamento123", true, UUID.randomUUID());


        T_Glo_Coleta coleta1 = new T_Glo_Coleta(
                UUID.randomUUID(),  // idColeta
                dispositivo1,       // dispositivo
                UUID.randomUUID(),  // cdLocalizacao
                new Date(),         // dtColeta
                150.5,              // vlVolume
                "Plástico",         // dsResiduo
                new Date(),         // dtReciclagem
                UUID.randomUUID()   // idRelatorio
        );


        T_Glo_Relatorio relatorio1 = new T_Glo_Relatorio(
                coleta1.getIdRelatorio(),  // idRelatorio (de coleta1)
                "Resumo da coleta de plástico e metais.",
                new Date(),
                coleta1
        );


        System.out.println("Relatório ID: " + relatorio1.getIdRelatorio());
        System.out.println("Resumo: " + relatorio1.getTxResumo());
        System.out.println("Data do Relatório: " + relatorio1.getDrRelatorio());
        System.out.println("ID da Coleta associada: " + relatorio1.getColeta().getIdColeta());
    }
}
