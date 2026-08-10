package vn.edu.crs.course_service.repository;

import vn.edu.crs.course_service.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;

public interface CourseRepository extends JpaRepository<Course, Long> {
    boolean existsByTenMonHocIgnoreCase(String tenMonHoc);
    Page<Course> findByTenMonHocContainingIgnoreCase(String keyword, Pageable pageable);
}
