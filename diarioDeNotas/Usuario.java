import java.util.Scanner;

public class Usuario {
    private String nome;
    private int idade;
    private String email;
    private String tipoUsuario;

    public String getNome(){
        return nome;
       }
    
       
       public void setNome(String nome){
        this.nome = nome ;
       }
    
       public int getIdade(){
        return idade;
       }
    
       
       public void setIdade(int idade){
        this.idade = idade ;
       }
    
       public String getEmail(){
        return email;
       }
    
       
       public void setEmail(String email){
        this.email = email ;
       }

       public String getTipoUsuario(){
        return tipoUsuario;
       }
    
       
       public void setTipoUsuario(String tipoUsuario){
        this.tipoUsuario = tipoUsuario;
       }

       public void identificarUsuario(){
        Scanner scanner = new Scanner(System.in);
    
        System.out.println("Digite o seu nome");
        setNome(scanner.nextLine());

        System.out.println("Digite a sua idade");
        setIdade(scanner.nextInt());
        scanner.nextLine();

        System.out.println("Digite o seu email");
        setEmail(scanner.nextLine());

        System.out.println("Bem vindo " + getNome() + ". Deseja visualizar suas notas?" );
       }
        // if ou else para notas
       public void visualizarNotas(int A1, int A2, int A3){

        A1 = 70;
        A2 = 30;
        A3 = 40;

        Scanner scanner = new Scanner(System.in);
        //colocar scanner para mensagem
        switch(opcao){
            case 1: 
            System.out.println(A1);
                
                break;

            case 2: 
            System.out.println(A2);

                break;

            case 3:
            System.out.println(A3);
                break;

            default:
                break;
        }



        scanner.close();
    
       }
}
