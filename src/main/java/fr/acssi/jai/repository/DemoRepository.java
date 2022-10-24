package fr.acssi.jai.repository;

import fr.acssi.jai.entities.DemoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DemoRepository extends JpaRepository<DemoEntity, Integer> {
}
