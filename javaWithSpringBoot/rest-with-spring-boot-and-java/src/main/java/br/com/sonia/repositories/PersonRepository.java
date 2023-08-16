package br.com.sonia.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.sonia.model.Person;

public interface PersonRepository extends JpaRepository<Person, Long>{}
