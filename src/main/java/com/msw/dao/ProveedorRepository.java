package com.msw.dao;
import com.msw.Proveedor;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = ProveedorRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = Proveedor.class)
public interface ProveedorRepository extends DetachableJpaRepository<Proveedor, Long>, ProveedorRepositoryCustom {
}
