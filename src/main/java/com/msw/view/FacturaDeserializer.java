package com.msw.view;
import com.msw.Factura;
import com.msw.service.api.FacturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = FacturaDeserializer
 TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = Factura.class)
public class FacturaDeserializer extends JsonObjectDeserializer<Factura> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private FacturaService facturaService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param facturaService
     * @param conversionService
     */
    @Autowired
    public FacturaDeserializer(@Lazy FacturaService facturaService, ConversionService conversionService) {
        this.facturaService = facturaService;
        this.conversionService = conversionService;
    }
}
