package cdi.exemplos;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

@Named
public class MeuBeanUtil {
    private String msg = "HELLO - meu bean de teste CDI";
	
    @Inject
    private MeuBeanGerenciavel bean;
	
    @PostConstruct
    public void init(){
    	
        bean.executarRotina();
    }

	public String getMsg() { return msg; }
	public void setMsg(String msg) { this.msg = msg;}    
}
