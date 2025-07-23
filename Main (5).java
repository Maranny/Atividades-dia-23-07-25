import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int numero1,numero2;
        int soma;
        
        do{
             System.out.print("Digite um número positivo (ou 0 para sair): ");
            numero1 = sc.nextInt();
            
            if(numero1 == 0 ){
                System.out.println("Cálculos encerrados.");
                break; 
            }
            System.out.println("Digite outro número positivo (ou 0 para sair)");
            numero2 = sc.nextInt();
            
            if(numero2 == 0 ){
                System.out.println("Cálculos encerrados.");
                break; 
                
            } if(numero1 < 0|| numero2 < 0){
              System.out.println("Número inválido. Insira um números positivos: ");
            }else{
              soma = numero1 + numero2;
              System.out.println("A soma dos dois números é: " + soma);
                
            }
        
            
        }while (true);
    }
}