package Main;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException{
        File file = new File("E:\\3º semestre\\Estrutura de dados\\Atv\\Matriz.txt");
        String matriz[][] = new String[20][30];
        
        Exe1 a = new Exe1();
        a.lerArquivo(matriz, file);
    //==================================================================================
        System.out.println("");
    //==================================================================================    
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite um padrão a ser procurado no texto");
        String b = entrada.next();
    //==================================================================================    
        
        String v[] = new String[3];

        for (int i = 0; i < v.length; i++) {
            v[i] = ""+b.charAt(i);
        } 
        
        Exe1 c = new Exe1();
        System.out.println("A palavra está na linha " + c.firstPosition(matriz, v));
    //==================================================================================    
        /*Exe1 d = new Exe1();
        ArrayList vd = new ArrayList();
        
        for(int i = 0; i < vd.size(); i++){
        vd.add(b.charAt(i));
            System.out.println(i);
        }
        
        System.out.println(d.firstPositionD(matriz, vd));
        */
    //==================================================================================
        //System.out.println("");
        //Exe1 d = new Exe1();
       // System.out.println("O número de vezes que essa palavra ocorre é: " + d.numOcorrencia(matriz, v));
    //==================================================================================
        System.out.println("");
        Exe1 e = new Exe1();
        System.out.println("O número de vezes que essa palavra ocorre é: " + e.numOcorrenciaM(matriz, v));
    
    
    }
}



    
    