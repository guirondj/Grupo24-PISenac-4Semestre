package com.edumatch.EduMatch.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edumatch.EduMatch.models.Acesso;

@Repository
public interface AcessoRepository extends JpaRepository<Acesso, Long> {
    
}