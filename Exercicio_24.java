import java.util.Scanner;
public class Exercicio_24 {

    public static void main(String[] args) {

        Scanner txt = new Scanner(System.in);
        String conf = "Sim", carga="Zero (nulo)";
        double num;

        while (conf.equals("Sim") || conf.equals("S")) {

           

            System.out.print("Digite um número: ");
            while (!txt.hasNextDouble()) {
                System.out.println(" ");
                System.out.println("Somente números inteiros.");
                System.out.print("Digite um número: ");
                txt.next();
            }
            num=txt.nextDouble();

            if(num > 0){
                carga = "Positivo";
            }else if(num < 0){
                carga = "Negativo";
            }
            if(num == 0){
                carga = " 0, (Neutro?)";
            }

            System.out.println(" O sinal deste número é "+carga);

            System.out.println(" ");
            System.out.print("Deseja continuar (SIM/NÃO) ?: ");
            conf = txt.nextLine();
            conf = txt.nextLine();
            conf = conf.toUpperCase();

        }

    }
 

}
