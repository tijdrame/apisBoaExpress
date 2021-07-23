package com.boa.api.repository;

import com.boa.api.domain.Pays;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data  repository for the Pays entity.
 */
@SuppressWarnings("unused")
@Repository
public interface PaysRepository extends JpaRepository<Pays, Long> {
    Pays findByIsoAlpha3(String isoAlpha3);
}
