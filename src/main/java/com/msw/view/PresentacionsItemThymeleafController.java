package com.msw.view;
import com.msw.Presentacion;
import io.springlets.web.mvc.util.concurrency.ConcurrencyManager;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = PresentacionsItemThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = Presentacion.class, type = ControllerType.ITEM)
@RooThymeleaf
public class PresentacionsItemThymeleafController implements ConcurrencyManager<Presentacion> {
}
