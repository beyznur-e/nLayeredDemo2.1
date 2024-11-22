package business.concretes;

import business.abstracts.ProductService;
import core.utilities.results.DataResult;
import core.utilities.results.Result;
import core.utilities.results.SuccessDataResult;
import core.utilities.results.SuccessResult;
import dataAccess.abstracts.ProductDao;
import entities.concretes.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProductManager implements ProductService {

    private ProductDao productDao;

    @Autowired
    public ProductManager(ProductDao productDao) {
        this.productDao = productDao;
    }

    @Override
    public DataResult<List<Product>> getAll() {
        return new SuccessDataResult<List<Product>>(this.productDao.findAll(),"Data listelendi.");
    }

    @Override
    public Result add(Product product) {
        this.productDao.save(product);
        return new SuccessResult("Ürün eklendi.");
    }
}