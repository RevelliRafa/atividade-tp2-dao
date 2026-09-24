package siga;

public class AlunoDAOBanco implements AlunoDAO {
    private BancoSimulado banco = new BancoSimulado();

    @Override
    public void salvar(Aluno aluno) {
        banco.inserirAluno(aluno.getRga(), aluno.getNome());
        System.out.println("Aluno guardado na base de dados.");
    }

    @Override
    public Aluno buscarPorRga(String rga) {
        return banco.buscarAluno(rga);
    }
}