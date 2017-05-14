/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udea.weather_service.servicio;

import com.udea.weather_service.dao.climadao;
import com.udea.weather_service.persistencia.Clima;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 *
 * @author Sergio
 */
@WebService(serviceName = "ClimaWS")
@XmlSeeAlso({Clima.class})
public class ClimaWS {

    /**
     * Web service operation
     * @return 
     */
    @WebMethod(operationName = "verClimas")
    public List<Clima> verClimas() {
        climadao cl=new climadao();
        List<Clima> climas=cl.verClimasConsultados();
        //TODO write your implementation code here:
        return climas;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "GuardarClima")
    public String GuardarClima(@WebParam(name = "ciudad") String ciudad, @WebParam(name = "tempactualfarenheith") String tempactualfarenheith, @WebParam(name = "tempactualcentigrados") String tempactualcentigrados, @WebParam(name = "humedad") String humedad, @WebParam(name = "tipo_nubosidad") String tipo_nubosidad, @WebParam(name = "precipitacion") String precipitacion, @WebParam(name = "tempactualfarenheith2") String tempactualfarenheith2, @WebParam(name = "tempactualcentigrados2") String tempactualcentigrados2, @WebParam(name = "humedad2") String humedad2, @WebParam(name = "tipo_nubosidad2") String tipo_nubosidad2, @WebParam(name = "precipitacion2") String precipitacion2, @WebParam(name = "tempactualfarenheith3") String tempactualfarenheith3, @WebParam(name = "tempactualcentigrados3") String tempactualcentigrados3, @WebParam(name = "humedad3") String humedad3, @WebParam(name = "tipo_nubosidad3") String tipo_nubosidad3, @WebParam(name = "precipitacion3") String precipitacion3) {
        //TODO write your implementation code here:
        Clima clima=new Clima(ciudad, tempactualfarenheith, tempactualcentigrados, humedad, tipo_nubosidad, precipitacion, tempactualfarenheith2, tempactualcentigrados2, humedad2, tipo_nubosidad2, precipitacion2, tempactualfarenheith3, tempactualcentigrados3, humedad3, tipo_nubosidad3, precipitacion3);
        climadao dao=new climadao();
        dao.IngresarClima(clima);
        return"clima guardado";
    }

}
