package seg.crud.Auditoria.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import seg.crud.Auditoria.model.Log;
import seg.crud.Auditoria.model.Requisicao;
import seg.crud.Auditoria.model.Sessao;

public interface ISessaoRepository  extends JpaRepository<Sessao, Integer> {

	@Query("SELECT * FROM sessao s WHERE s.ip = ? ")
	public List<Sessao> findBySessaoIp(long ip);
	
	@Query("SELECT * FROM logs l, sessao s WHERE s.ip = ? AND s.codigoSessao = l.sessaoCodigoSessao")
	public List<Log> findBySessaoIpLogs(long ip);
	
	@Query("SELECT r.codigoRequisicao, r.http, r.paginaUrl , r.sessaoCodigoSessao, r.tempo FROM requisicao r, sessao s	WHERE r.sessaoCodigoSessao = s.codigoSessao AND s.usuario = ?")
	public List<Requisicao> findBySessaoUserRequisicao(String name);
}
