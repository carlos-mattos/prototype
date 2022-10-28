import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class EmpresaTest {

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