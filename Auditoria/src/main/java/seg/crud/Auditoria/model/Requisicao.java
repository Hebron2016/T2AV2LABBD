package seg.crud.Auditoria.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table ( name = "requisicao")
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Requisicao {
	@Id
	@Column( name="codigoRequisicao", nullable = false)
	private int codigoRequisicao;
	@Column( name="http", nullable = false)
	private int http;
	@Column( name="tempo", nullable = false)
	private int tempo;
	@ManyToOne( targetEntity=Sessao.class,  fetch = FetchType.LAZY)
	@JoinColumn( name="sessaoCodigoSessao", nullable=false)
	private Sessao sessao;
	@ManyToOne( targetEntity=Pagina.class, fetch = FetchType.LAZY)
	@JoinColumn( name="paginaUrl", nullable = false)
	private Pagina pagina;
}
