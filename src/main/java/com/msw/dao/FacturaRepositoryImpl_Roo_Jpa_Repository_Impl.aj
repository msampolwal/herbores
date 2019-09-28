// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.msw.dao;

import com.msw.Factura;
import com.msw.QFactura;
import com.msw.dao.FacturaRepositoryImpl;
import com.querydsl.core.types.Path;
import com.querydsl.jpa.JPQLQuery;
import io.springlets.data.domain.GlobalSearch;
import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt.AttributeMappingBuilder;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

privileged aspect FacturaRepositoryImpl_Roo_Jpa_Repository_Impl {
    
    declare @type: FacturaRepositoryImpl: @Transactional(readOnly = true);
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String FacturaRepositoryImpl.IMPORTE = "importe";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String FacturaRepositoryImpl.FECHA = "fecha";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String FacturaRepositoryImpl.CLIENTE = "cliente";
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public Page<Factura> FacturaRepositoryImpl.findAll(GlobalSearch globalSearch, Pageable pageable) {
        
        QFactura factura = QFactura.factura;
        
        JPQLQuery<Factura> query = from(factura);
        
        Path<?>[] paths = new Path<?>[] {factura.importe,factura.fecha,factura.cliente};        
        applyGlobalSearch(globalSearch, query, paths);
        
        AttributeMappingBuilder mapping = buildMapper()
			.map(IMPORTE, factura.importe)
			.map(FECHA, factura.fecha)
			.map(CLIENTE, factura.cliente);
        
        applyPagination(pageable, query, mapping);
        applyOrderById(query);
        
        return loadPage(query, pageable, factura);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public Page<Factura> FacturaRepositoryImpl.findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable) {
        
        QFactura factura = QFactura.factura;
        
        JPQLQuery<Factura> query = from(factura);
        
        Path<?>[] paths = new Path<?>[] {factura.importe,factura.fecha,factura.cliente};        
        applyGlobalSearch(globalSearch, query, paths);
        
        // Also, filter by the provided ids
        query.where(factura.id.in(ids));
        
        AttributeMappingBuilder mapping = buildMapper()
			.map(IMPORTE, factura.importe)
			.map(FECHA, factura.fecha)
			.map(CLIENTE, factura.cliente);
        
        applyPagination(pageable, query, mapping);
        applyOrderById(query);
        
        return loadPage(query, pageable, factura);
    }
    
}
