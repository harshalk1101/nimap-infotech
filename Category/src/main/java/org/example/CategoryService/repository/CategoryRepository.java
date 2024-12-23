package org.example.CategoryService.repository;
import org.example.CategoryService.domain.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.mongodb.repository.MongoRepository;
@Repository
public interface CategoryRepository extends MongoRepository<Category,String> {
}
