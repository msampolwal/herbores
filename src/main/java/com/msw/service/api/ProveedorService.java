package com.msw.service.api;
import com.msw.Proveedor;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = ProveedorService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = Proveedor.class)
public interface ProveedorService extends EntityResolver<Proveedor, Long>, ValidatorService<Proveedor> {
}
