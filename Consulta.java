package com.mycompany.prova;

import com.mycompany.prova.Paciente;
import java.util.Date;

public class Consulta {
    protected Paciente paciente;
    protected Date dataAtendimento;
    protected String localAtendimento;
    protected double valor;

    public Consulta(Paciente paciente, String localAtendimento, double valor) {
        this.paciente = paciente;
        this.dataAtendimento = new Date(); // Current date and time
        this.localAtendimento = localAtendimento;
        this.valor = (valor < 0) ? 0 : valor;
    }

    public String consultarInformacoes() {
        return "Paciente: " + paciente.consultarInformacoes() +
                "\nData do Atendimento: " + dataAtendimento +
                "\nLocal do Atendimento: " + localAtendimento +
                "\nValor da Consulta: " + valor;
    }

    public double consultarValor() {
        return valor;
    }
}  

