package business.abstracts;

import core.utilities.results.DataResult;
import core.utilities.results.Result;
import entities.concretes.Product;

import java.util.List;

public interface ProductService {
    DataResult<List<Product>>  getAll();
    Result add(Product product);
}