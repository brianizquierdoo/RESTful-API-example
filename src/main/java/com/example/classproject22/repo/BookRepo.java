package com.example.classproject22.repo;

import com.example.classproject22.model.Books;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepo extends JpaRepository<Books, Long> {

    @Query("select b from Books b where b.genre = ?1")
    List<Books> findBooksByGenre(String genre);

}