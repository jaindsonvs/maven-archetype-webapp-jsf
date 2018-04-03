#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class HelloWorldBean {
	
	public String getHorario() {
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		String horario = sdf.format(new Date());
		return horario;
	}
	
}
