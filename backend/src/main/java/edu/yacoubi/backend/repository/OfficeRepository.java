package edu.yacoubi.backend.repository;

import edu.yacoubi.backend.model.Office;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OfficeRepository extends JpaRepository<Office, String> {
}
