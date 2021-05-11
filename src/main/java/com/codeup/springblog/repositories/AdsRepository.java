package com.codeup.springblog.repositories;

import com.codeup.springblog.models.Ad;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AdsRepository extends JpaRepository<Ad, Long> {
    List<Ad> findAll();

    Ad getOne(long id);

    void deleteById(long l);


}
