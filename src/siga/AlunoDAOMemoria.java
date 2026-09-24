package siga;

import java.util.HashMap;
import java.util.Map;

public class AlunoDAOMemoria implements AlunoDAO {
    private Map<String, Aluno> repositorio = new HashMap<>();

    @Override
    public void salvar(Aluno aluno) {
        repositorio.put(aluno.getRga(), aluno);
        System.out.println("Aluno guardado em memória: " + aluno.getNome());
    }

    @Override
    public Aluno buscarPorRga(String rga) {
        return repositorio.get(rga);
    }
}