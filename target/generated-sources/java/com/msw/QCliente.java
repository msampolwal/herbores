package com.msw;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QCliente is a Querydsl query type for Cliente
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QCliente extends EntityPathBase<Cliente> {

    private static final long serialVersionUID = -303975536L;

    public static final QCliente cliente = new QCliente("cliente");

    public final StringPath documento = createString("documento");

    public final StringPath email = createString("email");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath razonSocial = createString("razonSocial");

    public final StringPath telefono = createString("telefono");

    public final NumberPath<Integer> version = createNumber("version", Integer.class);

    public QCliente(String variable) {
        super(Cliente.class, forVariable(variable));
    }

    public QCliente(Path<? extends Cliente> path) {
        super(path.getType(), path.getMetadata());
    }

    public QCliente(PathMetadata metadata) {
        super(Cliente.class, metadata);
    }

}

