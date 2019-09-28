package com.msw;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QProveedor is a Querydsl query type for Proveedor
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QProveedor extends EntityPathBase<Proveedor> {

    private static final long serialVersionUID = 1290136308L;

    public static final QProveedor proveedor = new QProveedor("proveedor");

    public final NumberPath<Long> cuit = createNumber("cuit", Long.class);

    public final StringPath domicilio = createString("domicilio");

    public final StringPath email = createString("email");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final SetPath<Producto, QProducto> productos = this.<Producto, QProducto>createSet("productos", Producto.class, QProducto.class, PathInits.DIRECT2);

    public final StringPath razonSocial = createString("razonSocial");

    public final StringPath telefono = createString("telefono");

    public final NumberPath<Integer> version = createNumber("version", Integer.class);

    public QProveedor(String variable) {
        super(Proveedor.class, forVariable(variable));
    }

    public QProveedor(Path<? extends Proveedor> path) {
        super(path.getType(), path.getMetadata());
    }

    public QProveedor(PathMetadata metadata) {
        super(Proveedor.class, metadata);
    }

}

