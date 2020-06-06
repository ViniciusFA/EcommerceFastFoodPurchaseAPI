package respository;

import org.springframework.data.jpa.repository.JpaRepository;

import model.ProductModel;

public interface IProductRepository extends JpaRepository<ProductModel, Long>{

	
	
}
