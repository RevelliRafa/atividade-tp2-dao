package siga;

public class ServicoMatricula {
    private AlunoDAO alunoDAO;

    public ServicoMatricula(AlunoDAO alunoDAO) {
        this.alunoDAO = alunoDAO;
    }

    public void matricular(Aluno aluno) {
        if (aluno.getRga() == null || aluno.getRga().isEmpty()) {
            throw new IllegalArgumentException("RGA inválido.");
        }
        alunoDAO.salvar(aluno);
    }
}