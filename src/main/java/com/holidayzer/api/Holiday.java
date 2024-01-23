package com.holidayzer.api;

public class Holiday {
    private String data;
    private String nome;

    public Holiday (String nome, String data) throws Exception {
        
        this.nome = nome;
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


}
