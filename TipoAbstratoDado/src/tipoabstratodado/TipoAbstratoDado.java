/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tipoabstratodado;

/**
 *
 * @author Everson
 */
public class TipoAbstratoDado {

    public boolean vazia(int topo) {
        if(topo == -1)
            return true;
        else return false;
    }
    public boolean cheia(int topo, int max_elem) {
        if(topo == max_elem)
            return true;
        else return false;
    }

    public void push(int[] pilha,int elem, int topo){
    
        if(cheia(topo, elem) == false){
            topo += 1;
            pilha[topo] = elem;
        }
        else
        {
            System.out.println("pilha cheia");
        }
    }

    public int pop(int[] pilha, int topo) {
        
        int elemento;
        
        if(vazia(topo) == true){
            System.out.println("Pilha vazia");
            return -1;
        }
        else
        {
            elemento = pilha[topo];
            topo -=1;
            return elemento;
        }
    }
    
    public void exibePilha(int [] pilha){
        
        for (int i = 0; i < pilha.length; i++) {
            System.out.println(pilha[i]);            
        }
            
}
    
    
    public void exibePilhaInvertida(int [] pilha){
        
        for (int i = pilha.length; i > 0 ; i--) {
            System.out.println(pilha[i]);            
        }
            
}


    public static void main(String[] args) {
        
        TipoAbstratoDado a1 = new TipoAbstratoDado();
        TipoAbstratoDado a2 = new TipoAbstratoDado();
        
        //a1.exibePilha(pilha);
        
    }

}
