package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.StoreModel;


@Repository
public interface StoreRepo extends JpaRepository<StoreModel, Integer>{

}
