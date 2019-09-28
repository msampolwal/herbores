package com.msw.dao;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.msw.Presentacion;

/**
 * = PresentacionRepositoryImpl
 *
 * Implementation of PresentacionRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = PresentacionRepositoryCustom.class)
public class PresentacionRepositoryImpl extends QueryDslRepositorySupportExt<Presentacion> implements PresentacionRepositoryCustom{

    /**
     * Default constructor
     */
    PresentacionRepositoryImpl() {
        super(Presentacion.class);
    }
}