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

/**
 *
 * @author Sergio
 */
@WebService(serviceName = "ClimaWS")
public class ClimaWS {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "IngresarClima")
    public String IngresarClima(@WebParam(name = "ciudad") String ciudad, @WebParam(name = "tempFarenheit") String tempFarenheit, @WebParam(name = "tempCentigrados") String tempCentigrados, @WebParam(name = "humedad") String humedad, @WebParam(name = "nubosidad") String nubosidad, @WebParam(name = "precipitacion") String precipitacion, @WebParam(name = "tempFarenheit2") String tempFarenheit2, @WebParam(name = "tempCentigrados2") String tempCentigrados2, @WebParam(name = "humedad2") String humedad2, @WebParam(name = "nubosidad2") String nubosidad2, @WebParam(name = "precipitacion2") String precipitacion2, @WebParam(name = "tempFarenheit3") String tempFarenheit3, @WebParam(name = "tempCentigrados3") String tempCentigrados3, @WebParam(name = "humedad3") String humedad3, @WebParam(name = "nubosidad3") String nubosidad3, @WebParam(name = "precipitacion3") String precipitacion3) {
        //TODO write your implementation code here:
        Clima clima=new Clima(ciudad,tempFarenheit,tempCentigrados,humedad,nubosidad,precipitacion,tempFarenheit2,tempCentigrados2,humedad2,nubosidad2,precipitacion2,tempFarenheit3,tempCentigrados3,humedad3,precipitacion3);
        climadao cl=new climadao();
        cl.IngresarClima(clima);
        return "producto ingresado";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "verClimas")
    public List<Clima> verClimas() {
        climadao cl=new climadao();
        List<Clima> climas=cl.verClimasConsultados();
        //TODO write your implementation code here:
        return climas;
    }

}
