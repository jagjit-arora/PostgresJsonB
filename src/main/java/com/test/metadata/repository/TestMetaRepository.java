package com.test.metadata.repository;

import com.test.metadata.entities.TestMeta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestMetaRepository extends JpaRepository<TestMeta, Long> {
}
