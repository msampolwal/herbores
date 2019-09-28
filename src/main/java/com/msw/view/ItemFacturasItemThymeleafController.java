package com.msw.view;
import com.msw.ItemFactura;
import io.springlets.web.mvc.util.concurrency.ConcurrencyManager;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = ItemFacturasItemThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = ItemFactura.class, type = ControllerType.ITEM)
@RooThymeleaf
public class ItemFacturasItemThymeleafController implements ConcurrencyManager<ItemFactura> {
}
