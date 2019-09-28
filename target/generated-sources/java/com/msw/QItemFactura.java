package com.msw;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QItemFactura is a Querydsl query type for ItemFactura
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QItemFactura extends EntityPathBase<ItemFactura> {

    private static final long serialVersionUID = -1592669317L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QItemFactura itemFactura = new QItemFactura("itemFactura");

    public final NumberPath<Integer> cantidad = createNumber("cantidad", Integer.class);

    public final QFactura factura;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<java.math.BigDecimal> importe = createNumber("importe", java.math.BigDecimal.class);

    public final QPresentacion presentacion;

    public final NumberPath<Integer> version = createNumber("version", Integer.class);

    public QItemFactura(String variable) {
        this(ItemFactura.class, forVariable(variable), INITS);
    }

    public QItemFactura(Path<? extends ItemFactura> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QItemFactura(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QItemFactura(PathMetadata metadata, PathInits inits) {
        this(ItemFactura.class, metadata, inits);
    }

    public QItemFactura(Class<? extends ItemFactura> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.factura = inits.isInitialized("factura") ? new QFactura(forProperty("factura"), inits.get("factura")) : null;
        this.presentacion = inits.isInitialized("presentacion") ? new QPresentacion(forProperty("presentacion"), inits.get("presentacion")) : null;
    }

}

