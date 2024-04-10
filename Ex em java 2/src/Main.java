import javax.swing.*;
import java.util.ArrayList;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        int numFuncionarios = 5;
        DecimalFormat df = new DecimalFormat("#.##");

        ArrayList<Funcionario> Funcionarios = new ArrayList<Funcionario>();

        JOptionPane.showMessageDialog(null,
                "\tCalcule o salario dos funcionarios");

        for (int i = 1; i <= numFuncionarios; i++) {
            String nome_funcionario = JOptionPane.showInputDialog(null,
                    "Digite o  nome do " + i + " funcionario: ");

            String horas = JOptionPane.showInputDialog(null,
                    "Digite a quantidade de horas trabalhada no mes do " + i  + " funcionario: ");

            int depart;
            do
            {
                    String pegarDepart = JOptionPane.showInputDialog(null,
                        "Digite o departamento (1 = Administrativo / 2 = Producao) do funcionario " + nome_funcionario + ": ");

                    if(pegarDepart == null|| pegarDepart == ""){
                        pegarDepart = "0";
                    }

                    depart = Integer.parseInt(pegarDepart);

                if(depart != 1 && depart != 2)
                {
                    JOptionPane.showMessageDialog(null,
                            "Departamento invalido\n" );
                }
            }
            while(depart != 1 && depart != 2);

            Funcionarios.add(new Funcionario(nome_funcionario, Double.parseDouble(horas), depart));



        }

        for(int i = 0; i < numFuncionarios; i++){
            if(Funcionarios.get(i).getHrs_comp() <= 0){
                Funcionarios.get(i).setHrs_comp(0);
            }
            JOptionPane.showMessageDialog(null,
                    "A folha de pagamento do funcionario " + (i + 1) + " é: " +
                            "\nNome :" + Funcionarios.get(i).getNome() +
                            "\nSalario base: " + df.format(Funcionarios.get(i).getSalario()) +
                            "\nHora extra: " + Funcionarios.get(i).getHrs_comp() +
                            "\nBonificacao/insalubridade : " + df.format(Funcionarios.get(i).getBonifica()) +
                            "\nSalario bruto: " + df.format(Funcionarios.get(i).getSalario_bruto()) +
                            "\nINSS: " + df.format(Funcionarios.get(i).getINSS()) +
                            "\nImposto de renda: " + df.format(Funcionarios.get(i).getImposR()) +
                            "\nPlano de saude: " + Departamento.Plano_saude +
                            "\nSalario liquido: " + df.format(Funcionarios.get(i).getSalario_liqui())
            );
        }

    }
}
