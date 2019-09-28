package com.msw.dao;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.msw.Proveedor;

/**
 * = ProveedorRepositoryImpl
 *
 * Implementation of ProveedorRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = ProveedorRepositoryCustom.class)
public class ProveedorRepositoryImpl extends QueryDslRepositorySupportExt<Proveedor> implements ProveedorRepositoryCustom{

    /**
     * Default constructor
     */
    ProveedorRepositoryImpl() {
        super(Proveedor.class);
    }
}