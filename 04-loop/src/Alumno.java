public class Alumno {
    private Integer edad;

    public Alumno(Integer edad) {
        this.edad = edad;
    }

    public Alumno() {
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "edad=" + edad +
                '}';
    }
}
