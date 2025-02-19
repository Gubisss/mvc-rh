package com.github.gubisss.mvc_rh.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "funcionarios")
public class Funcionario extends AbstractEntity<Long>{

	@Column(columnDefinition = "DATE")
	private LocalDate dataSaida;
	@Column(nullable = false, columnDefinition = "DATE")
	private LocalDate dataEntrada;
	@Column(nullable = false, length = 50)
	private String nome;
	@Column(nullable = false, columnDefinition = "NUMERIC(15,2)")
	private BigDecimal salario;
	
	@ManyToOne
	@JoinColumn(name ="cargo_id_fk",nullable = false)
	private Cargo cargos;
	
	@OneToOne
	@JoinColumn(name ="endereco_id_fk",nullable = false)
	private Endereco enderecos;


	public LocalDate getDataSaida() {
		return dataSaida;
	}

	public void setDataSaida(LocalDate dataSaida) {
		this.dataSaida = dataSaida;
	}

	public LocalDate getDataEntrada() {
		return dataEntrada;
	}

	public void setDataEntrada(LocalDate dataEntrada) {
		this.dataEntrada = dataEntrada;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public BigDecimal getSalario() {
		return salario;
	}

	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}

	public Cargo getCargos() {
		return cargos;
	}

	public void setCargos(Cargo cargos) {
		this.cargos = cargos;
	}

	public Endereco getEnderecos() {
		return enderecos;
	}

	public void setEnderecos(Endereco enderecos) {
		this.enderecos = enderecos;
	}
	
	


}
