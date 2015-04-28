package br.com.myCompany;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@Entity
@Table(name = "cardapio_item")
@JsonIgnoreProperties(ignoreUnknown = true)
public class CardapioItem {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_cardapio_item", nullable = false)
    private Long id;
    @Column(name = "nm_descricao", nullable = false)
    private String descricao;
    @Column(name = "vl_preco", nullable = false)
    private Double preco;

    public CardapioItem() {
    }

    public CardapioItem(Long id, String descricao, Double preco) {
        super();
        this.id = id;
        this.descricao = descricao;
        this.preco = preco;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
}
