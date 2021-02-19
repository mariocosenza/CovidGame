package com.gameCovid;

import java.util.Random;

public class Simulazione extends Player {

        public void randomVita(byte i) {
            Random vivoMortoRandom = new Random();
            if (getGenere(totaleInseriti)==true){
                boolean checkStato = true;
                int età = getEtà(totaleInseriti);

                if (età == 1) {
                    checkStato = vivoMortoRandom.nextInt(100) + 1 > 4;
                    setStatoVita(checkStato, i);
                }
                else if (età == 2) {
                    checkStato = vivoMortoRandom.nextInt(100) + 1 > 8;
                    setStatoVita(checkStato, i);
                }
                else if (età == 3) {
                    checkStato = vivoMortoRandom.nextInt(100) + 1 > 20;
                    setStatoVita(checkStato, i);
                }
                else {
                    checkStato = vivoMortoRandom.nextInt(100) + 1 > 30;
                    setStatoVita(checkStato, i);
                }

            }
            else{
                boolean checkStato = true;
                int età = getEtà(totaleInseriti);

                if (età == 1) {
                    checkStato = vivoMortoRandom.nextInt(100) + 1 > 2;
                    setStatoVita(checkStato, i);
                }
                else if (età == 2) {
                    checkStato = vivoMortoRandom.nextInt(100) + 1 > 6;
                    setStatoVita(checkStato, i);
                }
                else if (età == 3) {
                    checkStato = vivoMortoRandom.nextInt(100) + 1 > 15;
                    setStatoVita(checkStato, i);
                }
                else {
                    checkStato = vivoMortoRandom.nextInt(100) + 1 > 25;
                    setStatoVita(checkStato, i);
                }
            }

        }


    }
