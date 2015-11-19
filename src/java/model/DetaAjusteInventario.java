package model;
// Generated 11-18-2015 05:01:00 PM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * DetaAjusteInventario generated by hbm2java
 */
@Entity
@Table(name="deta_ajuste_inventario"
    ,catalog="gasisw_bd1"
)
public class DetaAjusteInventario  implements java.io.Serializable {


     private Integer idDetaAjusteInventario;
     private AjusteInventario ajusteInventario;
     private Producto producto;

    public DetaAjusteInventario() {
    }

    public DetaAjusteInventario(AjusteInventario ajusteInventario, Producto producto) {
       this.ajusteInventario = ajusteInventario;
       this.producto = producto;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="id_deta_ajuste_inventario", unique=true, nullable=false)
    public Integer getIdDetaAjusteInventario() {
        return this.idDetaAjusteInventario;
    }
    
    public void setIdDetaAjusteInventario(Integer idDetaAjusteInventario) {
        this.idDetaAjusteInventario = idDetaAjusteInventario;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="ajuste_inventario_id_ajuste_inventario", nullable=false)
    public AjusteInventario getAjusteInventario() {
        return this.ajusteInventario;
    }
    
    public void setAjusteInventario(AjusteInventario ajusteInventario) {
        this.ajusteInventario = ajusteInventario;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="producto_id_producto", nullable=false)
    public Producto getProducto() {
        return this.producto;
    }
    
    public void setProducto(Producto producto) {
        this.producto = producto;
    }




}

