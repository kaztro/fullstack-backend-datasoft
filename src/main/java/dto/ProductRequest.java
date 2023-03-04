package dto;

import com.kaztro.fullstackbackenddatasoft.model.Category;

public class ProductRequest {
    
    private Category categorias;

    public Category getCategorias() {
        return categorias;
    }

    public void setCategorias(Category categorias) {
        this.categorias = categorias;
    }

}
