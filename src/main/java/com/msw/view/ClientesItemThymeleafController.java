package com.msw.view;
import com.msw.Cliente;
import io.springlets.web.mvc.util.concurrency.ConcurrencyManager;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = ClientesItemThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = Cliente.class, type = ControllerType.ITEM)
@RooThymeleaf
public class ClientesItemThymeleafController implements ConcurrencyManager<Cliente> {
}
