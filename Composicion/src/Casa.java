public class Casa {
    private Habitacion habitacion;
    private Cocina cocina;
    private Sala sala;
    private Baño baño;
    private Comedor comedor;
    private Dormitorio dormitorio;
    private Patio patio;
    private Garaje garaje;
    private Jardin jardin;
    private Piscina piscina;
    
    public Casa() {
        habitacion = new Habitacion();
        cocina = new Cocina();
        sala = new Sala();
        baño = new Baño();
        comedor = new Comedor();
        dormitorio = new Dormitorio();
        patio = new Patio();
        garaje = new Garaje();
        jardin = new Jardin();
        piscina = new Piscina();
    }
    
    public void vivir() {
        habitacion.dormir();
        cocina.cocinar();
        sala.relajarse();
        baño.limpiar();
        comedor.comer();
        dormitorio.descansar();
        patio.jugar();
        garaje.estacionar();
        jardin.pasear();
        piscina.nadar();
    }
}

// Clases





















