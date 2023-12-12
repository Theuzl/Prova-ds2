package com.mycompany.prova;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class  Paciente {
    private String CPF;
    private String nome;
    private Date dataNascimento;
    private String planoSaude;

    public Paciente(String CPF, String nome, String dataNascimento, String planoSaude) throws EValorInvalidoException {
        this.CPF = CPF;
        this.nome = nome;
        try {
            this.dataNascimento = new SimpleDateFormat("dd/MM/yyyy").parse(dataNascimento);
        } catch (ParseException e) {
            throw new EValorInvalidoException("Data de nascimento inválida");
        }
        this.planoSaude = planoSaude;
    }

    public String consultarInformacoes() {
        return "CPF: " + CPF + "\nNome: " + nome + "\nData de Nascimento: " + dataNascimento + "\nPlano de Saúde: " + planoSaude;
    }
}

