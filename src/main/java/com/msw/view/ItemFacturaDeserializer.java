package com.msw.view;
import com.msw.ItemFactura;
import com.msw.service.api.ItemFacturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = ItemFacturaDeserializer
 TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = ItemFactura.class)
public class ItemFacturaDeserializer extends JsonObjectDeserializer<ItemFactura> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ItemFacturaService itemFacturaService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param itemFacturaService
     * @param conversionService
     */
    @Autowired
    public ItemFacturaDeserializer(@Lazy ItemFacturaService itemFacturaService, ConversionService conversionService) {
        this.itemFacturaService = itemFacturaService;
        this.conversionService = conversionService;
    }
}
