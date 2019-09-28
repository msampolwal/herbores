package com.msw.view;
import com.msw.Producto;
import io.springlets.web.mvc.util.concurrency.ConcurrencyManager;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = ProductoesItemThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = Producto.class, type = ControllerType.ITEM)
@RooThymeleaf
public class ProductoesItemThymeleafController implements ConcurrencyManager<Producto> {
}
