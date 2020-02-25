package com.redhat.fhorazny.first;


import java.util.Scanner;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;

public class Calc {

    double result = 0;
    boolean nextExp = true;
    String myInput;

    public boolean checkFormat(int option) {        // zjisteni validniho vstupu (DULEZITE)
        if (option==1){
            if (!myInput.matches("^([\\d]+[+\\-*/])+[\\d]+")) {
                return false;
            }
        } else if (option==2) {
            if (!myInput.matches("^([+\\-*/][\\d]+)+")) {
                return false;
            }
        }
        return true;
    }


    public void eraseBlank() {
        myInput = myInput.replaceAll("[\\s]", "");
    }

    public int cutDigit() {
        int res = Integer.parseInt(myInput.replaceAll("([+\\-*/][\\d]+)+$", ""));
        myInput = myInput.replaceAll("^[\\d]+", "");
        return res;
    }

    public void process() {
        System.out.println("kalkulacka, ktera neumi prednost operatoru");
        Scanner scan = new Scanner(System.in);


        myInput = scan.nextLine();       // nacteni vstupniho prikladu
        eraseBlank();

        if (!checkFormat(1)){
            System.out.println("wrong input");
            return;
        }

        while(nextExp) {

            if (myInput.charAt(0)>47) {
                result = cutDigit();
            }

            while (myInput.length() > 1) {

                switch (myInput.charAt(0)) {        // cutAndResolveOp metoda mozna?
                    case '+':
                        myInput = myInput.replaceAll("^[+\\-*/]+", "");
                        result = result + cutDigit();
                        break;
                    case '-':
                        myInput = myInput.replaceAll("^[+\\-*/]+", "");
                        result = result - cutDigit();
                        break;
                    case '*':
                        myInput = myInput.replaceAll("^[+\\-*/]+", "");
                        result = result * cutDigit();
                        break;
                    case '/':
                        myInput = myInput.replaceAll("^[+\\-*/]+", "");
                        result = result / cutDigit();
                        break;
                }
            }

            System.out.println("result = " + result);
            System.out.println("zadejte dalsi priklad, nebo pokracujte operatorem pro pocitani s poslednim vysledkem nebo cokoli jineho pro ukonceni");
            myInput = scan.nextLine();
            eraseBlank();

            if (checkFormat(1)) {       // zjisteni noveho vypoctu
                System.out.println("zadali jste novy vypocet");
                result = 0;
            } else if (checkFormat(2)) {       // zjisteni pokracovani vypoctu
                System.out.println("pricitam k poslednimu vysledku");
            } else {
                System.out.println("koncim");
                nextExp = false;
            }
        }
//        zabalit do try catch
//        pridat funkce * a / (zmenit typ result a funkce parseInt uz pravdepodobne nepujde pouzit
//        pridat trim() aby slo zadavat priklady s mezerama (pripadne staci zmenit regularni vyrazy)    DONE
//        nevypinat aplikaci, ale moci pokracovat dalsimi priklady, pripadne moct pokracovat v pricitani do predchoziho result  DONE
//        ...
    }
}
