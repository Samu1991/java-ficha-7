/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Enum;
/**
 *
 * @author samum
 */
public enum MontainBikeSuspesion {
    Simples, Dupla, Sem;

    public static String MontainBikeSuspesionToString(MontainBikeSuspesion suspension){
    switch(suspension){
        case Simples:
                return "Suspensão Simples";
            case Dupla:
                return "Suspensão Dupla";
            case Sem:
                return "Sem Suspensão";
            default:
                return "Invalida";
        
    
    }
}
}
