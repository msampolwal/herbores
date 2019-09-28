package com.msw.dao;
import com.msw.Cliente;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = ClienteRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = Cliente.class)
public interface ClienteRepository extends DetachableJpaRepository<Cliente, Long>, ClienteRepositoryCustom {
}
