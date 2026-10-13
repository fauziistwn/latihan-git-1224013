import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ValidasiPendaftaranTest {
    // Asumsi class utama bernama Pendaftaran
    Pendaftaran form = new Pendaftaran();

    @Test
    public void testNamaKosong() {
        assertEquals("Nama harus diisi", form.validasiPendaftaran("", 20, "a@b.com", true));
    }

    @Test
    public void testUmurKurang() {
        // Ganti dengan nama Anda
        assertEquals("Umur minimal 17 tahun", form.validasiPendaftaran("Fauzi", 15, "a@b.com", true));
    }

    @Test
    public void testEmailTidakValid() {
        // Ganti dengan nama Anda
        assertEquals("Email tidak valid", form.validasiPendaftaran("Fauzi", 20, "ab.com", true));
    }

    @Test
    public void testTidakSetujuSyarat() {
        // Ganti dengan nama Anda
        assertEquals("Harus menyetujui syarat dan ketentuan", form.validasiPendaftaran("Fauzi", 20, "a@b.com", false));
    }

    @Test
    public void testPendaftaranBerhasil() {
        // Ganti dengan nama Anda
        assertEquals("Pendaftaran berhasil", form.validasiPendaftaran("Fauzi", 20, "a@b.com", true));
    }
}