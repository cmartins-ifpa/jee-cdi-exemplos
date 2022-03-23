package cdi.exemplos;

import javax.inject.Named;

@Named
public class MeuBeanGerenciavel {

	public void executarRotina(){
        System.out.println("Esse codigo é chamado por injecao.");
    }
}
