package factory;

import model.DescontarEstacionamento;
import model.IServico;

public class DescontarEstacionamentoFactory implements IServicoFactory {
    @Override
    public IServico getServico () {
        return new DescontarEstacionamento();
    }
}
