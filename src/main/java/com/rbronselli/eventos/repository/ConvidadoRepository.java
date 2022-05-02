package com.rbronselli.eventos.repository;

import com.rbronselli.eventos.model.Convidado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConvidadoRepository extends JpaRepository<Convidado, Long> {

}
