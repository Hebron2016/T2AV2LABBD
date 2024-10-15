package seg.crud.Auditoria.model;

import java.io.Serializable;

import lombok.Data;

@Data
public class RequisicaoLinkId implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private Pagina pagina;
	private Link link;
	

}
