public class Triangulo {
    float lado1;
    float lado2;
    float lado3;

    String tipo = "teste";

    Triangulo(Float lado1, Float lado2, Float lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    float perimetro(){
        return lado1+lado2+lado3;
    }

    float area(){
        if (lado1 == lado2 && lado2 == lado3){
            tipo = "equilátero";
            return (float) (lado1 * lado2 * (Math.sqrt(3) / 4));
        }else
        if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3){
            tipo = "isósceles";
            double base = 0;
            double altura = 0;
            if (lado1 == lado2) {
                base = lado3;
                altura = Math.sqrt(lado1 * lado1 - base * base / 4);
            } else if (lado1 == lado3) {
                base = lado2;
                altura = Math.sqrt(lado1 * lado1 - base * base / 4);
            } else {
                base = lado1;
                altura = Math.sqrt(lado2 * lado2 - base * base / 4);
            }
            return (float) ((base * altura) / 2);

        }else {
            tipo = "escaleno";
            return (float) Math.sqrt((perimetro()/2) * (perimetro()/2 - lado1) * (perimetro()/2 - lado2) * (perimetro()/2 - lado3));
        }
    }

    public String Tipo() {
        return tipo;
    }
}
