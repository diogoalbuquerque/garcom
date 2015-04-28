package br.com.myCompany;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class RestauranteRepository {
    @Autowired
    private SessionFactory sessionFactory;

    @Transactional
    public List<CardapioItem> getItensDoCardapio() {
        Criteria criteria = sessionFactory.getCurrentSession().createCriteria(CardapioItem.class);
        return (List<CardapioItem>) criteria.list();
    }

    @Transactional
    public CardapioItem getItem(Long id) {
        return (CardapioItem) sessionFactory.getCurrentSession().get(CardapioItem.class, id);
    }

    @Transactional
    public void salvarPedido(Pedido pedido) {
        sessionFactory.getCurrentSession().save(pedido);
        sessionFactory.getCurrentSession().flush();
    }
}
