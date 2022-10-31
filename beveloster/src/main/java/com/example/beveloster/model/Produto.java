
package com.example.beveloster.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_produto")
public class Produto  {
		
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_produto")
    private int id;

    @Column(name = "nome_produto")
    private String nome;

    @Column(name = "preco_produto")
    private String preco;
    
    @Column(name = "qtd_produto")
    private int quantidade;

	
}
