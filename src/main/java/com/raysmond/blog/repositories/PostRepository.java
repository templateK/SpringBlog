package com.raysmond.blog.repositories;

import com.raysmond.blog.models.Post;
import com.raysmond.blog.models.support.PostType;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface PostRepository extends CrudRepository<Post, Long>, PagingAndSortingRepository<Post, Long>{
    Post findByTitle(String title);
    Post findByTitleAndPostType(String title, PostType postType);
    Page<Post> findAllByPostType(PostType postType, Pageable pageRequest);
}

