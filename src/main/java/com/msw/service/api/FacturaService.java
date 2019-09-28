package com.msw.service.api;
import com.msw.Factura;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = FacturaService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = Factura.class)
public interface FacturaService extends EntityResolver<Factura, Long>, ValidatorService<Factura> {
}
