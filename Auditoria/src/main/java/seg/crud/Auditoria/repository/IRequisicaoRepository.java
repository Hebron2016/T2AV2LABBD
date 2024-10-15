package seg.crud.Auditoria.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import seg.crud.Auditoria.model.Requisicao;

public interface IRequisicaoRepository  extends JpaRepository<Requisicao, Integer> {

	@Query("SELECT * FROM requisicao r WHERE r.tempo < ?")
	public List<Requisicao> findByTempoReq(int time);
}
