package com.porfoliopg.PSG.Security.Service;


import com.porfoliopg.PSG.Security.Entity.Rol;
import com.porfoliopg.PSG.Security.Enums.RolNombre;
import com.porfoliopg.PSG.Security.Repository.RolRepository;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class RolService {
    @Autowired
    RolRepository rolRepository;
    
    public Optional<Rol> getByRolNombre(RolNombre rolNombre){
    return rolRepository.findByRolNombre(rolNombre);
    }
    
    public void save(Rol rol){
    rolRepository.save(rol);
    }
}
