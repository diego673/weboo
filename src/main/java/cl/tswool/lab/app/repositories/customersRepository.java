package cl.tswool.lab.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.tswool.lab.app.models.customers;

public interface customersRepository extends JpaRepository<customers, Integer> {

}
