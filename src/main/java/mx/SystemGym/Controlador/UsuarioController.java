package mx.SystemGym.Controlador;

import mx.SystemGym.Dto.UsuatioDTO;
import mx.SystemGym.Repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UsuarioController {

	


@Autowired
UsuarioRepository dao;
	
	
@RequestMapping("/inicio")
public String inicio()
{
	UsuatioDTO usuario = new UsuatioDTO();
	usuario.setEdad(1);
	usuario.setId(123);
	usuario.setNombre("Jose ROsario");
	dao.save(usuario);
	
	
	return "inicio";
}
}
