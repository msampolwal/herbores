package com.msw.view;
import com.msw.Factura;
import io.springlets.web.mvc.util.concurrency.ConcurrencyManager;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = FacturasItemThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = Factura.class, type = ControllerType.ITEM)
@RooThymeleaf
public class FacturasItemThymeleafController implements ConcurrencyManager<Factura> {
}
