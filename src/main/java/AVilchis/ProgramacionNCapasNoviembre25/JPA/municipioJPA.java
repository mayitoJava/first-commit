package AVilchis.ProgramacionNCapasNoviembre25.JPA;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="municipio")
public class municipioJPA {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idmunicipio")
    private int IdMunicipio;
    @Column(name = "nombre")
    private String Nombre;

    public estadoJPA getEstado() {
        return Estado;
    }

    public void setEstado(estadoJPA Estado) {
        this.Estado = Estado;
    }
    @ManyToOne
    @JoinColumn(name = "idestado")
    public estadoJPA Estado;
    
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
}
