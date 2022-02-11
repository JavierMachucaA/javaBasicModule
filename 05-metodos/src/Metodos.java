import java.util.ArrayList;

public class Metodos {
    /**
     * PROLOGO de convenciones:
     * - En ninguna nomenclatura para nombramiento de variables o clases <b>no</b> utilizar caracteres extendidos o simbolos, ejemplo:
     * ñ,ÿ,ú,>,<,%,",€⌊«⁌⁍⁑⁜♪
     * - Las Clases siempre comienzan con Mayusculas y camelCase (esteEsUnEjemploNombreDeClase) <br>
     * - Métodos deben tener formato camelCase (esteEsUnEjemploNombreDeVariable)<br>
     * - Los métodos siempre pertenecen a una clase (no existe otra forma)<br>
     * - Los métodos buscan granular o especificar una funcionalidad o Accion :<br>
     * colocarXaLosYvaloresnumericos ❌
     * reemplazarValoresStringsPorNumericos ✔️
     * - El nombre del método debe ser suficiente para saber que hace(1) <br>
     * - Los métodos extensos siempre son complejos si tienen muchas lineas, ojalá evitar.
     * Pero solo debe ser reducido si se sabe lo que se está haciendo <br>
     * - Los métodos buscan siempre evitar codigo duplicado (2)<br>
     * - Los metodos deben tener sus parámetros definidos con sus nombres de manera descriptiva
     * para su ´uso dentro del método´ <br>
     * - Si el método tiene más de 3 parámetros, se debe generar una clase (3) <br>
     * - Si se pasa una clase se recomienda que sea una clase "ligera" <br>
     * - Los retornos deben ser pensados para un tipo de flujo (4): <br>
     *     a ) Si la el método es para sumar valores, solo se ocupe en flujos que necesite sumar <br>
     *     b ) No involucrar el método en concatenaciones de strings <br>
     *     c ) No modificar el método de origen para un flujo en específico,
     *     no modificar el método a un promedio por ejemplo. ya que modificaría todos los flujos
     *     que llaman a la funcion <br>
     * - La convension para evaluacion de booleans siempre compienzan con es, ejemplos:<br>
     *      * ) esValido<br>
     *      * ) esAprobado<br>
     *      * ) estaCompletaInformacion<br>
     *  si se quiere obtener lo contrario solo se antempone un !<br>
     *      * ) !esValido<br>
     *      * ) !esAprobado<br>
     *      * ) !estaCompletaInformacion<br>
     *  - Los métodos privados solo serían consultados dentro de la clase <br>
     *  - Los métodos publicos podran ser consultados por otras clases <br>
     *  - Los metodos protejidos podrán ser llamados desde la misma clase y sus hijas (herencia)<br>
     *  - Los métodos recursivos ser super controlados.<br>
     *  - Los métodos sin retorno deben ser casos aislados:<br>
     *  public void registrarLogInicioProceso(Proceso proceso)<br>
     *  public void mostrarColorDeMarca(Marca marca)<br>
     *  - Métodos preferentemente comentados en especial si tienen contenido de más de 30 lineas<br>
     *  - El método debe ser desacoplable y poder ser insertado en otro codigo sin modificaciones<br>
     *  - Tener conciencia que un método debe considerar sus casos de borde<br>
     *  - No manejar código comentado. Y si llegase a ser dejar como primer comentario TODO
     *  - Verificar que no exista metodo antes de crear uno.
     *  - Siempre dejar metodos utilitarios en una clase de utilidad, ejemplo:
     *  StringUtil.todoAMinuscula(String texto)
     *  StringUtil.dividirStringPorCaracter(String textoADividir)
     *  - Buscar orden de código, java te permite tener diferentes indetentaciones pero tratar de manejar todo al
     *  mismo nivel de una funcion y las condiciones interiores con otra indentacion
     *  void fun() {
     *      .....
     *      if () {
     *          ...
     *      }
     *  }
     *  Nota: en caso de no encontrar ordenado un código utilizar ctrl+ shift + L en intellij
     * @param args
     */
    public static void main(String[] args) {
        // archivo de procesamiento actual
        Interfaz interfaz = new Interfaz();
        interfaz.setColumnas(4);
        interfaz.setValores(new ArrayList<>(){{
            add(1);
            add(2);
            add(3);
            add(4);
        }});
        // necesito saber si la columna 1 y 2 sean pares

        // necesito saber si la ultima columna sea divisible por 3

        // necesito saber que la firma sea igual a la suma de las columnas

        //iterativa

        //recursiva



    }
}