
/**
 * Organizando notas

 * Crea una clase que te permita almacenar la nota de los estudiantes
 * de un aula.
 * La cantidad de estudiantes que tiene el aula debe ser ingresada
 * por parámetro mediante el constructor.
 * La clase debe permitirte:
 * • Anadir notas.
 * • Sacar el promedio de todas las notas.
 * • Sacar el promedio de las notas aprobadas (>51).
 * • Indicar la cantidad de reprobados.
 * • Indicar la cantidad de aprobados.
 * • Indicar la nota mas alta.
 * 
 * Marcelo Cardozo Cadima 
 * 23/05/2021
 */
public class Estudiantes
{
    private Notas[] Lista;
    private int[] Prom;
    private int indice=0;
    //Constructor
    public Estudiantes(int Cant){
        Lista=new Notas[Cant];
    }
    //Agregaremos los arreglos de tipo nota
    public void Agregar(Notas Otra){
        Lista[indice]=Otra;
        indice++;
    }
    //Funcion para sacar el promedio y ponerlo en un arreglo
    private void promedio(){
        Prom=new int[Lista.length];
        for(int i=0; i<Lista.length; i++){
            Prom[i]=Lista[i].Promedio();
        }
    }
    //metodo para mostrar el promedio
    public int[] Promedio(){
        promedio();
        return Prom;
    }
    //metodo para mostrar el promedio de los aprobados
    public int PromedioAprobados(){
        promedio();
        int Cont=0;
        int Res=0;
        for(int i=0; i<Lista.length; i++){
            if(Prom[i]>51){
                Res=Res+Prom[i];
                Cont++;
            }
        }
        Res=Res/Cont;
        return Res;
    }
    //metodo para mostrar el numero de aprobados
    public int NumeroAprobados(){
        promedio();
        int Apro=0;
        for(int i=0; i<Lista.length; i++){
            if(Prom[i]>51){
                Apro++;
            }
        }
        return Apro;
    }
    //metodo para mostrar el numero de reprobados
    public int NumeroReprobados(){
        promedio();
        int Repro=0;
        for(int i=0; i<Lista.length; i++){
            if(Prom[i]<51){
                Repro++;
            }
        }
        return Repro;
    }
}
