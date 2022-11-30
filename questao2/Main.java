package br.com.questao2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        AVLTree tree = new  AVLTree();
        AVLTree arv = new AVLTree();
        AVLTree.Node root = null;


        int[] vetor = {50, 13, 5, 17 , 9, 8, 10, 12, 55, 70};
        int key=0;


        do{
            System.out.println("\n<1> Inserir" +
                    "\n" +
                    "<2> Excluir" +
                    "\n" +
                    "<3> Pre-ordem" +
                    "\n" +
                    "<4> sair"
            );
            key = ler.nextInt();

            switch (key) {
                case 1:
                    for (int i = 0; i < vetor.length; i++) {
                        root = arv.insert(root, vetor[i]);
                        arv.print(root);
                    }
                    break;
                case 2:
                    System.out.println("Informe um número:");
                    int  num = ler.nextInt();
                    arv.deleteNode(root, num);
                    break;
                case 3:
                    arv.preOrder(root);
                    break;
                case 4:
                    System.out.println("Fim");
                    break;
                default:
                    System.out.println("Número inválido! Digite um número entre 1 a 4.");
            }

        }while(key!=4);


    }
}