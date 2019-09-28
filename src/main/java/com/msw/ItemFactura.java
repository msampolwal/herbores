package com.msw;
import java.math.BigDecimal;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Version;
import org.springframework.format.annotation.NumberFormat;
import org.springframework.roo.addon.javabean.annotations.RooEquals;
import org.springframework.roo.addon.javabean.annotations.RooJavaBean;
import org.springframework.roo.addon.javabean.annotations.RooToString;
import org.springframework.roo.addon.jpa.annotations.entity.RooJpaEntity;
import io.springlets.format.EntityFormat;

/**
 * = ItemFactura
 TODO Auto-generated class documentation
 *
 */
@RooJavaBean
@RooToString
@RooJpaEntity
@RooEquals(isJpaEntity = true)
public class ItemFactura {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @Version
    private Integer version;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @NumberFormat
    private BigDecimal importe;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @NumberFormat
    private Integer cantidad;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "presentacion_id")
    @EntityFormat
    private Presentacion presentacion;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @EntityFormat
    private Factura factura;
}
