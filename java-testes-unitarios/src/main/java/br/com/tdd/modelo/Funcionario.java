package br.com.tdd.modelo;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Date;

public class Funcionario {

	private String nome;
	private Date dataAdmissao;
	private BigDecimal salario;
	private int mesesEmpregado;

	public Funcionario(String nome, Date dataAdmissao, BigDecimal salario) {
		this.nome = nome;
		this.dataAdmissao = dataAdmissao;
		this.salario = salario;
	}
	
	public Funcionario() {
	}

	public String getNome() {
		return nome;
	}

	public Date getDataAdmissao() {
		return dataAdmissao;
	}

	public BigDecimal getSalario() {
		return salario;
	}

	public void reajustarSalario(BigDecimal percentual) {
		BigDecimal aumento = calcularValorDoAumento(percentual);
		this.salario = this.salario.add(aumento).setScale(2, RoundingMode.HALF_UP);
	}
	
	private BigDecimal calcularValorDoAumento(BigDecimal percentual) {
		return salario.multiply(percentual);
	}

	public int getMesesEmpregado() {
		return mesesEmpregado;
	}

	public void setMesesEmpregado(int mesesEmpregado) {
		this.mesesEmpregado = mesesEmpregado;
	}
}










