package br.com.sonia.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.sonia.model.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long>{}
