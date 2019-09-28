package com.msw.service.api;
import com.msw.Presentacion;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = PresentacionService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = Presentacion.class)
public interface PresentacionService extends EntityResolver<Presentacion, Long>, ValidatorService<Presentacion> {
}
