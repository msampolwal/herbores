package com.msw.dao;
import com.msw.Presentacion;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = PresentacionRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = Presentacion.class)
public interface PresentacionRepository extends DetachableJpaRepository<Presentacion, Long>, PresentacionRepositoryCustom {
}
