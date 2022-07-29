package com.porfoliopg.PSG.Security.Repository;

import com.porfoliopg.PSG.Security.Entity.Rol;
import com.porfoliopg.PSG.Security.Enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolRepository extends JpaRepository<Rol, Integer>{
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
    
}
