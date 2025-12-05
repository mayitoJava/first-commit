package AVilchis.ProgramacionNCapasNoviembre25.ML;

public class Estado {
    private int IdEstado;
    private String Nombre;
    public Pais Pais;
    
    public int getIdEstado(){
        return IdEstado;
    }
    
    public void setIdEstado(int IdEstado){
        this.IdEstado = IdEstado;
    }
    
    public String getNombre(){
        return Nombre;
    }
    
    public void setNombre(String Nombre){
        this.Nombre = Nombre;
    }

    public void setPais(Pais pais) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}