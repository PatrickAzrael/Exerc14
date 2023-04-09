import java.util.Scanner;

public class Questao14 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Informe o peso do peixe em KG: ");
        int p;
        p = leia.nextInt();
        leia.close();
        int excesso;
        excesso = p - 50;
        int multa;
        multa = excesso * 4;

        int pesolimit = 50;

        if (p > pesolimit) {
            System.out.printf(
                    "O peso do peixe excedeu o limite permitido [%d kg], então irá ter que pagar uma multa de [R$ %d]",
                    p,
                    multa);
        } else {
            System.out.printf("O peso do peixe [%d kg] está dentro do limite.", p);
        }

    }

}
