package AVilchis.ProgramacionNCapasNoviembre25.DAO;

import AVilchis.ProgramacionNCapasNoviembre25.JPA.usuarioJPA;
import AVilchis.ProgramacionNCapasNoviembre25.ML.Result;

public interface IUsuarioJPA {
    public Result GetAll();
    
    public Result Add(usuarioJPA usuario);
}
