package test.java.com.equipo.healthtrack;

import org.junit.jupiter.api.Test;

import com.equipo.healthtrack.Usuario;

import static org.junit.jupiter.api.Assertions.*;

public class UsuarioTest {

    @Test
    public void testConstructorYGetters() {
        Usuario usuario = new Usuario("Fabián", 80.5);
        assertEquals("Fabián", usuario.getNombre());
        assertEquals(80.5, usuario.getPeso());
    }

    @Test
    public void testActualizarPesoCorrectamente() {
        Usuario usuario = new Usuario("Marcela", 60.0);
        usuario.actualizarPeso(62.0);  // fallará si no corriges el método
        assertEquals(62.0, usuario.getPeso());
    }

    @Test
    public void testMostrarInformacion() {
        Usuario usuario = new Usuario("Vicente", 70.0);
        usuario.mostrarInformacion();  // Solo validará salida visual (no automatizable sin redirección)
    }

        @Test
    public void testActualizarPesoNoDebeDisminuir() {
        Usuario u = new Usuario("Prueba", 70.0);
        u.actualizarPeso(71.0);
        assertNotEquals(69.0, u.getPeso(), "El peso fue disminuido incorrectamente.");
    }

    @Test
    public void testMultipleUsuarios() {
        Usuario u1 = new Usuario("Ana", 55.0);
        Usuario u2 = new Usuario("Luis", 75.5);
        u1.actualizarPeso(56.0);
        u2.actualizarPeso(76.5);
        assertEquals(56.0, u1.getPeso());
        assertEquals(76.5, u2.getPeso());
    }

    @Test
    public void testRendimientoCreacionUsuarios() {
        long inicio = System.currentTimeMillis();

        for (int i = 0; i < 1_000_000; i++) {
            new Usuario("Usuario" + i, 70.0);
        }

        long fin = System.currentTimeMillis();
        assertTrue(fin - inicio < 1000, "Demasiado lento creando usuarios.");
    }

}
