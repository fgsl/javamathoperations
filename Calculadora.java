import java.util.Scanner;

public class Calculadora
{
    private Scanner scanner;
    
    public Calculadora()
    {
        this.scanner = new Scanner(System.in);
    }
    	
    public static void main(String args[])
    {
        int numero1,numero2,produto;
        Calculadora calculadora = new Calculadora();
        numero1 = calculadora.lerInteiro("Número 1: ");
        numero2 = calculadora.lerInteiro("Número 2: ");
        produto = calculadora.multiplicar(numero1,numero2);
        System.out.println("O produto é igual a " + produto);
    }
    
    public int lerInteiro(String mensagem)
    {
        System.out.print(mensagem);    
        while (!scanner.hasNextInt()) {
            System.out.println("Entrada inválida! Por favor, digite um número inteiro.");
            System.out.print(mensagem);
            scanner.next();
        }
        return scanner.nextInt();
    }
    
    int multiplicar(int numero1,int numero2)
    {
        int contador1 = 0; 
        int contador2 = 0; 
        int produto = 0; 

        while (contador1 < numero1){ 
            contador2 = 0; 
            while (contador2 < numero2){ 
                produto++;
                contador2++;    
            } 
            contador1++;     
        }
        return produto;
    }    
}

