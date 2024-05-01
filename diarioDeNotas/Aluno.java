import java.util.Scanner;

public class Aluno extends Usuario{

    int ra;
    String telefone;
    @Override
    public void identificarUsuario(){

        Scanner scanner = new Scanner(System.in);
        super.identificarUsuario();
            

        System.out.println("Digite a seu ra");
        ra = scanner.nextInt();
        scanner.nextLine();


        System.out.println("Digite o seu telefone");
        telefone = scanner.nextLine();


        scanner.close();

    }

    
    }
    