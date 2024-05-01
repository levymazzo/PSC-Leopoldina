import java.util.Scanner;

public class DiarioDeNotas{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite 'Aluno' se você for um aluno e 'Professor' se você um professor" );
        String usuario  = scanner.nextLine();

         if(usuario.equalsIgnoreCase("Professor")){
         Professor professor = new Professor();
         professor.identificarUsuario();
         }
         else if(usuario.equalsIgnoreCase("Aluno")){
         Aluno aluno = new Aluno();
            aluno.identificarUsuario();
         }else{
            System.out.println("Opção invalida ");

         }
         scanner.close();
    }
  

}