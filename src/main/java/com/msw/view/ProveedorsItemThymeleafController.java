package com.msw.view;
import com.msw.Proveedor;
import io.springlets.web.mvc.util.concurrency.ConcurrencyManager;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = ProveedorsItemThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = Proveedor.class, type = ControllerType.ITEM)
@RooThymeleaf
public class ProveedorsItemThymeleafController implements ConcurrencyManager<Proveedor> {
}
