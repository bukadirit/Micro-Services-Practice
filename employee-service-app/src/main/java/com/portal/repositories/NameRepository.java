package com.portal.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.portal.models.Name;

public interface NameRepository extends JpaRepository<Name, Integer>{

}
