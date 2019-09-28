package com.msw.view;
import com.msw.Presentacion;
import com.msw.service.api.PresentacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = PresentacionDeserializer
 TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = Presentacion.class)
public class PresentacionDeserializer extends JsonObjectDeserializer<Presentacion> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private PresentacionService presentacionService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param presentacionService
     * @param conversionService
     */
    @Autowired
    public PresentacionDeserializer(@Lazy PresentacionService presentacionService, ConversionService conversionService) {
        this.presentacionService = presentacionService;
        this.conversionService = conversionService;
    }
}
