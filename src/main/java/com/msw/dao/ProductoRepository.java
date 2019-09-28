package com.msw.dao;
import com.msw.Producto;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = ProductoRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = Producto.class)
public interface ProductoRepository extends DetachableJpaRepository<Producto, Long>, ProductoRepositoryCustom {
}
