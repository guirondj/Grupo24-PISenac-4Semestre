package com.edumatch.EduMatch.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edumatch.EduMatch.model.Mentorado;

@Repository
public interface MentoradoRepository extends JpaRepository<Mentorado, Long> {
}