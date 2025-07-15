package Controller;
import Model.Aluno;
import View.AlunoView;


public class AlunoController extends PessoaController {
    private Aluno model;
    private AlunoView view;

    public AlunoController(Aluno model, AlunoView view) {
        super(model, view);
        this.model = model;
        this.view = view;
    }

    public void setAlunoMatricula(String matricula) {
        model.setMatricula(matricula);
    }

    public String getAlunoMatricula() {
        return model.getMatricula();
    }

    @Override
    public void updateView() {
        view.printAlunoDetails(model.getNome(), model.getCpf(), model.getMatricula());
    }
}
