package siga;

public interface AlunoDAO {
    void salvar(Aluno aluno);
    Aluno buscarPorRga(String rga);
}