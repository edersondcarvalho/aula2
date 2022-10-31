package aula2java;



import java.util.*;

public class Aula2 {
public static void main(String[] args) {
    int[] numero = new int[3];
    int auxiliar;
    Scanner sc = new Scanner(System.in);

    for(int i = 0; i < numero.length; i++){
        System.out.println("Digite um número inteiro: ");
        numero[i] = sc.nextInt();
    }

    for(int i = 0; i < numero.length; i++){
        for(int j = 0; j < (numero.length-1-i); j++){
            if(numero[j] > numero[j+1]){
                auxiliar = numero[j];
                numero[j] = numero[j+1];
                numero[j+1] = auxiliar;
            }
        }
    }

    System.out.println("Os números ordenados em ordem crescente são: " + Arrays.toString(numero));
}
}