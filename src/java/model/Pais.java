package model;
// Generated 11-18-2015 05:01:00 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Pais generated by hbm2java
 */
@Entity
@Table(name="pais"
    ,catalog="gasisw_bd1"
)
public class Pais  implements java.io.Serializable {


     private Integer idPais;
     private String nombre;
     private Integer codigoPostal;
     private Set departamentos = new HashSet(0);

    public Pais() {
    }

	
    public Pais(String nombre) {
        this.nombre = nombre;
    }
    public Pais(String nombre, Integer codigoPostal, Set departamentos) {
       this.nombre = nombre;
       this.codigoPostal = codigoPostal;
       this.departamentos = departamentos;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="id_pais", unique=true, nullable=false)
    public Integer getIdPais() {
        return this.idPais;
    }
    
    public void setIdPais(Integer idPais) {
        this.idPais = idPais;
    }

    
    @Column(name="nombre", nullable=false, length=25)
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    @Column(name="codigo_postal")
    public Integer getCodigoPostal() {
        return this.codigoPostal;
    }
    
    public void setCodigoPostal(Integer codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="pais")
    public Set getDepartamentos() {
        return this.departamentos;
    }
    
    public void setDepartamentos(Set departamentos) {
        this.departamentos = departamentos;
    }




}


