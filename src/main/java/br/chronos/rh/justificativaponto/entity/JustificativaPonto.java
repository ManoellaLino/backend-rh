package br.chronos.rh.justificativaponto.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import java.time.LocalDateTime;

import javax.persistence.Column;

@Entity
@Table (name = "justficativa_ponto")
public class JustificativaPonto {
	
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private long ID;
	
	
	@Column (name = "tx_ap_justificativa_ponto")
	private String apJustificativaPonto;
	
	
	// adicionar checkbox e opções, pesquisar métodos, INCOMPLETO
	@Column (name = "tx_campo_setor")
	private Boolean campoSetor;
	
	
	@Column (name = "tx_aviso_formulario")
	private String avisoFormulario;
	
	
	@Column (name = "tx_nome_funcionario")
	private String nomeFuncionario;
	
	
	@Column (name = "tx_matricula_funcionario")
	private Integer matriculaFuncionario;
	
	
	@Column(name = "dt_ocorrencia")
	private LocalDateTime dataOcorrencia;
	
	@Column(name = "dt_entrega")
	private LocalDateTime dataEntrega;
	
	
	// adicionar checkbox e opções, pesquisar métodos, INCOMPLETO
	@Column (name = "tx_motivo_justificativa")
	private Boolean motivoJustificativa;
	
	
	
	//limitar a entrada de dados, 200 caracteres
	@Column (name = "tx_observacoes")
	private String observacoes;
	
	
	
	//assinatura eletrônica, consultar necessidade
	@Column (name = "tx_assinatura_colaborador")
	private String assinaturaColaborador;
	
	@Column (name = "tx_assinatura_gestor")
	private String assinaturaGestor;
	
	
	
	
	
	
	
	
	
	
	
	

	public long getID() {
		return ID;
	}
	public void setID(long iD) {
		ID = iD;
	}

	
	
	
	public String getApJustificativaPonto() {
		return apJustificativaPonto;
	}
	public void setApJustificativaPonto(String apJustificativaPonto) {
		this.apJustificativaPonto = apJustificativaPonto;
	}
	
	
	
	public Boolean getCampoSetor() {
		return campoSetor;
	}
	public void setCampoSetor(Boolean campoSetor) {
		this.campoSetor = campoSetor;
	}

	
	
	
	public String getAvisoFormulario() {
		return avisoFormulario;
	}
	public void setAvisoFormulario(String avisoFormulario) {
		this.avisoFormulario = avisoFormulario;
	}

	
	
	
	public String getNomeFuncionario() {
		return nomeFuncionario;
	}
	public void setNomeFuncionario(String nomeFuncionario) {
		this.nomeFuncionario = nomeFuncionario;
	}

	
	
	
	public Integer getMatriculaFuncionario() {
		return matriculaFuncionario;
	}
	public void setMatriculaFuncionario(Integer matriculaFuncionario) {
		this.matriculaFuncionario = matriculaFuncionario;
	}

	
	
	
	public LocalDateTime getDataOcorrencia() {
		return dataOcorrencia;
	}
	public void setDataOcorrencia(LocalDateTime dataOcorrencia) {
		this.dataOcorrencia = dataOcorrencia;
	}

	
	
	
	public LocalDateTime getDataEntrega() {
		return dataEntrega;
	}
	public void setDataEntrega(LocalDateTime dataEntrega) {
		this.dataEntrega = dataEntrega;
	}

	
	
	
	public Boolean getMotivoJustificativa() {
		return motivoJustificativa;
	}
	public void setMotivoJustificativa(Boolean motivoJustificativa) {
		this.motivoJustificativa = motivoJustificativa;
	}

	
	
	
	public String getObservacoes() {
		return observacoes;
	}
	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}
	
	
	

	public String getAssinaturaColaborador() {
		return assinaturaColaborador;
	}
	public void setAssinaturaColaborador(String assinaturaColaborador) {
		this.assinaturaColaborador = assinaturaColaborador;
	}
	
	
	

	public String getAssinaturaGestor() {
		return assinaturaGestor;
	}
	public void setAssinaturaGestor(String assinaturaGestor) {
		this.assinaturaGestor = assinaturaGestor;
	}
	
	
	
	public JustificativaPonto orElse(Object object) {
		return null;
	}
		
	
}
