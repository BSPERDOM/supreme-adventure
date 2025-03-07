package programanotas;

public class ProgramaNotas {
    public static void main(String[] args) {
        String[] nombres = {"Daniel", "Monica", "Pedro", "Ana", "Luis"};
        int[] notas = {65, 89, 45, 78, 92};
        
        for (int i = 0; i &lt; nombres.length; i++) {
            String estado = (notas[i] &gt;= 60) ? "Aprobado" : "Reprobado";
            System.out.println(nombres[i] + "\t" + notas[i] + "\t" + estado);
        }
    }
}