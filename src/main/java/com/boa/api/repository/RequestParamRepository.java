package com.boa.api.repository;

import com.boa.api.domain.RequestParam;
import java.util.Optional;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data  repository for the RequestParam entity.
 */
@SuppressWarnings("unused")
@Repository
public interface RequestParamRepository extends JpaRepository<RequestParam, Long> {
    RequestParam findByPays(String pays);
}
