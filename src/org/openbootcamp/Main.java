package org.openbootcamp;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int numeroIf=0;
        if(numeroIf>0){
            System.out.println("La variable es un número positivo");
        }else if(numeroIf<0){
            System.out.println("La variable es un número negativo");
        }else{
            System.out.println("La variable es cero");
        }
        int numeroWhile=0;
        while(numeroWhile<3){
            numeroWhile++;
            System.out.println(numeroWhile);
        }

        int numeroDoWhile=3;
        do{
            numeroDoWhile++;
            System.out.println(numeroDoWhile);
        }while(numeroDoWhile<3);

        for(int numeroFor=0;numeroFor<=3;numeroFor++){
            System.out.println(numeroFor);
        }
        String estacion = "invierno";
        switch(estacion){
            case "invierno":
                System.out.println("Es invierno");
            case "primavera":
                System.out.println("Es primavera");
            case "verano":
                System.out.println("Es verano");
            case "otoño":
                System.out.println("Es otoño");
            default:
                System.out.println("No es una estación");
        }
    }
}
