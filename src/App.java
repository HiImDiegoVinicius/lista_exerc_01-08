import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Quantos R$ você ganha por hora: ");
        double horaR$ = input.nextDouble();
        System.out.println("Número de horas trabalhadas no mês: ");
        double horasT = input.nextDouble();
        input.close();
        double total = horaR$ * horasT;
        System.out.println("Total do salário no mês: " + total);
    }
}
