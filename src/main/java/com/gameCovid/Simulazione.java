package com.gameCovid;

import java.util.Random;



    public class Simulazione extends Player {
        public void randomVita() {
            Random vivoMortoRandom = new Random();
            if (isGenere()) {
                boolean checkStato;
                switch (getEta()) {
                    case "1-17":
                        checkStato = vivoMortoRandom.nextInt(100) + 1 > 4;
                        setStatoVita(checkStato);

                        break;
                    case "18-39":
                        checkStato = vivoMortoRandom.nextInt(100) + 1 > 8;
                        setStatoVita(checkStato);
                        break;
                    case "40-59":
                        checkStato = vivoMortoRandom.nextInt(100) + 1 > 20;
                        setStatoVita(checkStato);
                        break;
                    case "60-79":
                        checkStato = vivoMortoRandom.nextInt(100) + 1 > 20;
                        setStatoVita(checkStato);
                        break;
                    default:
                        checkStato = vivoMortoRandom.nextInt(100) + 1 > 30;
                        setStatoVita(checkStato);
                        break;
                }

            }
            else{
                boolean checkStato;

                switch (getEta()) {
                    case "1-17":
                        checkStato = vivoMortoRandom.nextInt(100) + 1 > 2;
                        setStatoVita(checkStato);

                        break;
                    case "18-39":
                        checkStato = vivoMortoRandom.nextInt(100) + 1 > 6;
                        setStatoVita(checkStato);
                        break;
                    case "40-59":
                        checkStato = vivoMortoRandom.nextInt(100) + 1 > 15;
                        setStatoVita(checkStato);
                        break;
                    case "60-79":
                        checkStato = vivoMortoRandom.nextInt(100) + 1 > 20;
                        setStatoVita(checkStato);
                        break;
                    default:
                        checkStato = vivoMortoRandom.nextInt(100) + 1 > 25;
                        setStatoVita(checkStato);
                        break;
                }

            }

        }
        //05/03/2021

    }
