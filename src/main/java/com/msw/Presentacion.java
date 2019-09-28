package com.msw;
import java.math.BigDecimal;

import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Version;

import org.springframework.format.annotation.NumberFormat;
import org.springframework.roo.addon.javabean.annotations.RooEquals;
import org.springframework.roo.addon.javabean.annotations.RooJavaBean;
import org.springframework.roo.addon.javabean.annotations.RooToString;
import org.springframework.roo.addon.jpa.annotations.entity.RooJpaEntity;

import io.springlets.format.EntityFormat;

/**
 * = Presentacion
 TODO Auto-generated class documentation
 *
 */
@RooJavaBean
@RooToString
@RooJpaEntity
@RooEquals(isJpaEntity = true)
public class Presentacion {

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
    private String descripcion;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @NumberFormat
    private BigDecimal precio;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @EntityFormat
    private Producto producto;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @NumberFormat
    private BigDecimal stock;
}
