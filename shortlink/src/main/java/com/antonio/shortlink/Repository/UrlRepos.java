package com.antonio.shortlink.Repository;


import com.antonio.shortlink.Modal.Url;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UrlRepos extends JpaRepository<Url,Long > {


   @Query (value =" select orginallink from Url where shortlink= ?1" )
   public String findByShortlink(String id);
}
