package me.dio.potenciatech.service;



import me.dio.potenciatech.entities.Restaurante;
import me.dio.potenciatech.resources.dto.RestauranteDto;

import java.util.List;

public interface RestauranteService {
    Restaurante incluir(RestauranteDto form);
    List<Restaurante> buscarTodos();
    Restaurante buscarPorId(Long id);
    Restaurante atualizar(Long id, RestauranteDto form);
    void deletar(Long id);
}