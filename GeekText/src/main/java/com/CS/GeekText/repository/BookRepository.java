package com.CS.GeekText.repository;

import com.CS.GeekText.model.Books;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Books, Long>{

//    Page<Books> findByTitleContaining(String title, Pageable pageable);
//
//    List<Books> findByTitleContaining(String title, Sort sort);

    List<Books> findByAuthor(String author);

}


