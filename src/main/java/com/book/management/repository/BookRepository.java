package com.book.management.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.book.management.entity.BookEntity;
import com.book.management.entity.CategoryEntity;

public interface BookRepository extends JpaRepository<BookEntity, Integer> {

	List<BookEntity> findByCategory(CategoryEntity category);
}