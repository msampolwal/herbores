package com.msw.service.api;
import com.msw.Cliente;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = ClienteService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = Cliente.class)
public interface ClienteService extends EntityResolver<Cliente, Long>, ValidatorService<Cliente> {
}
