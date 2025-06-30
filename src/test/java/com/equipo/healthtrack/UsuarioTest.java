import org.junit.jupiter.api.Test;
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
}
