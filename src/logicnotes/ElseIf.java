package logicnotes;

import java.util.Scanner;

public class ElseIf {
    public static void main (String[] args){

        Scanner sc = new Scanner (System.in);

        System.out.println("Ingrese su peso");
        float peso = sc. nextFloat();

        System.out.println("Ingrese su estatura en m");
        float estatura = sc.nextFloat();
        
        float imc = Math.round(peso/(estatura * estatura));
        System.out.println("Su IMC es: " + imc);
        
        if (imc>30){
            System.out.println("Obesidad");
        } else if (imc<29.9 && imc>25) {
            System.out.println("Sobrepeso");
        } else if (imc<24.9 && imc>18.5) {
            System.out.println("Peso normal");
        } else {
            System.out.println("Bajo peso");
        }
    }
}
