import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        System.out.println("insira sua altura (m)");
        double altura = sc.nextDouble();
        System.out.println("insira seu peso (kg)");
        double peso = sc.nextDouble();
        
        double imc = peso / (altura * altura);
        System.out.println("seu imc é " + imc);

        if (imc < 18.5) {
            System.out.println("você está abaixo do peso");
        } else if (imc >= 18.5 && imc < 25) {
            System.out.println("você está com o peso normal");
        } else if (imc >= 25 && imc < 30) {
            System.out.println("você está com sobrepeso");
        } else if (imc >= 30 && imc < 35) {
            System.out.println("você está com obesidade grau I");
        } else if (imc >= 35 && imc < 40) {
            System.out.println("você está com obesidade grau II");
        } else {
            System.out.println("você está com obesidade grau III");
        }
    }
        
}
