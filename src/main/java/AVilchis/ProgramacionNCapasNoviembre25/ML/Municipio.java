package AVilchis.ProgramacionNCapasNoviembre25.ML;

public class Municipio {
    private int IdMunicipio;
    private String Nombre;
    public Estado Estado;
    
    public int getIdMunicipio(){
        return IdMunicipio;
    }
    
    public void setIdMunicipio(int IdMunicipio){
        this.IdMunicipio = IdMunicipio;
    }
    
    public String getNombre(){
        return Nombre;
    }
    
    public void setNombre(String Nombre){
        this.Nombre = Nombre;
    }

    public void setEstado(Estado estado) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}