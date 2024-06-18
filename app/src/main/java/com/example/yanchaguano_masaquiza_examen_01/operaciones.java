package com.example.yanchaguano_masaquiza_examen_01;

public class operaciones {
    short dato1;
    short dato2;

    public String sumar(String datoA,String datoB){

        char[] numA=datoA.toCharArray();//3
        char[] numB=datoB.toCharArray();
        //dos vecores
        int[] residuo=new int[numA.length+1];//4
        String[] resultado=new String[numA.length];
//50    50<=0

        // for (int i = 0;i<=numA.length;i++)

        for (int i = numA.length -1 ;i>=0;i--){
            int res=0;
            residuo[0]= 0;
            int n1= Integer.parseInt(String.valueOf(numA[i]));//9
            int n2=Integer.parseInt(String.valueOf(numB[i]));//5
            int n3=residuo[i+1];//4
            int suma= n1+n2+n3;//13
            if(i!=0){
            if(suma>=10){
            res=suma-10;//13-10=3
            resultado[i]=String.valueOf(suma-10);//guarda el resultado
            residuo[i]=1;//3
            }else {
            resultado[i]=String.valueOf(suma);}}
            else
            {resultado[i]=String.valueOf(suma);}
        }

        StringBuilder sab= new StringBuilder();
        //

        for(String data:resultado){
            sab.append(data);
        }
        String cadenaenter=sab.toString();
        return cadenaenter;
    }


}
