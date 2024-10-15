package seg.crud.Auditoria.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="requisicaolink")
@IdClass(RequisicaoLinkId.class)
public class RequisicaoLink {
	
	@Id
	@ManyToOne(cascade = CascadeType.ALL, targetEntity = Requisicao.class, fetch = FetchType.LAZY)
	@JoinColumn(name="paginaUrl", nullable = false)
	private Requisicao requisicao;
	@Id
	@ManyToOne(cascade = CascadeType.ALL, targetEntity = Link.class, fetch = FetchType.LAZY)
	@JoinColumn(name = "linkCodigoLink", nullable = false)
	private Link link;
	
	public Requisicao getRequisicao() {
		return requisicao;
	}
	public void setRequisicao(Requisicao requisicao) {
		this.requisicao = requisicao;
	}
	public Link getLink() {
		return link;
	}
	public void setLink(Link link) {
		this.link = link;
	}
	
}
