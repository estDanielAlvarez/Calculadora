package calculadora;
import java.lang.Math;
public class Calculadora {
    //CALCULADORA POR CONSOLA
    //Nombre de las variables
    private float num1,num2,s,re,m,d,sr,sg,cr,cg,tr,tg,ren,pen,iva;
    private double rad;
    //Constructor para la suma,resta,multiplicación,división,raíz enésima,potencia enésima y el IVA
    public Calculadora(float num1,float num2){
        this.num1=num1;
        this.num2=num2;
    }
    //constructor para el seno,coseno y tangente
    public Calculadora(float rad) {
        this.rad = rad;
    }
    //Función suma
    public void sumar(){
        s=num1+num2;
    }
    //Función resta
    public void restar(){
        re=num1-num2;
    }
    //Función multiplicacion
    public void multi(){
        m=num1*num2;
}
    //Función suma
    public void divi(){
        d=num1/num2;
    }
    //Función seno en radianes
    public void senrad(){
        sr= (float) Math.sin(rad);
    }
    //Función seno en grados
    public void sengrad(){
        float x = (float)(rad*3.1415/180);
        sg = (float) Math.sin(x);
    }
    //Función coseno en radianes
    public void cosrad(){
        cr= (float) Math.cos(rad);
    }
    //Función coseno en grados
    public void cosgrad(){
        float x = (float)(rad*3.1415/180);
        cg = (float) Math.cos(x);
    }
    //Función tangente en radianes
    public void tanrad(){
        tr= (float) Math.tan(rad);
    }
    //Función tangente en grados
    public void tangrad(){
        float x = (float)(rad*3.141/180);
        tg = (float) Math.tan(x);
    }
    //Función raíz enésima
    public void raiz(){
        ren= (float) Math.pow(num1,1/num2);
    }
    //Función poténcia enésima
    public void potencia(){
        pen= (float) Math.pow(num1,num2);
    }
    //Función calcular el porcentaje de IVA
    public void iva(){
        iva=num1*num2/100;
    }
    
    //Funciones para sacar los atributos privados
    public float getS(){
        return s;
    }
    public float getRe() {
        return re;
    }
    public float getM() {
        return m;
    }
    public float getD() {
        return d;
    }
    public float getSr() {
        return sr;
    }
    public float getSg() {
        return sg;
    }
    public float getCr() {
        return cr;
    }
    public float getCg() {
        return cg;
    }
    public float getTr() {
        return tr;
    }
    public float getTg() {
        return tg;
    }
    public float getRen() {
        return ren;
    }
    public float getPen() {
        return pen;
    }
    public float getIva() {
        return iva;
    }
    
    //Constructor para interfaz de usuario

}