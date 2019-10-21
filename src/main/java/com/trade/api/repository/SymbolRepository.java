package com.trade.api.repository;

import com.trade.api.domain.Symbol;
import com.trade.api.domain.User;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.Instant;
import java.util.List;
import java.util.Optional;

/**
 * Spring Data JPA repository for the {@link User} entity.
 */
@Repository
public interface SymbolRepository extends JpaRepository<Symbol, Long> {
    List<Symbol> findAllByName(String name);
}
