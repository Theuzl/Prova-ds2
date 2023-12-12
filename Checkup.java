import com.mycompany.prova.Consulta;
import com.mycompany.prova.Paciente;

public class Checkup extends Consulta {
    private double valorAdicional;

    public Checkup(Paciente paciente, String localAtendimento, double valor, double valorAdicional) {
        super(paciente, localAtendimento, valor);
        this.valorAdicional = (valorAdicional < 0) ? 0 : valorAdicional;
    }

    public double consultarValorAdicional() {
        return valorAdicional;
    }

    @Override
    public double consultarValor() {
        return super.consultarValor() + valorAdicional;
    }

    @Override
    public String consultarInformacoes() {
        return super.consultarInformacoes() +
                "\nValor Adicional do Check-up: " + valorAdicional;
    }
}


 

