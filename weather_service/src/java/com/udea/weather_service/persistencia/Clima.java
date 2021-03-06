package com.udea.weather_service.persistencia;
// Generated 13/05/2017 03:48:23 PM by Hibernate Tools 4.3.1


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Clima generated by hbm2java
 */
@Entity
@Table(name="clima"
    ,catalog="weather"
)
public class Clima  implements java.io.Serializable {


     private Integer id;
     private String ciudad;
     private String tempactualfarenheith;
     private String tempactualcentigrados;
     private String humedad;
     private String tipoNubosidad;
     private String precipitacion;
     private String tempactualfarenheith2;
     private String tempactualcentigrados2;
     private String humedad2;
     private String tipoNubosidad2;
     private String precipitacion2;
     private String tempactualfarenheith3;
     private String tempactualcentigrados3;
     private String humedad3;
     private String tipoNubosidad3;
     private String precipitacion3;
     private Date fechaIngreso;

    public Clima() {
    }

    public Clima(String ciudad, String tempactualfarenheith, String tempactualcentigrados, String humedad, String tipoNubosidad, String precipitacion, String tempactualfarenheith2, String tempactualcentigrados2, String humedad2, String tipoNubosidad2, String precipitacion2, String tempactualfarenheith3, String tempactualcentigrados3, String humedad3, String tipoNubosidad3, String precipitacion3, Date fechaIngreso) {
       this.ciudad = ciudad;
       this.tempactualfarenheith = tempactualfarenheith;
       this.tempactualcentigrados = tempactualcentigrados;
       this.humedad = humedad;
       this.tipoNubosidad = tipoNubosidad;
       this.precipitacion = precipitacion;
       this.tempactualfarenheith2 = tempactualfarenheith2;
       this.tempactualcentigrados2 = tempactualcentigrados2;
       this.humedad2 = humedad2;
       this.tipoNubosidad2 = tipoNubosidad2;
       this.precipitacion2 = precipitacion2;
       this.tempactualfarenheith3 = tempactualfarenheith3;
       this.tempactualcentigrados3 = tempactualcentigrados3;
       this.humedad3 = humedad3;
       this.tipoNubosidad3 = tipoNubosidad3;
       this.precipitacion3 = precipitacion3;
       this.fechaIngreso = fechaIngreso;
    }
    public Clima(String ciudad, String tempactualfarenheith, String tempactualcentigrados, String humedad, String tipoNubosidad, String precipitacion, String tempactualfarenheith2, String tempactualcentigrados2, String humedad2, String tipoNubosidad2, String precipitacion2, String tempactualfarenheith3, String tempactualcentigrados3, String humedad3, String tipoNubosidad3, String precipitacion3) {
       this.ciudad = ciudad;
       this.tempactualfarenheith = tempactualfarenheith;
       this.tempactualcentigrados = tempactualcentigrados;
       this.humedad = humedad;
       this.tipoNubosidad = tipoNubosidad;
       this.precipitacion = precipitacion;
       this.tempactualfarenheith2 = tempactualfarenheith2;
       this.tempactualcentigrados2 = tempactualcentigrados2;
       this.humedad2 = humedad2;
       this.tipoNubosidad2 = tipoNubosidad2;
       this.precipitacion2 = precipitacion2;
       this.tempactualfarenheith3 = tempactualfarenheith3;
       this.tempactualcentigrados3 = tempactualcentigrados3;
       this.humedad3 = humedad3;
       this.tipoNubosidad3 = tipoNubosidad3;
       this.precipitacion3 = precipitacion3;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="ID", unique=true, nullable=false)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    
    @Column(name="CIUDAD", nullable=false, length=30)
    public String getCiudad() {
        return this.ciudad;
    }
    
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    
    @Column(name="TEMPACTUALFARENHEITH", nullable=false, length=10)
    public String getTempactualfarenheith() {
        return this.tempactualfarenheith;
    }
    
    public void setTempactualfarenheith(String tempactualfarenheith) {
        this.tempactualfarenheith = tempactualfarenheith;
    }

    
    @Column(name="TEMPACTUALCENTIGRADOS", nullable=false, length=10)
    public String getTempactualcentigrados() {
        return this.tempactualcentigrados;
    }
    
