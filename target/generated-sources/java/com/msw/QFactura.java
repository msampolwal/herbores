package com.msw;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QFactura is a Querydsl query type for Factura
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QFactura extends EntityPathBase<Factura> {

    private static final long serialVersionUID = 2038527246L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QFactura factura = new QFactura("factura");

    public final QCliente cliente;

    public final DateTimePath<java.util.Calendar> fecha = createDateTime("fecha", java.util.Calendar.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<java.math.BigDecimal> importe = createNumber("importe", java.math.BigDecimal.class);

    public final SetPath<ItemFactura, QItemFactura> itemsFactura = this.<ItemFactura, QItemFactura>createSet("itemsFactura", ItemFactura.class, QItemFactura.class, PathInits.DIRECT2);

    public final NumberPath<Integer> version = createNumber("version", Integer.class);

    public QFactura(String variable) {
        this(Factura.class, forVariable(variable), INITS);
    }

    public QFactura(Path<? extends Factura> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QFactura(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QFactura(PathMetadata metadata, PathInits inits) {
        this(Factura.class, metadata, inits);
    }

    public QFactura(Class<? extends Factura> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.cliente = inits.isInitialized("cliente") ? new QCliente(forProperty("cliente")) : null;
    }

}

