package com.msw.dao;
import com.msw.Factura;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = FacturaRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = Factura.class)
public interface FacturaRepository extends DetachableJpaRepository<Factura, Long>, FacturaRepositoryCustom {
}
