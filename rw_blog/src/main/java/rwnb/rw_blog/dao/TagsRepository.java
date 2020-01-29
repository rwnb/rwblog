package rwnb.rw_blog.dao;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import rwnb.rw_blog.entity.Tag;


import java.util.List;

public interface TagsRepository extends JpaRepository <Tag,Long>{
    Tag findByName(String name);
    @Query("select t from  Tag  t")
    List<Tag> findTop(Pageable pageable);
}
