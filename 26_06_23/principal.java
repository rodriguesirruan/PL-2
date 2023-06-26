import java.util.Scanner;

public class principal{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        produto adidas = new produto();
        adidas.preco = 2000;
        adidas.tenis = "Adidas";

        pagamento credito = new pagamento();
            credito.nome = "Cartão de crédito";
            credito.parcela = true;

        pagamento pix = new pagamento();
            pix.nome = "Pix";
            pix.parcela = false;

        System.out.println(adidas.preco);
    }
}