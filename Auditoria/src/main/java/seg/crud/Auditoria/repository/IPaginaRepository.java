package seg.crud.Auditoria.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import seg.crud.Auditoria.model.Pagina;


public interface IPaginaRepository  extends JpaRepository<Pagina, String> {

	@Query("SELECT * FROM pagina p WHERE p.url = ?")
	public Pagina findPaginaUrl(String url);
	
	@Query("SELECT * FROM pagina p WHERE p.lenArqBytes = ?")
	public List<Pagina> findPaginaLenArqBytes(int len);
	
}