    public void setTempactualcentigrados(String tempactualcentigrados) {
        this.tempactualcentigrados = tempactualcentigrados;
    }

    
    @Column(name="HUMEDAD", nullable=false, length=10)
    public String getHumedad() {
        return this.humedad;
    }
    
    public void setHumedad(String humedad) {
        this.humedad = humedad;
    }

    
    @Column(name="TIPO_NUBOSIDAD", nullable=false, length=20)
    public String getTipoNubosidad() {
        return this.tipoNubosidad;
    }
    
    public void setTipoNubosidad(String tipoNubosidad) {
        this.tipoNubosidad = tipoNubosidad;
    }

    
    @Column(name="PRECIPITACION", nullable=false, length=10)
    public String getPrecipitacion() {
        return this.precipitacion;
    }
    
    public void setPrecipitacion(String precipitacion) {
        this.precipitacion = precipitacion;
    }

    
    @Column(name="TEMPACTUALFARENHEITH2", nullable=false, length=10)
    public String getTempactualfarenheith2() {
        return this.tempactualfarenheith2;
    }
    
    public void setTempactualfarenheith2(String tempactualfarenheith2) {
        this.tempactualfarenheith2 = tempactualfarenheith2;
    }

    
    @Column(name="TEMPACTUALCENTIGRADOS2", nullable=false, length=10)
    public String getTempactualcentigrados2() {
        return this.tempactualcentigrados2;
    }
    
    public void setTempactualcentigrados2(String tempactualcentigrados2) {
        this.tempactualcentigrados2 = tempactualcentigrados2;
    }

    
    @Column(name="HUMEDAD2", nullable=false, length=10)
    public String getHumedad2() {
        return this.humedad2;
    }
    
    public void setHumedad2(String humedad2) {
        this.humedad2 = humedad2;
    }

    
    @Column(name="TIPO_NUBOSIDAD2", nullable=false, length=20)
    public String getTipoNubosidad2() {
        return this.tipoNubosidad2;
    }
    
    public void setTipoNubosidad2(String tipoNubosidad2) {
        this.tipoNubosidad2 = tipoNubosidad2;
    }

    
    @Column(name="PRECIPITACION2", nullable=false, length=10)
    public String getPrecipitacion2() {
        return this.precipitacion2;
    }
    
    public void setPrecipitacion2(String precipitacion2) {
        this.precipitacion2 = precipitacion2;
    }

    
    @Column(name="TEMPACTUALFARENHEITH3", nullable=false, length=10)
    public String getTempactualfarenheith3() {
        return this.tempactualfarenheith3;
    }
    
    public void setTempactualfarenheith3(String tempactualfarenheith3) {
        this.tempactualfarenheith3 = tempactualfarenheith3;
    }

    
    @Column(name="TEMPACTUALCENTIGRADOS3", nullable=false, length=10)
    public String getTempactualcentigrados3() {
        return this.tempactualcentigrados3;
    }
    
    public void setTempactualcentigrados3(String tempactualcentigrados3) {
        this.tempactualcentigrados3 = tempactualcentigrados3;
    }

    
    @Column(name="HUMEDAD3", nullable=false, length=10)
    public String getHumedad3() {
        return this.humedad3;
    }
    
    public void setHumedad3(String humedad3) {
        this.humedad3 = humedad3;
    }

    
    @Column(name="TIPO_NUBOSIDAD3", nullable=false, length=20)
    public String getTipoNubosidad3() {
        return this.tipoNubosidad3;
    }
    
    public void setTipoNubosidad3(String tipoNubosidad3) {
        this.tipoNubosidad3 = tipoNubosidad3;
    }

    
    @Column(name="PRECIPITACION3", nullable=false, length=10)
    public String getPrecipitacion3() {
        return this.precipitacion3;
    }
    
    public void setPrecipitacion3(String precipitacion3) {
        this.precipitacion3 = precipitacion3;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="FECHA_INGRESO", nullable=false, length=19)
    public Date getFechaIngreso() {
        return this.fechaIngreso;
    }
    
    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }




}


