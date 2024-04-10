public class Departamento {
    public int depart = 0;
    private int valorhora = 0;
    public static int Plano_saude = 20;
    private double Percentual_Bone;


    public Departamento(int depart) {
        this.depart = depart;
        this.setValorhora();
    }

    public void setValorhora() {
        if (this.depart == 1)
            this.valorhora = 22;
        else
            this.valorhora = 12;
    }

    public double getValorhora() {
        return valorhora;
    }

    private void setPercentual_Bone(double horasTrabalhadas) {
        if (this.depart == 2) {
            this.Percentual_Bone = 0.15;
        } else {
            if (horasTrabalhadas > 20 && horasTrabalhadas <= 30) {
                this.Percentual_Bone = 0.03;
            } else if (horasTrabalhadas > 30 && horasTrabalhadas < 40) {
                this.Percentual_Bone = 0.05;
            } else if (horasTrabalhadas >= 40) {
                this.Percentual_Bone = 0.10;
            } else {
                this.Percentual_Bone = 0;
            }
        }
    }

    public double getPercentual_Bone(double horasTrabalhadas) {
        this.setPercentual_Bone(horasTrabalhadas);
        return this.Percentual_Bone;
    }

}



