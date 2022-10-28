import org.junit.jupiter.api.Test;

import java.util.ArrayList;

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

    @Test
    void deveCriarEmpresaClone() throws CloneNotSupportedException {
        Vaga vaga = new Vaga("Backend NodeJS", 8000, "Pleno", true, "Pessoa Fisica");

        ArrayList<Vaga> vagas = new ArrayList<Vaga>();
        vagas.add(vaga);

        Empresa empresaTeste = new Empresa("empresaUm", vagas);

        Empresa empresaTesteClone = empresaTeste.clone();
        empresaTesteClone.setNome("empresaDois");

        assertEquals("Empresa{nome=empresaUm, vagas='Backend NodeJS'}", empresaTeste.toString());
        assertEquals("Empresa{nome=empresaDois, vagas='Backend NodeJS'}", empresaTesteClone.toString());
    }

}