import java.util.Scanner;

;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //para ler o input do usuário
        System.out.println("Digite sua idade");
     int i = scanner.nextInt();
      i = verificaridade(i);
        System.out.println("Digite seu nome!");
        String nome = scanner.nextLine();
        nome = nomecompleto(nome);
        System.out.println(nome);
        scanner.close();
    }
    public static int verificaridade(int i){
      if(i > 18){
          System.out.println("Você é maior de idade!!");
      }else{
          System.out.println("Você é menor de idade!");

      }

        return i ;
    }
    public static String nomecompleto(String nome){
        System.out.println("Seu nome: " + nome);
        return nome;

    }

}