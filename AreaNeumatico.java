/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areaneumatico;
import java.util.Scanner;
import java.util.*;

/**
 *
 * @author carlo
 */
public class AreaNeumatico {

    public static String Determinar_tipo_neumatico(int medidas_neumatico,int composicion_neumatico, String caracteristica_neumatico) {
        String determinar = "El ancho del neumatico es de "+medidas_neumatico+ "con una relacion "+composicion_neumatico+""
                + " que lo hace optimo para  "+caracteristica_neumatico;
return determinar;

    }

    public static String distribuir_sensores_flexion(String ubicacion_sensores) {
        ubicacion_sensores = "carroceria";
        String sensores = "La ubicacion de los sensores esta en " +ubicacion_sensores+ " del automovil ";

        return sensores;


    }
    public static String Fijar_acelerometro(int capacidad_acelerometro){
        int rpm_max = 6500;
        capacidad_acelerometro = 6500;
        String Capacidad_Acelerometro = "los rangos del acelerometro estan " +capacidad_acelerometro;

        return Capacidad_Acelerometro;

    }
    public static String Identificar_unidad_masa_inercial(String tipo_unidad_masa_inercial, String marca_unidad_masa_inercial, int medicion_unidad_masa_inercial){
        int angulo_balanceo_lateral_chasis = 20;
        medicion_unidad_masa_inercial = angulo_balanceo_lateral_chasis;
        String Unidad_Masa_Inercial = "El modelo de la unidad de masa inercial es "+tipo_unidad_masa_inercial
                +"y es de la marca "+marca_unidad_masa_inercial+"dando un registro de"+
                medicion_unidad_masa_inercial;

        return Unidad_Masa_Inercial;

    }
    public static String Calibrar_microcontroladores(String tipo_microcontroladores, String caracteristicas_microcontroladores){
        tipo_microcontroladores = "Tiva";
        caracteristicas_microcontroladores = "lector_administrador";
        String Microcontroladores = "El microcontrolador utilizado es "+tipo_microcontroladores
                +"y su principal funcion es la de "+caracteristicas_microcontroladores;
        return Microcontroladores;
    }
    public static String Entrenar_redes_neuronales(String tipo_red_neuronal, String ubicacion_red_neuronal){
        tipo_red_neuronal = "recurrente";
        ubicacion_red_neuronal = "sensores_virtuales";
        String Red_Neuronal = "La red neuronal utilizada es del tipo "+tipo_red_neuronal
                +"y generalmente se los encuentra en "+ubicacion_red_neuronal;

        return Red_Neuronal;
    }
public static void verificar(int medidas_neumatico,int composicion_neumatico, String caracteristica_neumatico, String ubicacion_sensores,int capacidad_acelerometro,String tipo_unidad_masa_inercial, String marca_unidad_masa_inercial, int medicion_unidad_masa_inercial, String tipo_microcontroladores, String caracteristicas_microcontroladores, String tipo_red_neuronal, String ubicacion_red_neuronal){
    int rpm_max = 6500;
}   int angulo_balanceo_lateral_chasis = 20;

     if ("angulo_balanceo_lateral_chasis" >= "rpm_max"){
    System.out.println(determinar_tipo_neumatico(medidas_neumatico, ));


}



    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int Medidas_neumatico;
        int composicion_neumatico;
        int caracteristicas_neumatico;
        String ubicacion_sensores;
        int capacidad_acelerometro;
        String tipo_unidad_masa_inercial;
        String marca_unidad_masa_inercial;
        int medida_unidad_masa_inercial;
        String tipo_microcontroladores;
        String caracteristicas_microcontroladores;
        String tipo_red_neuronal;
        String ubicacion_red_neuronal;
    }

}
