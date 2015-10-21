package exercicios;

public class ExerciciosVetor {

    public static void main(String[] args) {
      
        //1
        char [] vetorChar;
        vetorChar = new char[32];
        
        vetorChar[0] = 'a';
        
        //2-----------------------------------------
        int[] vetorInt;
        vetorInt = new int[10];
        
        vetorInt[0] = 18;
        vetorInt[1] = 3;
        vetorInt[2] = 21;
        vetorInt[3] = 8;
        vetorInt[4] = 14;
        vetorInt[5] = 5;
        vetorInt[6] = 6;
        vetorInt[7] = 11;
        vetorInt[8] = 2;
        vetorInt[9] = 9;
        
        //a------------------
        
        vetorInt[7] = 15;
        
        //b------------------
        
        vetorInt[1] = vetorInt[2] - vetorInt[3];
        
        //c------------------
        
        vetorInt[9] = vetorInt[0] + vetorInt[5];
        
        //d
        
        for(int i = 0; i < 10; i++){
            System.out.println(vetorInt[i]);
        }
        System.out.println();
        System.out.println();
        
        //3
        
        int[] vetorInt1;
        vetorInt1 = new int[10];
        
        vetorInt1[0] = 18;
        vetorInt1[1] = 3;
        vetorInt1[2] = 21;
        vetorInt1[3] = 8;
        vetorInt1[4] = 14;
        vetorInt1[5] = 5;
        vetorInt1[6] = 6;
        vetorInt1[7] = 11;
        vetorInt1[8] = 2;
        vetorInt1[9] = 9;
        
        for(int j=0; j<10;j++){
            if(j % 2 == 0){
                vetorInt1[j]++;
            }
            else{
                vetorInt1[j]--;
            }
            System.out.println(vetorInt1[j]);
        }
        System.out.println();
    }
}
