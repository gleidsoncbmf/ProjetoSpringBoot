
package com.example.beveloster.repository;

import com.example.beveloster.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Integer>{

}