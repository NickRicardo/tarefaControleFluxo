import java.util.Scanner;

public class ControleFluxo {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Informe suas do 1º Bimestre: ");
        double n1 = s.nextDouble();
        System.out.println("Informe suas do 2º Bimestre: ");
        double n2 =s.nextDouble();
        System.out.println("Informe suas do 3º Bimestre: ");
        double n3 = s.nextDouble();
        System.out.println("Informe suas do 4º Bimestre: ");
        double n4 = s.nextDouble();
        double notasTotal = (n1 + n2 + n3 + n4) / 4;
        String mediaNota = getNotas(notasTotal);
        System.out.println(mediaNota);
    }

    public static String getNotas(double notasTotal){
        if (notasTotal >= 7){
            return "Parabéns Sua média foi " + notasTotal + " e você está APROVADO!!! =D ";
        } else if (notasTotal >= 5) {
           return  "Sua Média foi: " + notasTotal + " e você terá que fazer a RECUPERAÇÃO! =/ ";
        } else {
          return  "Infelizmente sua média foi: " + notasTotal + "Você está REPROVADO! =( ";
        }
    }
}
