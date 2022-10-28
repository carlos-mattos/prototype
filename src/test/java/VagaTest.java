import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VagaTest {

    @Test
    void deveCriarVagaClone() throws CloneNotSupportedException {
        Vaga vagaTeste = new Vaga("Backend Java", 4000, "Junior 1 ano", true, "Pessoa Fisica");

        Vaga vagaTesteClone = vagaTeste.clone();
        vagaTesteClone.setEhOnline(false);
        vagaTesteClone.setRemuneracao(4200);

        assertEquals("Vaga{titulo=Backend Java, experiencia='Junior 1 ano', remuneracao=4000.0, modelo='Remoto', contrato='Pessoa Fisica'}",
                vagaTeste.toString());
        assertEquals("Vaga{titulo=Backend Java, experiencia='Junior 1 ano', remuneracao=4200.0, modelo='Presencial', contrato='Pessoa Fisica'}",
                vagaTesteClone.toString());
    }

}