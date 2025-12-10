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
@Table(name="estado")
public class estadoJPA {

    public paisJPA getPais() {
        return Pais;
    }

    public void setPais(paisJPA Pais) {
        this.Pais = Pais;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idestado")
    private int IdEstado;
     @Column(name = "nombre")
    private String Nombre;
    @ManyToOne
    @JoinColumn(name = "idpais")
    public paisJPA Pais;
    
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
}
