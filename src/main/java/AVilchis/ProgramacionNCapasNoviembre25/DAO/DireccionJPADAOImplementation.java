
package AVilchis.ProgramacionNCapasNoviembre25.DAO;

import AVilchis.ProgramacionNCapasNoviembre25.JPA.direccionJPA;
import AVilchis.ProgramacionNCapasNoviembre25.ML.Result;
import jakarta.persistence.EntityManager;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class DireccionJPADAOImplementation implements IDireccionJPA{
    
    @Autowired
    private EntityManager entityManager;

    @Override
    public Result GetById(int IdDireccion) {
        Result result = new Result();
        
        direccionJPA direccionBD = entityManager.find(direccionJPA.class,IdDireccion);
        
        ModelMapper modelMaperr = new ModelMapper();
        
        AVilchis.ProgramacionNCapasNoviembre25.ML.Direccion direccionML = modelMaperr.map(direccionBD, AVilchis.ProgramacionNCapasNoviembre25.ML.Direccion.class);
        
        result.Object = direccionML;
        
        return result;
    }

    
    
}
