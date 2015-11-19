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
 * CierreCaja generated by hbm2java
 */
@Entity
@Table(name="cierre_caja"
    ,catalog="gasisw_bd1"
)
public class CierreCaja  implements java.io.Serializable {


     private Integer idCierreCaja;
     private Empleado empleado;
     private Byte saldoApertura;
     private Byte saldoCierre;
     private Integer centavo;
     private Integer diez;
     private Integer cuarto;
     private Integer dolar;
     private Integer cincoD;
     private Integer diezD;
     private Integer veinteD;
     private Byte montoEfectivo;
     private Byte montoVoucher;
     private Byte montoCheque;

    public CierreCaja() {
    }

	
    public CierreCaja(Empleado empleado) {
        this.empleado = empleado;
    }
    public CierreCaja(Empleado empleado, Byte saldoApertura, Byte saldoCierre, Integer centavo, Integer diez, Integer cuarto, Integer dolar, Integer cincoD, Integer diezD, Integer veinteD, Byte montoEfectivo, Byte montoVoucher, Byte montoCheque) {
       this.empleado = empleado;
       this.saldoApertura = saldoApertura;
       this.saldoCierre = saldoCierre;
       this.centavo = centavo;
       this.diez = diez;
       this.cuarto = cuarto;
       this.dolar = dolar;
       this.cincoD = cincoD;
       this.diezD = diezD;
       this.veinteD = veinteD;
       this.montoEfectivo = montoEfectivo;
       this.montoVoucher = montoVoucher;
       this.montoCheque = montoCheque;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="id_cierre_caja", unique=true, nullable=false)
    public Integer getIdCierreCaja() {
        return this.idCierreCaja;
    }
    
    public void setIdCierreCaja(Integer idCierreCaja) {
        this.idCierreCaja = idCierreCaja;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="EMPLEADO_id_empleado", nullable=false)
    public Empleado getEmpleado() {
        return this.empleado;
    }
    
    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    
    @Column(name="saldo_apertura", precision=2, scale=0)
    public Byte getSaldoApertura() {
        return this.saldoApertura;
    }
    
    public void setSaldoApertura(Byte saldoApertura) {
        this.saldoApertura = saldoApertura;
    }

    
    @Column(name="saldo_cierre", precision=2, scale=0)
    public Byte getSaldoCierre() {
        return this.saldoCierre;
    }
    
    public void setSaldoCierre(Byte saldoCierre) {
        this.saldoCierre = saldoCierre;
    }

    
    @Column(name="centavo")
    public Integer getCentavo() {
        return this.centavo;
    }
    
    public void setCentavo(Integer centavo) {
        this.centavo = centavo;
    }

    
    @Column(name="diez")
    public Integer getDiez() {
        return this.diez;
    }
    
    public void setDiez(Integer diez) {
        this.diez = diez;
    }

    
    @Column(name="cuarto")
    public Integer getCuarto() {
        return this.cuarto;
    }
    
    public void setCuarto(Integer cuarto) {
        this.cuarto = cuarto;
    }

    
    @Column(name="dolar")
    public Integer getDolar() {
        return this.dolar;
    }
    
    public void setDolar(Integer dolar) {
        this.dolar = dolar;
    }

    
    @Column(name="cinco_d")
    public Integer getCincoD() {
        return this.cincoD;
    }
    
    public void setCincoD(Integer cincoD) {
        this.cincoD = cincoD;
    }

    
    @Column(name="diez_d")
    public Integer getDiezD() {
        return this.diezD;
    }
    
    public void setDiezD(Integer diezD) {
        this.diezD = diezD;
    }

    
    @Column(name="veinte_d")
    public Integer getVeinteD() {
        return this.veinteD;
    }
    
    public void setVeinteD(Integer veinteD) {
        this.veinteD = veinteD;
    }

    
    @Column(name="monto_efectivo", precision=2, scale=0)
    public Byte getMontoEfectivo() {
        return this.montoEfectivo;
    }
    
    public void setMontoEfectivo(Byte montoEfectivo) {
        this.montoEfectivo = montoEfectivo;
    }

    
    @Column(name="monto_voucher", precision=2, scale=0)
    public Byte getMontoVoucher() {
        return this.montoVoucher;
    }
    
    public void setMontoVoucher(Byte montoVoucher) {
        this.montoVoucher = montoVoucher;
    }

    
    @Column(name="monto_cheque", precision=2, scale=0)
    public Byte getMontoCheque() {
        return this.montoCheque;
    }
    
    public void setMontoCheque(Byte montoCheque) {
        this.montoCheque = montoCheque;
    }




}


