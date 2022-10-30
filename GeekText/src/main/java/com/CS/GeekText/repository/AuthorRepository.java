package com.CS.GeekText.repository;

import com.CS.GeekText.model.Authors;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends JpaRepository<Authors, Integer>{
}
