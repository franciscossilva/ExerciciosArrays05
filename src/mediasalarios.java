import  java.util.Scanner;

public class mediasalarios {
    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite a quantidade de funcionarios : ");
        int quantidadedefuncionarios = scanner.nextInt();
        double somasalarios= 0;

        for (int i = i <=quantidadedefuncionarios; i++) {
            System.out.println("Digite o salario do funcionario  " + i + ": ");
            double salario = scanner.nextDouble();
            somasalarios += salario;
        }
        double mediasalarios = somasalarios / quantidadedefuncionarios;

        System.out.println(" A media salarial da empresa é : "+ mediasalarios);}}








