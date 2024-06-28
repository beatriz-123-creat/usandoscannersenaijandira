import java.util.Scanner;
//usaremos o scanner hoje
public class Imc {

    public static void main(String[] args) {
        //scanner são como receitas de bolo
        Scanner leitor = new Scanner(System.in);
        //Scanner leitor = new Scanner(System.in);
        //Scanner leitor = new Scanner(System.in);
        //entrada de dados para programa
        System.out.print("Qual é o seu nome? ");
        String nome = leitor.nextLine();

        System.out.print("Qual o nome da sua cidade? ");
        String cidade = leitor.nextLine();

        System.out.print("Digite seu peso: ");
        int peso = leitor.nextInt();

        System.out.print("Digite a sua altura: ");
        double altura = leitor.nextDouble();

        leitor.close();

        //CALCULO IMC/processamento dos dados recebidos pelo usuário/cliente;
        double calculoImc = peso / Math.pow(altura, 2);

        //saída para o usuário;
        //System.out.println(nome + ", seu IMC é: " + calculoImc + ".");
        //System.out.printf("%s, seu IMC é: %s.\n", nome, calculoImc);
        System.out.printf("%s, você pesa %s Kg e tem %s M, assim, \nseu IMC é: %s.", nome, peso, altura, calculoImc);
    }
}
n