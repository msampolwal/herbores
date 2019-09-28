package com.msw.view;
import com.msw.Proveedor;
import com.msw.service.api.ProveedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = ProveedorDeserializer
 TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = Proveedor.class)
public class ProveedorDeserializer extends JsonObjectDeserializer<Proveedor> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ProveedorService proveedorService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param proveedorService
     * @param conversionService
     */
    @Autowired
    public ProveedorDeserializer(@Lazy ProveedorService proveedorService, ConversionService conversionService) {
        this.proveedorService = proveedorService;
        this.conversionService = conversionService;
    }
}
