package uz.yt.poundry.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.yt.poundry.api.domain.Authority;

/**
 * Spring Data JPA repository for the {@link Authority} entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {}
