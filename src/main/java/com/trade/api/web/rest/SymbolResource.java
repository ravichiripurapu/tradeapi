package com.trade.api.web.rest;

import com.trade.api.config.Constants;
import com.trade.api.domain.Symbol;
import com.trade.api.domain.User;
import com.trade.api.repository.SymbolRepository;
import com.trade.api.repository.UserRepository;
import com.trade.api.security.AuthoritiesConstants;
import com.trade.api.service.MailService;
import com.trade.api.service.UserService;
import com.trade.api.service.dto.UserDTO;
import com.trade.api.web.rest.errors.BadRequestAlertException;
import com.trade.api.web.rest.errors.EmailAlreadyUsedException;
import com.trade.api.web.rest.errors.LoginAlreadyUsedException;
import io.github.jhipster.web.util.HeaderUtil;
import io.github.jhipster.web.util.PaginationUtil;
import io.github.jhipster.web.util.ResponseUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Optional;

/**
 * REST controller for managing symbol.
 */
@RestController
@RequestMapping("/api")
public class SymbolResource {

    private final SymbolRepository symbolRepository;

    public SymbolResource(SymbolRepository symbolRepository) {
        this.symbolRepository = symbolRepository;
    }

    /**
     * {@code GET /users} : get all users.
     *
     * @param pageable the pagination information.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body all users.
     */
    @GetMapping("/symbol/{symbol}")
    public List<Symbol> getSymbol(@PathVariable String symbol) {
        return symbolRepository.findAllByName(symbol);
    }


}
