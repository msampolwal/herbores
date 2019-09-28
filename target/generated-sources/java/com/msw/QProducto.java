package com.msw;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QProducto is a Querydsl query type for Producto
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QProducto extends EntityPathBase<Producto> {

    private static final long serialVersionUID = 1549489802L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QProducto producto = new QProducto("producto");

    public final StringPath descripcion = createString("descripcion");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath nombre = createString("nombre");

    public final SetPath<Presentacion, QPresentacion> presentaciones = this.<Presentacion, QPresentacion>createSet("presentaciones", Presentacion.class, QPresentacion.class, PathInits.DIRECT2);

    public final QProveedor proveedor;

    public final NumberPath<Integer> version = createNumber("version", Integer.class);

    public QProducto(String variable) {
        this(Producto.class, forVariable(variable), INITS);
    }

    public QProducto(Path<? extends Producto> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QProducto(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QProducto(PathMetadata metadata, PathInits inits) {
        this(Producto.class, metadata, inits);
    }

    public QProducto(Class<? extends Producto> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.proveedor = inits.isInitialized("proveedor") ? new QProveedor(forProperty("proveedor")) : null;
    }

}

