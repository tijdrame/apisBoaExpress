package com.boa.api.web.rest;

import com.boa.api.domain.Tracking;
import com.boa.api.service.TrackingService;
import com.boa.api.web.rest.errors.BadRequestAlertException;
import java.net.URI;
import java.net.URISyntaxException;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.List;
import java.util.Optional;
import javax.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
/*import io.github.jhipster.web.util.HeaderUtil;
import io.github.jhipster.web.util.PaginationUtil;
import io.github.jhipster.web.util.ResponseUtil;*/
import springfox.documentation.annotations.ApiIgnore;

/**
 * REST controller for managing {@link com.boa.api.domain.Tracking}.
 */
@RestController
@RequestMapping("/api")
@ApiIgnore
public class TrackingResource {

    private final Logger log = LoggerFactory.getLogger(TrackingResource.class);

    private static final String ENTITY_NAME = "tracking";

    @Value("${jhipster.clientApp.name}")
    private String applicationName;

    private final TrackingService trackingService;

    public TrackingResource(TrackingService trackingService) {
        this.trackingService = trackingService;
    }
    /**
     * {@code POST  /trackings} : Create a new tracking.
     *
     * @param tracking the tracking to create.
     * @return the {@link ResponseEntity} with status {@code 201 (Created)} and with body the new tracking, or with status {@code 400 (Bad Request)} if the tracking has already an ID.
     * @throws URISyntaxException if the Location URI syntax is incorrect.
     */
    /*@PostMapping("/trackings")
    public ResponseEntity<Tracking> createTracking(@Valid @RequestBody Tracking tracking) throws URISyntaxException {
        log.debug("REST request to save Tracking : {}", tracking);
        if (tracking.getId() != null) {
            throw new BadRequestAlertException("A new tracking cannot already have an ID", ENTITY_NAME, "idexists");
        }
        Tracking result = trackingService.save(tracking);
        return ResponseEntity.created(new URI("/api/trackings/" + result.getId()))
            .headers(HeaderUtil.createEntityCreationAlert(applicationName, true, ENTITY_NAME, result.getId().toString()))
            .body(result);
    }

    /**
     * {@code PUT  /trackings} : Updates an existing tracking.
     *
     * @param tracking the tracking to update.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the updated tracking,
     * or with status {@code 400 (Bad Request)} if the tracking is not valid,
     * or with status {@code 500 (Internal Server Error)} if the tracking couldn't be updated.
     * @throws URISyntaxException if the Location URI syntax is incorrect.
     */
    /*@PutMapping("/trackings")
    public ResponseEntity<Tracking> updateTracking(@Valid @RequestBody Tracking tracking) throws URISyntaxException {
        log.debug("REST request to update Tracking : {}", tracking);
        if (tracking.getId() == null) {
            throw new BadRequestAlertException("Invalid id", ENTITY_NAME, "idnull");
        }
        Tracking result = trackingService.save(tracking);
        return ResponseEntity.ok()
            .headers(HeaderUtil.createEntityUpdateAlert(applicationName, true, ENTITY_NAME, tracking.getId().toString()))
            .body(result);
    }

    /**
     * {@code GET  /trackings} : get all the trackings.
     *
     * @param pageable the pagination information.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and the list of trackings in body.
     */
    /*@GetMapping("/trackings")
    public ResponseEntity<List<Tracking>> getAllTrackings(Pageable pageable) {
        log.debug("REST request to get a page of Trackings");
        Page<Tracking> page = trackingService.findAll(pageable);
        HttpHeaders headers = PaginationUtil.generatePaginationHttpHeaders(ServletUriComponentsBuilder.fromCurrentRequest(), page);
        return ResponseEntity.ok().headers(headers).body(page.getContent());
    }

    @GetMapping(path="/trackingsBis", params = {"dateDeb", "dateFin", "requestId"})
    public ResponseEntity<List<Tracking>> getAllTrackings(@RequestParam LocalDate dateDeb,
    @RequestParam LocalDate dateFin, @RequestParam Optional<String> requestId, Pageable pageable) {
        /*log.info("REST request to get a page of Transactions");
        log.info("RequestId [{}]",requestId.isPresent()?requestId.get().trim().toUpperCase():"");
        log.info("Date deb [{}]",dateDeb);
        log.info("Date fin [{}]",dateFin);*/
    //Instant from = dateDeb.atStartOfDay(ZoneId.systemDefault()).toInstant();
    //Instant from = dateDeb.atStartOfDay().toInstant(ZoneOffset.UTC);
    /*LocalDateTime fromB = dateDeb.atTime(LocalTime.MIN);
        LocalDateTime toB = dateFin.atTime(LocalTime.MAX);
        Instant from = fromB.atZone(ZoneId.systemDefault()).toInstant();;
        Instant to = toB.atZone(ZoneId.systemDefault()).toInstant();

        log.debug("from deb [{}]",from); 
        log.debug("to fin [{}]",toB);
        Page<Tracking> page = trackingService.findByCriteria(from, to,
        requestId.isPresent()?"%"+requestId.get().trim().toUpperCase()+"%":"", pageable);
        HttpHeaders headers = PaginationUtil.generatePaginationHttpHeaders(ServletUriComponentsBuilder.fromCurrentRequest(), page);
        return ResponseEntity.ok().headers(headers).body(page.getContent());
    }

    /**
     * {@code GET  /trackings/:id} : get the "id" tracking.
     *
     * @param id the id of the tracking to retrieve.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the tracking, or with status {@code 404 (Not Found)}.
     */
    /*@GetMapping("/trackings/{id}")
    public ResponseEntity<Tracking> getTracking(@PathVariable Long id) {
        log.debug("REST request to get Tracking : {}", id);
        Optional<Tracking> tracking = trackingService.findOne(id);
        return ResponseUtil.wrapOrNotFound(tracking);
    }

    /**
     * {@code DELETE  /trackings/:id} : delete the "id" tracking.
     *
     * @param id the id of the tracking to delete.
     * @return the {@link ResponseEntity} with status {@code 204 (NO_CONTENT)}.
     */
    /*@DeleteMapping("/trackings/{id}")
    public ResponseEntity<Void> deleteTracking(@PathVariable Long id) {
        log.debug("REST request to delete Tracking : {}", id);
        trackingService.delete(id);
        return ResponseEntity.noContent().headers(HeaderUtil.createEntityDeletionAlert(applicationName, true, ENTITY_NAME, id.toString())).build();
    }*/
}
