package com.redetex.web.model.repository;

import com.redetex.web.model.entidade.Servico;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ServicoRepository {

    Servico findByIdServico(Long idServico);

    @Query(value = "SELECT * FROM TB_SERVICOS")
    Servico findAll();

}
