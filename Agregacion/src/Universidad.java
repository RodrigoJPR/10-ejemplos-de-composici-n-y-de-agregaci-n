public class Universidad {
    public static void main(String[] args) {
        String nombreUni = "Universidad ABC";
        
        Profesor profesor = new Profesor();
        Estudiante estudiante = new Estudiante();
        Administrativo administrativo = new Administrativo();
        Bibliotecario bibliotecario = new Bibliotecario();
        Investigador investigador = new Investigador();
        TecnicoLaboratorio tecnico = new TecnicoLaboratorio();
        Coordinador coordinador = new Coordinador();
        Conserje conserje = new Conserje();
        Director director = new Director();
        Psicologo psicologo = new Psicologo();
        
        System.out.println(nombreUni);
        
        profesor.trabajar();
        estudiante.estudiar();
        administrativo.trabajar();
        bibliotecario.trabajar();
        investigador.investigar();
        tecnico.trabajar();
        coordinador.coordinar();
        conserje.trabajar();
        director.dirigir();
        psicologo.asesorar();
    }
}

