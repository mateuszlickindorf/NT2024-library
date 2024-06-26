package com.mateusz.library.library.infrastructure.repository;

import com.mateusz.library.library.infrastructure.entity.BookEntity;
import com.mateusz.library.library.infrastructure.entity.LoanEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface LoanRepository extends CrudRepository<LoanEntity, Long> {
    List<LoanEntity> findByUserId(long userId);
    List<LoanEntity> findByBookId(long bookId);
    void deleteByUserId(long userId);
    void deleteByBookId(long bookId);
}