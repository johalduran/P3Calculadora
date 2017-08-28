package com.johnduran.p3calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    private Button bNueve,bOcho,bSiete,bSeis,bCinco,bCuatro,bTres,bDos,bUno,bCero,bMas,bPor,bMenos,bDivision,bPunto,bIgual;
    private TextView tResultado;
    private String numero1="", numero2="", masON="no", menosON="no", porON="no", divisionON="no", igualON="no",cadena="";
    private double resultado=0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bNueve = (Button) findViewById(R.id.bNueve);
        bOcho = (Button) findViewById(R.id.bOcho);
        bSiete = (Button) findViewById(R.id.bSiete);
        bSeis = (Button) findViewById(R.id.bSeis);
        bCinco = (Button) findViewById(R.id.bCinco);
        bCuatro = (Button) findViewById(R.id.bCuatro);
        bTres = (Button) findViewById(R.id.bTres);
        bDos = (Button) findViewById(R.id.bDos);
        bUno = (Button) findViewById(R.id.bUno);
        bCero = (Button) findViewById(R.id.bCero);
        bMas = (Button) findViewById(R.id.bMas);
        bMenos = (Button) findViewById(R.id.bMenos);
        bPor = (Button) findViewById(R.id.bPor);
        bDivision = (Button) findViewById(R.id.bDivision);
        bPunto = (Button) findViewById(R.id.bPunto);
        bIgual = (Button) findViewById(R.id.bIgual);

        tResultado = (TextView) findViewById(R.id.tResultado);
    }
    public void fUno(View view){

        if(masON=="si"|| menosON=="si" || porON=="si" || divisionON=="si"){
            numero2=numero2+"1";
            cadena=cadena+"1";
        }else{
            cadena=cadena+"1";
            numero1=numero1+"1";
        }
        tResultado.setText(cadena);
    }
    public void fDos(View view){

        if(masON=="si"|| menosON=="si" || porON=="si" || divisionON=="si"){
            numero2=numero2+"2";
            cadena=cadena+"2";

        }else{
            numero1=numero1+"2";
            cadena=cadena+"2";

        }
        tResultado.setText(cadena);
    }
    public void fTres(View view){

        if(masON=="si"|| menosON=="si" || porON=="si" || divisionON=="si"){
            numero2=numero2+"3";
            cadena=cadena+"3";
        }else{
            cadena=cadena+"3";
            numero1=numero1+"3";
        }
        tResultado.setText(cadena);
    }
    public void fCuatro(View view){

        if(masON=="si"|| menosON=="si" || porON=="si" || divisionON=="si"){
            numero2=numero2+"4";
            cadena=cadena+"4";
        }else{
            cadena=cadena+"4";
            numero1=numero1+"4";
        }
        tResultado.setText(cadena);
    }
    public void fCinco(View view){

        if(masON=="si"|| menosON=="si" || porON=="si" || divisionON=="si"){
            numero2=numero2+"5";
            cadena=cadena+"5";
        }else{
            cadena=cadena+"5";
            numero1=numero1+"5";
        }
        tResultado.setText(cadena);
    }
    public void fSeis(View view){

        if(masON=="si"|| menosON=="si" || porON=="si" || divisionON=="si"){
            numero2=numero2+"6";
            cadena=cadena+"6";
        }else{
            cadena=cadena+"6";
            numero1=numero1+"6";
        }
        tResultado.setText(cadena);
    }
    public void fSiete(View view){

        if(masON=="si"|| menosON=="si" || porON=="si" || divisionON=="si"){
            numero2=numero2+"7";
            cadena=cadena+"7";
        }else{
            cadena=cadena+"7";
            numero1=numero1+"7";
        }
        tResultado.setText(cadena);
    }
    public void fOcho(View view){

        if(masON=="si"|| menosON=="si" || porON=="si" || divisionON=="si"){
            numero2=numero2+"8";
            cadena=cadena+"8";
        }else{
            cadena=cadena+"8";
            numero1=numero1+"8";
        }
        tResultado.setText(cadena);
    }
    public void fNueve(View view){

        if(masON=="si"|| menosON=="si" || porON=="si" || divisionON=="si"){
            numero2=numero2+"9";
            cadena=cadena+"9";
        }else{
            cadena=cadena+"9";
            numero1=numero1+"9";
        }
        tResultado.setText(cadena);
    }
    public void fCero(View view){

        if(masON=="si"|| menosON=="si" || porON=="si" || divisionON=="si"){
            numero2=numero2+"0";
            cadena=cadena+"0";
        }else{
            cadena=cadena+"0";
            numero1=numero1+"0";
        }
        tResultado.setText(cadena);
    }
    public void fPunto(View view){
        if(masON=="si"|| menosON=="si" || porON=="si" || divisionON=="si"){
            numero2=numero2+".";
            cadena=cadena+".";
        }else{
            cadena=cadena+".";
            numero1=numero1+".";
        }
        tResultado.setText(cadena);
    }
    public void fResultado(View view){
        if(masON=="si"){
            resultado=Double.valueOf(numero1)+Double.valueOf(numero2);
            String res=String.format("%.2f", resultado);
            resultado= Double.valueOf(res);
            tResultado.setText(""+res);
            reset();
        }
        if(menosON=="si"){
            resultado=Double.valueOf(numero1)-Double.valueOf(numero2);
            String res=String.format("%.2f", resultado);
            resultado= Double.valueOf(res);
            tResultado.setText(""+res);
            reset();
        }
        if(porON=="si"){
            resultado=Double.valueOf(numero1)*Double.valueOf(numero2);
            String res=String.format("%.2f", resultado);
            resultado= Double.valueOf(res);
            tResultado.setText(""+res);
            reset();
        }
        if(divisionON=="si"){
            resultado=Double.valueOf(numero1)/Double.valueOf(numero2);
            String res=String.format("%.2f", resultado);
            resultado= Double.valueOf(res);
            tResultado.setText(""+res);
            reset();
        }
    }

    public void fMas(View view){
        if(masON=="si"|| menosON=="si" || porON=="si" || divisionON=="si" || igualON=="si"){
            resultado=Double.valueOf(numero1)+Double.valueOf(numero2);
            String res=String.format("%.2f", resultado);
            resultado= Double.valueOf(res);
            tResultado.setText(""+res);
            reset();
        }else{
            masON="si";
            cadena=cadena+"+";
            tResultado.setText(cadena);
        }

    }
    public void fMenos(View view){
        if(masON=="si"|| menosON=="si" || porON=="si" || divisionON=="si" || igualON=="si"){
            resultado=Double.valueOf(numero1)-Double.valueOf(numero2);
            String res=String.format("%.2f", resultado);
            resultado= Double.valueOf(res);
            tResultado.setText(""+res);
            reset();
        }else{

            menosON="si";
            cadena=cadena+"-";
            tResultado.setText(cadena);
        }

    }
    public void fPor(View view){
        if(masON=="si"|| menosON=="si" || porON=="si" || divisionON=="si" || igualON=="si"){
            resultado=Double.valueOf(numero1)*Double.valueOf(numero2);
            String res=String.format("%.2f", resultado);
            resultado= Double.valueOf(res);
            tResultado.setText(""+res);
            reset();
        }else{
            porON="si";
            cadena=cadena+"*";
            tResultado.setText(cadena);
        }

    }
    public void fDivision(View view){
        if(masON=="si"|| menosON=="si" || porON=="si" || divisionON=="si" || igualON=="si"){
            resultado=Double.valueOf(numero1)/Double.valueOf(numero2);
            String res=String.format("%.2f", resultado);
            resultado= Double.valueOf(res);
            tResultado.setText(""+res);
            reset();
        }else{
            divisionON="si";
            cadena=cadena+"/";
            tResultado.setText(cadena);
        }

    }
    public void reset(){
        masON="no";
        menosON="no";
        porON="no";
        divisionON="no";
        numero2="";
        numero1=String.valueOf(resultado);
        resultado=0;
        cadena=numero1;
    }
    public void fCE(View view){
        numero1=""; numero2=""; masON="no"; menosON="no"; porON="no"; divisionON="no"; igualON="no";cadena="";
        tResultado.setText("0");

    }
}

