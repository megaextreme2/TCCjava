package com.fiebtcc.barbersclub.barbersclub.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
@Entity
@Table(name="Barbeiro")
public class Barbeiro {
    @Id // pk
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto incrementar
    private Long id;
    @Column(nullable = false, length = 120)
    private String nome;
    @Column
    private byte[] foto;
    @Column(nullable = false, length = 15)
    private String cpf;
    @Column(nullable = false)
    private boolean codStatus;

    @Transient  //Atributos que não estão em uma coluna
    @JsonIgnore
    private String mensagemErro = "";

    @Transient
    @JsonIgnore
    private boolean isValid = true;

    public Long getId() {
        return id;
    }

    public boolean isCodStatus() {

        return codStatus;
    }

    public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
    }

    public void setCodStatus(boolean codStatus) {
        this.codStatus = codStatus;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getMensagemErro() {
        return mensagemErro;
    }
    public boolean validarBarbeiro(){

        return isValid;
    }
}