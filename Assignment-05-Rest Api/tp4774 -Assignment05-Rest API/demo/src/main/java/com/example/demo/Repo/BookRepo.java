package com.example.demo.Repo;

import com.example.demo.Models.Book;
import com.example.demo.Repo.BookRepo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepo extends JpaRepository<Book, Long>{
}
