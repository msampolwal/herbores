package com.msw.dao;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.msw.ItemFactura;

/**
 * = ItemFacturaRepositoryImpl
 *
 * Implementation of ItemFacturaRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = ItemFacturaRepositoryCustom.class)
public class ItemFacturaRepositoryImpl extends QueryDslRepositorySupportExt<ItemFactura> implements ItemFacturaRepositoryCustom{

    /**
     * Default constructor
     */
    ItemFacturaRepositoryImpl() {
        super(ItemFactura.class);
    }
}