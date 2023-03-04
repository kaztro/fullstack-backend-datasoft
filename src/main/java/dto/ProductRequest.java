package dto;

import com.kaztro.fullstackbackenddatasoft.model.Categorias;

public class ProductRequest {
    
    private Categorias categorias;

    public Categorias getCategorias() {
        return categorias;
    }

    public void setCategorias(Categorias categorias) {
        this.categorias = categorias;
    }

}
