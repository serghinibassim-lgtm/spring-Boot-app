package com.bassim.project_spring_1.repositories;

import com.bassim.project_spring_1.models.Tag;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TagRepository extends JpaRepository<Tag,Long> {
}
