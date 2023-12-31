package com.curso.ecommerce.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.ecommerce.model.Producto;
import com.curso.ecommerce.repository.IProductoRepository;

@Service
public class ProductoServiceImpl implements ProductoService {
	
	@Autowired
	private IProductoRepository productoRepository;

	
	public Producto save (Producto producto) {
		
		return  productoRepository.save(producto);
	}

	

	public Optional<Producto> get(Integer id) {
		return productoRepository.findById(id);
	}

	
	public void update(Producto producto) {
		productoRepository.save(producto);
		
	}

	
	public void delete(Integer id) {
		productoRepository.deleteById(id);
		
	}



	@Override
	public List<Producto> findAll() {
		
		return productoRepository.findAll();
	}

}
