package cl.tswool.lab.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.tswool.lab.app.models.travels;

public interface travelsRepository extends JpaRepository<travels, Integer> {

}
