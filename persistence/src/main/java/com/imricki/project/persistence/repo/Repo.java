package com.imricki.project.persistence.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.imricki.project.persistence.entity.Test;

@Repository
public interface Repo extends JpaRepository<Test, Long> {

}
