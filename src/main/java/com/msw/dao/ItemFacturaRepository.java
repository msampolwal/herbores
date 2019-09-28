package com.msw.dao;
import com.msw.ItemFactura;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = ItemFacturaRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = ItemFactura.class)
public interface ItemFacturaRepository extends DetachableJpaRepository<ItemFactura, Long>, ItemFacturaRepositoryCustom {
}
