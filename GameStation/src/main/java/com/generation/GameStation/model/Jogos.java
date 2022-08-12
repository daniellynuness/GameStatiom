package com.generation.GameStation.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_jogos")
public class Jogos {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	private String nome;
	
	@NotBlank(message = "classificação é obrigatória")
	private String cIndicativa;
	
	private double preco;
	
	private LocalDate dataLancamento; //YYYY-MM-DD
	
	private String compatibilidade;
	
	private int estoque;
	
	@ManyToOne
	@JsonIgnoreProperties("jogos")
	private Loja categoria;
	
	@ManyToOne
	@JsonIgnoreProperties("jogos")
	private Usuario usuario;

	public Long getId() {
		return id;
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

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public LocalDate getDataLancamento() {
		return dataLancamento;
	}

	public void setDataLancamento(LocalDate dataLancamento) {
		this.dataLancamento = dataLancamento;
	}

	public int getEstoque() {
		return estoque;
	}

	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}

	public String getcIndicativa() {
		return cIndicativa;
	}

	public void setcIndicativa(String cIndicativa) {
		this.cIndicativa = cIndicativa;
	}
	

	public String getCompatibilidade() {
		return compatibilidade;
	}

	public void setCompatibilidade(String compatibilidade) {
		this.compatibilidade = compatibilidade;
	}

	public Loja getCategoria() {
		return categoria;
	}

	public void setCategoria(Loja categoria) {
		this.categoria = categoria;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	
	

}
