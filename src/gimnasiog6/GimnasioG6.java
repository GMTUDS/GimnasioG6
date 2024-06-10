
package gimnasiog6;

import accesoADatos.AsistenciaData;
import accesoADatos.ClaseData;
import accesoADatos.EntrenadorData;
import accesoADatos.MembresiaData;
import accesoADatos.SocioData;
import entidades.Asistencia;
import entidades.Clase;
import entidades.Entrenador;
import entidades.Membresia;
import entidades.Socio;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nn
 */
public class GimnasioG6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //DATA
        AsistenciaData asisData = new AsistenciaData();
        ClaseData claData = new ClaseData();
        SocioData soData = new SocioData();
        MembresiaData memData = new MembresiaData();
        EntrenadorData entreData = new EntrenadorData();
        
//        List<Membresia> memlist= memData.buscarMembresiasActivas();
//        for (Membresia arg : memlist) {
//            System.out.println(arg.toString());
//        }
//        List<Membresia> memlist= memData.buscarMembresiasActivas();
//        for (Membresia arg : memlist) {
//            System.out.println(arg.toString());
//        }
//        memData.modificarMembresiasVencidas();
        
        
        
        
        
        
        
        
        
        
        
//        ENTIDADES
        Entrenador entrenador = new Entrenador();
        entrenador.setDni("8944229");
        entrenador.setNombre("Anabela");
        entrenador.setApellido("Gomez");
        entrenador.setEspecialidad("Piernas");
        entrenador.setEstado(true);
        entrenador.setIdEntrenador(3);
        
        
        
//        Clase clase = new Clase();
//        clase.setNombre("Gluteos up");
//        clase.setEntrenador(entrenador);
//        clase.setHorario(LocalTime.of(16, 30));
//        clase.setEstado(true);
//        clase.setIdClase(4);
//        clase.setCapacidad(20);
        
//        System.out.println(claData.buscarClasePorNombre("Gluteos up"));
//        entrenador.setIdEntrenador(entreData.buscarEntrenadorPorNombre("Gerardo").getIdEntrenador());
//        claData.agregarClase(clase, entrenador);
//        
//        Socio socio = new Socio();
//        socio.setDni("9108892");
//        socio.setNombre("Rebeca");
//        socio.setApellido("Sosa");
//        socio.setCorreo("rebs@mail.com");
//        socio.setTelefono("2947839");
//        socio.setEdad(25);
//        socio.setEstado(true);
//        socio.setIdSocio(2);
//        soData.eliminarSocio(2);
//        soData.agregarSocio(socio);
//        
//        Membresia membresia = new Membresia();
//        membresia.setSocio(socio);
//        membresia.setCantidadPases(9);
//        membresia.setCosto(200);
//        membresia.setFechaInicio(LocalDate.of(2024, 5, 8));
//        membresia.setFechaFin(membresia.getFechaInicio().plusDays(30));
//        membresia.setEstado(true);//habia faltado este set, seguramente por eso estaba en 0 en la tabla
//        membresia.setIdMembresia(3);
//        memData.bu
//        System.out.println(entreData.buscarEntrenadorPorNombre("Gerardo"));
//        memData.renovarMembresia(membresia);
        Clase clase = claData.buscarClasePorNombre("Gluteos up");
        Socio socio = soData.buscarSocioPorNombre("Eliseo");
        Asistencia asistencia = new Asistencia();
        asistencia.setClase(clase);
        asistencia.setSocio(socio);
        asistencia.setFechaAsistencia(LocalDate.now());
//        asistencia.setIdAsistencia(32);
        asisData.agregarAsistencia(asistencia);
        
//        asisData.agregarAsistencia(asistencia);
//        asisData.modificarAsistencia(asistencia);
//        for (Asistencia asistencia1 : asisData.listarAsistenciasDelSocio(3)) {
//            System.out.println(asistencia1);
//        }
        



        
        
        
        
    }
    
}
