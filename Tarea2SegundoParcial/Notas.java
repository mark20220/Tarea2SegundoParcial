
/**
 * creamos un arreglo de tipo entero llamado Nota
 * 
 * Marcelo Cardozo Cadima
 * 23/05/2021
 */
public class Notas
{
    private int[] Nota;
    private int indice=0;
    //Contructor
    public Notas(int Cant){
        Nota=new int[Cant];
    }
    //Con este metodo llenaremos el arreglo con las notas
    public String Llenar(int Num){
        String Res;
        if(indice<Nota.length){
            Nota[indice]=Num;
            Res="Se agrego nota: "+Nota[indice];
            indice++;
        }else{
            Res="La lista ya esta llena";
        }
        return Res;
    }
    //podemos sacar el promedio de cada arreglo
    public int Promedio(){
        int Res=0;
        for(int i=0; i<Nota.length; i++){
            Res=Res+Nota[i];
        }
        Res=Res/Nota.length;
        return Res;
    }
}
