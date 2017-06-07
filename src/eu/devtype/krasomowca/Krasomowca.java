package eu.devtype.krasomowca;

public class Krasomowca
    {
    public static void main(String[] args)
        {
        String[] listaSlow1 = {"architektura wielowarstwowa", "3000 metrow", "rozwiazanie B do B", "aplikacja kliencka", "interfejs internetowy"};

        String[] listaSlow2 = {"zwieksza mozliwosci", "poprawia atrakcyjnosc", "pomnaza wartosc", "opracowana dla", "bazujaca na"};

        String[] listaSlow3 = {"procesie", "punktu wypisywania", "rozwiazania strategii", "paradygmatu", "portalu"};

        //to measure how many words in each list
        int dlugoscListy1 = listaSlow1.length;
        int dlugoscListy2 = listaSlow2.length;
        int dlugoscListy3 = listaSlow3.length;

        //generate 3 random words, random 0.1 to 0.99 min one max ten
        int x = 0;
        int n = 5;
        while(x < n)
            {
            int rnd1 = (int) (Math.random()*dlugoscListy1);
            int rnd2 = (int) (Math.random()*dlugoscListy2);
            int rnd3 = (int) (Math.random()*dlugoscListy3);

            //create a sentence
            String zdanie =  listaSlow1[rnd1]+" "+listaSlow2[rnd2]+" "+listaSlow3[rnd3];

            //wyswietlenie zdania

            System.out.println("To jest to czego nam trzeba: "+zdanie);
            x++;
            n++;
            }


        //wyswietlanie wylosowanego slowa
        //System.out.println(rnd1+"-rnd1, "+rnd2+"-rnd2, "+rnd3+"-rnd3, ");


        }
    }
