public class Funcionario {
    private String nome;
    private double horas;
    private double salario;
    private double hrs_comp;
    private double bonifica;
    private double salario_bruto = 0;
    private double INSS = 0;
    private double imposR = 0;
    private double salario_liqui = 0;
    Departamento dep_funcionario;

    public Funcionario(String nome, double horas, int depart) {
        this.dep_funcionario = new Departamento(depart);
        this.nome = nome;
        this.horas = horas;
        this.hrs_comp = horas - 40;
        this.salario = horas * this.dep_funcionario.getValorhora();
        this.setBonifica();
        this.salario_bruto = this.salario + this.Calcular_hrs_comp() + this.bonifica;
        this.INSS = this.salario_bruto * 0.07;
        this.imposR = this.salario_bruto * 0.12;
        this.salario_liqui =  salario_bruto - INSS - imposR - Departamento.Plano_saude;
    }

    public String getNome(){
        return this.nome;
    }

    public double getHoras(){
        return this.horas;
    }

    public double getSalario(){
        return this.salario;
    }

    public double getHrs_comp(){
        return this.hrs_comp;
    }

    public void setHrs_comp(int set){
        this.hrs_comp = set;
    }

    private double Calcular_hrs_comp() {

        if(this.hrs_comp > 0)
            return this.dep_funcionario.getValorhora() * 2 * this.hrs_comp;
        else
            return 0;

    }

    private void setBonifica(){
        this.bonifica =  this.dep_funcionario.getPercentual_Bone(this.horas) * this.salario;
    }

    public double getBonifica(){
        return this.bonifica;
    }

    public double getSalario_bruto(){
        return this.salario_bruto;
    }

    public double getINSS() {
        return this.INSS;
    }

    public  double getImposR(){
        return this.imposR;
    }

    public double getSalario_liqui() {
        return this.salario_liqui;
    }
}


