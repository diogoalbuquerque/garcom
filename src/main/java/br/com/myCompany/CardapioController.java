package br.com.myCompany;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CardapioController {

    @Autowired
    private RestauranteRepository repository;

    @RequestMapping(value = "/cardapio", method = RequestMethod.GET)
    @ResponseBody
    public List<CardapioItem> getCardapio() {
        return repository.getItensDoCardapio();
    }

}
