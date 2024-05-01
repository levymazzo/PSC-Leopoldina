import java.util.Scanner;

public class Professor extends Usuario{


    public int calucarNotas(int nota1, int nota2, int nota3){

    
        System.out.println("Digite a nota1");
        nota1 = scanner.nextInt();
        scanner.nextLine();
      
        System.out.println("Digite a nota2");
        nota2 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite a nota3");
        nota3 = scanner.nextInt();
        scanner.nextLine();

        int soma = nota1 + nota2 + nota3;
        System.out.println("Resultado " + soma);

        return (nota1 + nota2 + nota3);
    }
    
}
