package br.com.senai.stockstorage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.com.senai.stockstorage.orm.Products;
import br.com.senai.stockstorage.service.ProductsService;

@Controller
public class ProductsController {
    
    @Autowired
    private ProductsService service;
    
    @GetMapping({"/produtos", "/"})
    public String showProducts(Model model) {
        model.addAttribute("products", service.showProducts());
        return "products";
    }

    @GetMapping({"/produtos/cadastrar"})
    public String registerProducts(Model model) {
        Products products = new Products();
        
        model.addAttribute("products", products);
        return "record";
    }

    @PostMapping("/produtos")
    public String saveProducts(@ModelAttribute("products") Products products) {
        service.saveProducts(products);
        return "redirect:produtos";
    }

    @GetMapping("/produtos/editar/{id}")
    public String modifyProducts(@PathVariable Integer id, Model model) {
        model.addAttribute("products", service.queryProductsId(id));
        return "modify";
    }

    @GetMapping({"/produtos/{id}"})
    public String deleteProducts(@PathVariable Integer id) {
        service.deleteProducts(id);
        return "redirect:/produtos";
    }

    @PostMapping("/produtos/{id}")
    public String updateProducts(@PathVariable Integer id, @ModelAttribute("products") Products products, Model model) {
        Products item = service.queryProductsId(id);

        item.setId(id);
        item.setName(products.getName());
        item.setType(products.getType());
        item.setQuantity(products.getQuantity());
        item.setMinimum(products.getMinimum());
        item.setPrice(products.getPrice());
        item.setLocation(products.getLocation());
        item.setSupplier(products.getSupplier());

        service.updateProducts(item);
        return "redirect:/produtos";
    }
}
