package com.msw.service.api;
import com.msw.ItemFactura;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = ItemFacturaService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = ItemFactura.class)
public interface ItemFacturaService extends EntityResolver<ItemFactura, Long>, ValidatorService<ItemFactura> {
}
