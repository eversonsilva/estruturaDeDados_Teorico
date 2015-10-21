/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 *
 * @author Everson
 */
public class Exe1 {

    public String[][] lerArquivo(String[][] m, File arquivo) throws java.io.FileNotFoundException, java.io.IOException {

        FileReader data;
        try {
            data = new FileReader(arquivo);
            BufferedReader linha = new BufferedReader(data);

            Integer linhas = m.length;
            Integer colunas = m[0].length;

            String aux = linha.readLine();

            for (int i = 0; i < linhas; i++) {
                for (int j = 0; j < colunas; j++) {

                    if (aux != null) {
                        m[i][j] = "" + aux.charAt(j);
                    }
                }

                aux = linha.readLine();

            }

            for (int i = 0; i < linhas; i++) {
                for (int j = 0; j < colunas; j++) {
                    System.out.print(m[i][j]);
                }
                System.out.println("");
            }

            data.close();
            return m;

        } catch (FileNotFoundException e) {

            System.out.println("Arquivo de dados não encontrado!!" + e);
            System.exit(0);
            return m;

        }
    }

    public int firstPosition(String[][] m, String[] v) {

        int position = -1;
        int colunas = m[0].length - (v.length - 1);
        try {
            for (int i = 0; i < m.length; i++) {
                for (int j = 0; j < colunas; j++) {
                    if (m[i][j].equals(v[0]) && m[i][j + 1].equals(v[1]) && m[i][j + 2].equals(v[2])) {
                        position = i;
                        return position;
                    }
                }
            }
            return position;
        } catch (Exception e) {
            System.out.println(e);
            return position;
        }
    }

    public int numOcorrencia(String[][] m, String[] v) {

        int position = 0;
        int colunas = m[0].length - (v.length - 1);

        try {
            for (int i = 0; i < m.length; i++) {
                for (int j = 0; j < colunas; j++) {
                    if (m[i][j].equals(v[0]) && m[i][j + 1].equals(v[1]) && m[i][j + 2].equals(v[2])) {
                        position++;
                        System.out.println("A linha é  " + i + " e a coluna é  " + j);
                    }
                }
            }
            return position;
        } catch (Exception e) {
            System.out.println(e);
            return position;
        }
    }

    public int numOcorrenciaM(String[][] m, String[] v) {
        
        int position = 0;
        int linhas = m.length;
        int colunas = m[0].length - (v.length - 1);
        try {
            for (int i = 0; i < linhas; i++) {
                for (int j = 0; j < colunas; j++) {
                    if ((m[i][j].equals(v[0]) && m[i][j + 1].equals(v[1]) && m[i][j + 2].equals(v[2]))
                            || (m[i][j].equals(v[0]) && m[i][j + 1].equals(v[1]) && m[i + 1][0].equals(v[2]))
                            || (m[i][j].equals(v[0]) && m[i + 1][0].equals(v[1]) && m[i + 1][1].equals(v[2]))) {
                            position++;
                            System.out.println("A linha é  " + i + " e a coluna é  " + j);
                    }
                }
            }
            return position;
        } catch (Exception e) {
            System.out.println(e);
            return position;
        }
    }

}

/* public int firstPositionD(String[][] m, ArrayList v) {

 int position = -1;
 int colunas = m[0].length - (v.size()-1);
        
 try {
 for (int i = 0; i < m.length; i++) {
 for (int j = 0; i < colunas; i++) {
 if ((m[i][j]).equals(v.get(0)) && (m[i][j + 1]).equals(v.get(1)) && (m[i][j + 2]).equals(v.get(2))) {
 position = i;
 return position;
 }
 }
 }
 return position;
 } catch (Exception e) {
 System.out.println(e);
 return position;
 }

 }*/
