package br.chronos.rh.justificativaponto.entity;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
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
	private Long ID;
	
	
	
	@Column (name = "tx_ap_justificativa_ponto")
	private String apJustificativaPonto;
	
	
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

		
	//limitar a entrada de dados, 200 caracteres
	@Column (name = "tx_observacoes")
	private String observacoes;
	
	
	//assinatura eletrônica, consultar necessidade
	@Column (name = "tx_assinatura_colaborador")
	private String assinaturaColaborador;
	
	@Column (name = "tx_assinatura_gestor")
	private String assinaturaGestor;
	
	
		
	@Column (name = "tx_status_campo_setor")
	@Enumerated(EnumType.STRING)
	private StatusCampoSetor statusCampoSetor;
	
	@Column (name = "tx_status-motivo_Justificativa")
	@Enumerated(EnumType.STRING)
	private StatusMotivoJustificativa statusMotivoJustificativa;
	
	@Column (name = "tx_status-aprovacao")
	@Enumerated(EnumType.STRING)
	private StatusAprovacao statusAprovacao;
	
	
	

	public Long getID() {
		return ID;
	}
	public void setID(Long iD) {
		ID = iD;
	}

	
	
	
	public String getApJustificativaPonto() {
		return apJustificativaPonto;
	}
	public void setApJustificativaPonto(String apJustificativaPonto) {
		this.apJustificativaPonto = apJustificativaPonto;
	}
	
	
	
	public StatusCampoSetor getCampoSetor() {
		return statusCampoSetor;
	}
	public void setCampoSetor(StatusCampoSetor statusCampoSetor) {
		this.statusCampoSetor = statusCampoSetor;
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

	
	
	public StatusMotivoJustificativa getStatusMotivoJustificativa() {
		return statusMotivoJustificativa;
	}
	public void setStatusMotivoJustificativa(StatusMotivoJustificativa statusMotivoJustificativa) {
		this.statusMotivoJustificativa = statusMotivoJustificativa;
	}
	
	
	
	
	public StatusAprovacao getStatusAprovacao() {
		return statusAprovacao;
	}
	public void setStatusAprovacao(StatusAprovacao statusAprovacao) {
		this.statusAprovacao = statusAprovacao;
	}
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
