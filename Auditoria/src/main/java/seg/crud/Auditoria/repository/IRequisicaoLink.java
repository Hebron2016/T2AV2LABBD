package seg.crud.Auditoria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import seg.crud.Auditoria.model.RequisicaoLink;


public interface IRequisicaoLink extends JpaRepository<RequisicaoLink, Integer>{

	@Query(	"SELECT dbo.fn_qtdLinks(1) AS codigoLink")
	public int findCountQtdLink(int a);
}
