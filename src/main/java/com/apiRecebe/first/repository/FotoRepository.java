package com.apiRecebe.first.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.apiRecebe.first.model.Foto;

@Repository
public interface FotoRepository extends JpaRepository<Foto, String>{

}
