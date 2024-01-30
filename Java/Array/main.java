package Java.Array;

import java.util.ArrayList;
import java.util.Scanner;

public class main {

    public static void Main(String[] args) {
        //ENTRY
        Scanner input = new Scanner(System.in);
        
        ArrayList<Integer> listaDeNotas = new ArrayList<>();
        listaDeNotas.add(6);
        listaDeNotas.add(8);
        listaDeNotas.add(9);
        listaDeNotas.add(6);
        listaDeNotas.add(10);
        
        int[] notas = {6, 8, 9, 6, 10};
        int maior = notas[0];

        
        ArrayList<String> nomeDosAlunos = new ArrayList<>();
        nomeDosAlunos.add("Edu");
        nomeDosAlunos.add("Marco");
        nomeDosAlunos.add("Yulia");
        nomeDosAlunos.add("Kaya");
        nomeDosAlunos.add("Vasily");
        
        String melhorAluno = "Vasily";
        //EXIT
        for(int i=0; i<listaDeNotas.size(); i++) {
            System.out.println("Nota: " + listaDeNotas.get(i) + " Aluno: " + nomeDosAlunos.get(i));
        }
        for(int i=0; i<notas.length; i++) {
            if(notas[i] > maior) {
                maior = notas[i];
                System.out.println("A nota maior é de: " + melhorAluno + "\nCom a nota de: " + maior);
            }
        }
        
        System.out.println("A nota maior é de: " + melhorAluno + "\nCom a nota de: " + maior);
        
        input.close();
    }
}
