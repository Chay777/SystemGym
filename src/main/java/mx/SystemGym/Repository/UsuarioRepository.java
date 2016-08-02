package mx.SystemGym.Repository;

import java.io.Serializable;

import mx.SystemGym.Dto.UsuatioDTO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<UsuatioDTO, Serializable>{

}
