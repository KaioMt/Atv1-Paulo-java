import javax.swing.*;
import java.util.Objects;

// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String valorLado1;
        String valorLado2;
        String valorLado3;

        do {
            valorLado1 = JOptionPane.showInputDialog("Digite a medida do 1 lado: ");
            if(Objects.equals(valorLado1, null) || valorLado1.equals("0") ){
                valorLado1 = "";
            }

            valorLado2 = JOptionPane.showInputDialog("Digite a medida do 2 lado: ");
            if(Objects.equals(valorLado2, null) || valorLado2.equals("0") ){
                valorLado2 = "";
            }

            valorLado3 = JOptionPane.showInputDialog("Digite a medida do 3 lado: ");
            if(Objects.equals(valorLado3, null) || valorLado3.equals("0")){
                valorLado3 = "";
            }

            if (Objects.equals(valorLado1, "") || Objects.equals(valorLado2, "") || Objects.equals(valorLado3, "")) {
                JOptionPane.showMessageDialog(null,
                        "Por favor informe valores válidos");
            }

        } while (Objects.equals(valorLado1, "") || Objects.equals(valorLado2, "") || Objects.equals(valorLado3, ""));

        float valor1Pego = Float.parseFloat(valorLado1);
        float valor2Pego = Float.parseFloat(valorLado2);
        float valor3Pego = Float.parseFloat(valorLado3);

        Triangulo objTriangulo = new Triangulo(valor1Pego, valor2Pego, valor3Pego);
        objTriangulo.lado1 = valor1Pego;
        objTriangulo.lado2 = valor2Pego;
        objTriangulo.lado3 = valor3Pego;


        JOptionPane.showMessageDialog(null,
                "\nO perímetro do Triangulo é: " + objTriangulo.perimetro() +
                        ".\nA área do Triando é: " + objTriangulo.area() +
                        ".\nO Triangulo é: " + objTriangulo.Tipo() + ".");
    }
}
