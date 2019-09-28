package com.msw;
import org.springframework.roo.addon.javabean.annotations.RooEquals;
import org.springframework.roo.addon.javabean.annotations.RooJavaBean;
import org.springframework.roo.addon.javabean.annotations.RooToString;
import org.springframework.roo.addon.jpa.annotations.entity.RooJpaEntity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Version;
import io.springlets.format.EntityFormat;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.OneToMany;
import org.springframework.roo.addon.jpa.annotations.entity.JpaRelationType;
import org.springframework.roo.addon.jpa.annotations.entity.RooJpaRelation;

/**
 * = Producto
 TODO Auto-generated class documentation
 *
 */
@RooJavaBean
@RooToString
@RooJpaEntity
@RooEquals(isJpaEntity = true)
public class Producto {

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
    private String nombre;
    
    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private String descripcion;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @EntityFormat
    private Proveedor proveedor;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @OneToMany(cascade = { javax.persistence.CascadeType.MERGE, javax.persistence.CascadeType.PERSIST }, fetch = FetchType.LAZY, mappedBy = "producto")
    @RooJpaRelation(type = JpaRelationType.AGGREGATION)
    private Set<Presentacion> presentaciones = new HashSet<Presentacion>();
}
