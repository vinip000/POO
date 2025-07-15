package Controller;
import Model.Professor;
import View.ProfessorView;

public class ProfessorController extends PessoaController {
    private Professor model;
    private ProfessorView view;

    public ProfessorController(Professor model, ProfessorView view) {
        super(model, view);
        this.model = model;
        this.view = view;
    }

    public void setProfessorDepartamento(String departamento) {
        model.setDepartamento(departamento);
    }

    public String getProfessorDepartamento() {
        return model.getDepartamento();
    }

    @Override
    public void updateView() {
        view.printProfessorDetails(model.getNome(), model.getCpf(), model.getDepartamento());
    }
}
