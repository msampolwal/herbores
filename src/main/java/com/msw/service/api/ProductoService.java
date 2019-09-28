package com.msw.service.api;
import com.msw.Producto;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = ProductoService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = Producto.class)
public interface ProductoService extends EntityResolver<Producto, Long>, ValidatorService<Producto> {
}
