package com.msw.dao;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.msw.Cliente;

/**
 * = ClienteRepositoryImpl
 *
 * Implementation of ClienteRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = ClienteRepositoryCustom.class)
public class ClienteRepositoryImpl extends QueryDslRepositorySupportExt<Cliente> implements ClienteRepositoryCustom{

    /**
     * Default constructor
     */
    ClienteRepositoryImpl() {
        super(Cliente.class);
    }
}