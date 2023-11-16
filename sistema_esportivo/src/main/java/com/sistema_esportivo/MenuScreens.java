package com.sistema_esportivo;

import static com.sistema_esportivo.IOMethods.*;

public class MenuScreens {

    public static void initialMenu() {
        print("-------Bem Vindo(a) à Copa do Mundo!--------");
        print("-----------O que você procura?--------------");
        printLine();
        print("Selecione uma opção");
        print("(1) Times participantes");
        print("(2) Informações sobre locais");
        print("(3) Distribuição dos grupos");
        print("(4) Ver todas as partidas"); 
        print("(5) Regras e critérios");
        print("(6) Estatísticas relevantes");

        int option = readInt();

        switch (option) {
            case 1:
                TeamHelper.printAllTeams();
                break;
            case 2:
                StadiumHelper.printAllStadiums();
                break;
            case 3:

                break;
            case 4:
                MatchHelper.printAllMatches();
                break;
            case 5:

                break;
            default:
                break;
        }
    }

}
