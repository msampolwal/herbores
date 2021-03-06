// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.msw.service.impl;

import com.msw.Factura;
import com.msw.ItemFactura;
import com.msw.dao.FacturaRepository;
import com.msw.service.api.ItemFacturaService;
import com.msw.service.impl.FacturaServiceImpl;
import io.springlets.data.domain.GlobalSearch;
import io.springlets.data.web.validation.MessageI18n;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

privileged aspect FacturaServiceImpl_Roo_Service_Impl {
    
    declare @type: FacturaServiceImpl: @Service;
    
    declare @type: FacturaServiceImpl: @Transactional(readOnly = true);
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private FacturaRepository FacturaServiceImpl.facturaRepository;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private ItemFacturaService FacturaServiceImpl.itemFacturaService;
    
    /**
     * TODO Auto-generated constructor documentation
     * 
     * @param facturaRepository
     * @param itemFacturaService
     */
    @Autowired
    public FacturaServiceImpl.new(FacturaRepository facturaRepository, @Lazy ItemFacturaService itemFacturaService) {
        setFacturaRepository(facturaRepository);
        setItemFacturaService(itemFacturaService);
    }

    /**
     * TODO Auto-generated method documentation
     * 
     * @return FacturaRepository
     */
    public FacturaRepository FacturaServiceImpl.getFacturaRepository() {
        return facturaRepository;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param facturaRepository
     */
    public void FacturaServiceImpl.setFacturaRepository(FacturaRepository facturaRepository) {
        this.facturaRepository = facturaRepository;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return ItemFacturaService
     */
    public ItemFacturaService FacturaServiceImpl.getItemFacturaService() {
        return itemFacturaService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param itemFacturaService
     */
    public void FacturaServiceImpl.setItemFacturaService(ItemFacturaService itemFacturaService) {
        this.itemFacturaService = itemFacturaService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param factura
     * @return Map
     */
    public Map<String, List<MessageI18n>> FacturaServiceImpl.validate(Factura factura) {
        Map<String, List<MessageI18n>> messages = new java.util.HashMap<String, List<MessageI18n>>();
        
        // TODO: IMPLEMENT HERE THE VALIDATION OF YOUR ENTITY
        
        return messages;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param factura
     * @param itemsFacturaToAdd
     * @return Factura
     */
    @Transactional
    public Factura FacturaServiceImpl.addToItemsFactura(Factura factura, Iterable<Long> itemsFacturaToAdd) {
        List<ItemFactura> itemsFactura = getItemFacturaService().findAll(itemsFacturaToAdd);
        factura.addToItemsFactura(itemsFactura);
        return getFacturaRepository().save(factura);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param factura
     * @param itemsFacturaToRemove
     * @return Factura
     */
    @Transactional
    public Factura FacturaServiceImpl.removeFromItemsFactura(Factura factura, Iterable<Long> itemsFacturaToRemove) {
        List<ItemFactura> itemsFactura = getItemFacturaService().findAll(itemsFacturaToRemove);
        factura.removeFromItemsFactura(itemsFactura);
        return getFacturaRepository().save(factura);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param factura
     * @param itemsFactura
     * @return Factura
     */
    @Transactional
    public Factura FacturaServiceImpl.setItemsFactura(Factura factura, Iterable<Long> itemsFactura) {
        List<ItemFactura> items = getItemFacturaService().findAll(itemsFactura);
        Set<ItemFactura> currents = factura.getItemsFactura();
        Set<ItemFactura> toRemove = new HashSet<ItemFactura>();
        for (Iterator<ItemFactura> iterator = currents.iterator(); iterator.hasNext();) {
            ItemFactura nextItemFactura = iterator.next();
            if (items.contains(nextItemFactura)) {
                items.remove(nextItemFactura);
            } else {
                toRemove.add(nextItemFactura);
            }
        }
        factura.removeFromItemsFactura(toRemove);
        factura.addToItemsFactura(items);
        // Force the version update of the parent side to know that the parent has changed
        // because it has new books assigned
        factura.setVersion(factura.getVersion() + 1);
        return getFacturaRepository().save(factura);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param factura
     */
    @Transactional
    public void FacturaServiceImpl.delete(Factura factura) {
        // Clear bidirectional one-to-many parent relationship with ItemFactura
        for (ItemFactura item : factura.getItemsFactura()) {
            item.setFactura(null);
        }
        
        getFacturaRepository().delete(factura);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param entities
     * @return List
     */
    @Transactional
    public List<Factura> FacturaServiceImpl.save(Iterable<Factura> entities) {
        return getFacturaRepository().save(entities);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     */
    @Transactional
    public void FacturaServiceImpl.delete(Iterable<Long> ids) {
        List<Factura> toDelete = getFacturaRepository().findAll(ids);
        getFacturaRepository().deleteInBatch(toDelete);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param entity
     * @return Factura
     */
    @Transactional
    public Factura FacturaServiceImpl.save(Factura entity) {
        return getFacturaRepository().save(entity);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param id
     * @return Factura
     */
    public Factura FacturaServiceImpl.findOne(Long id) {
        return getFacturaRepository().findOne(id);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param id
     * @return Factura
     */
    public Factura FacturaServiceImpl.findOneForUpdate(Long id) {
        return getFacturaRepository().findOneDetached(id);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     * @return List
     */
    public List<Factura> FacturaServiceImpl.findAll(Iterable<Long> ids) {
        return getFacturaRepository().findAll(ids);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return List
     */
    public List<Factura> FacturaServiceImpl.findAll() {
        return getFacturaRepository().findAll();
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return Long
     */
    public long FacturaServiceImpl.count() {
        return getFacturaRepository().count();
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public Page<Factura> FacturaServiceImpl.findAll(GlobalSearch globalSearch, Pageable pageable) {
        return getFacturaRepository().findAll(globalSearch, pageable);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public Page<Factura> FacturaServiceImpl.findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable) {
        return getFacturaRepository().findAllByIdsIn(ids, globalSearch, pageable);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return Class
     */
    public Class<Factura> FacturaServiceImpl.getEntityType() {
        return Factura.class;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return Class
     */
    public Class<Long> FacturaServiceImpl.getIdType() {
        return Long.class;
    }
    
}
