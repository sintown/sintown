import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Digite o tamanho do vetor: ");
    int len = scan.nextInt();
    int vector[] = new int[len];
    
    for(int index=0; index < len; index++) {
      System.out.println("Indice "+ index +": Digite um valor inteiro: ");
      vector[index] = scan.nextInt();
    }
    boolean vt = OrdemCrescente(vector);
    scan.close();
    
    System.out.println("A maior diferenca entre elementos " + Diferenca(vector));
    System.out.println("O vetor esta em ordem crescente? " +  (vt ? "Sim" : "Nao"));
  }
  
  public static int Diferenca(int[] vector) {
    int len = vector.length;
    if(OrdemCrescente(vector)) {
      return (vector[len-1] - vector[0]);
    }
    int menor = vector[0];
    int maior = menor;
      
    for(int x: vector) {
      if (x > maior) {
        maior = x;
      }
      else if (x < menor) {
        menor = x;
      }
    }
    return (maior - menor);
  }
  public static boolean OrdemCrescente(int[] vector) {
    int i = vector.length - 1;
    while(i != 0 && vector[i] >= vector[i-1]) {
      i --;
    }
    return i == 0;
    }
  }
