package com.quipucamayoc.springbootrest.repository;

import com.quipucamayoc.springbootrest.entity.Pago;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PagoRepository extends JpaRepository<Pago, Long> {

}
