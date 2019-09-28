package com.msw;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QPresentacion is a Querydsl query type for Presentacion
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QPresentacion extends EntityPathBase<Presentacion> {

    private static final long serialVersionUID = 1723344117L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QPresentacion presentacion = new QPresentacion("presentacion");

    public final StringPath descripcion = createString("descripcion");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<java.math.BigDecimal> precio = createNumber("precio", java.math.BigDecimal.class);

    public final QProducto producto;

    public final NumberPath<java.math.BigDecimal> stock = createNumber("stock", java.math.BigDecimal.class);

    public final NumberPath<Integer> version = createNumber("version", Integer.class);

    public QPresentacion(String variable) {
        this(Presentacion.class, forVariable(variable), INITS);
    }

    public QPresentacion(Path<? extends Presentacion> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QPresentacion(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QPresentacion(PathMetadata metadata, PathInits inits) {
        this(Presentacion.class, metadata, inits);
    }

    public QPresentacion(Class<? extends Presentacion> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.producto = inits.isInitialized("producto") ? new QProducto(forProperty("producto"), inits.get("producto")) : null;
    }

}

