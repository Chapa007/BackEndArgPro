package com.portfolio.arg.Controller;

import com.portfolio.arg.Entity.Persona;
import com.portfolio.arg.Interface.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
@CrossOrigin(origins = "mid-virgina-chapa007.koyeb.app")
public class PersonaController {
    @Autowired IPersonaService IpersonaService;
    
    
@GetMapping("personas/traer")
    public List<Persona> getPersona(){
        return IpersonaService.getPersona();
    }
    
@PreAuthorize("hasRole('ADMIN')")
@PostMapping("/personas/crear")
public String createPersona(@RequestBody Persona persona){
    IpersonaService.savePersona(persona);
    return "La persona se creo correctamente";
}

@PreAuthorize("hasRole('ADMIN')")
@DeleteMapping("/personas/borrar/{id}")
public String deletePersona(@PathVariable Long id){
    IpersonaService.deletePersona(id);
    return "La Persona se elimino correctamente";
}

@PreAuthorize("hasRole('ADMIN')")
@PutMapping("/personas/editar/{id}")
public Persona editPersona(@PathVariable Long id,
                           @RequestParam("nombre") String nuevoNombre,
                           @RequestParam("apellido") String nuevoApellido,
                           @RequestParam("img") String nuevoImg){
    Persona persona = IpersonaService.findPersona(id);
    
    persona.setNombre(nuevoNombre);
    persona.setApellido(nuevoApellido);
    persona.setImg(nuevoImg);
    
   IpersonaService.savePersona(persona);
    return persona;
}

@GetMapping("/personas/traer/perfil")
public Persona findPersona(){
    return IpersonaService.findPersona((long)4);
}
   
}
