
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
        
//        ENTIDADES
        Entrenador entrenador = new Entrenador();
        entrenador.setDni("235709");
        entrenador.setNombre("Gerardo");
        entrenador.setApellido("Moya");
        entrenador.setEspecialidad("Gluteos");
        entrenador.setEstado(true);
        entrenador.setIdEntrenador(2);
        
//        entreData.guardarEntrenador(entrenador);
        
        Clase clase = new Clase();
        clase.setNombre("Gluteos up");
        clase.setEntrenador(entrenador);
        clase.setHorario(LocalTime.of(16, 30));
        clase.setEstado(true);
        clase.setIdClase(4);
//        entrenador.setIdEntrenador(entreData.buscarEntrenadorPorNombre("Gerardo").getIdEntrenador());
//        claData.agregarClase(clase, entrenador);
//        
        Socio socio = new Socio();
        socio.setDni("9108892");
        socio.setNombre("Rebeca");
        socio.setApellido("Sosa");
        socio.setCorreo("rebs@mail.com");
        socio.setTelefono("2947839");
        socio.setEdad(28);
        socio.setEstado(true);
        socio.setIdSocio(2);
//        soData.agregarSocio(socio);
//        
        Membresia membresia = new Membresia();
        membresia.setSocio(socio);
        membresia.setCantidadPases(20);
        membresia.setCosto(400);
        membresia.setFechaInicio(LocalDate.of(2024, 6, 1));
        membresia.setEstado(true);//habia faltado este set, seguramente por eso estaba en 0 en la tabla
//        memData.agregarMembresia(membresia);
//        System.out.println(entreData.buscarEntrenadorPorNombre("Gerardo"));
        
        Asistencia asistencia = new Asistencia();
        asistencia.setClase(clase);
        asistencia.setSocio(socio);
        asistencia.setFechaAsistencia(LocalDate.now());
        asisData.agregarAsistencia(asistencia);
        
    }
    
}
