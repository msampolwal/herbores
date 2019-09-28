package com.msw.dao;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.msw.Factura;

/**
 * = FacturaRepositoryImpl
 *
 * Implementation of FacturaRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = FacturaRepositoryCustom.class)
public class FacturaRepositoryImpl extends QueryDslRepositorySupportExt<Factura> implements FacturaRepositoryCustom{

    /**
     * Default constructor
     */
    FacturaRepositoryImpl() {
        super(Factura.class);
    }
}