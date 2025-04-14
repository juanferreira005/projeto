package med.voll.api.medico;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

import java.awt.print.Pageable;

public interface MedicoRepository extends JpaRepository<Medico, Long> {
    Page<Medico> findByAtivoTrue(Pageable paiginacao);
}
