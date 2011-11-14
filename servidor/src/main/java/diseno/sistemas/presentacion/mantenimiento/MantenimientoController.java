package diseno.sistemas.presentacion.mantenimiento;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;

import diseno.sistemas.dominio.mantenimiento.DatoGeneral;
import diseno.sistemas.negocio.mantenimiento.DatosService;

@ManagedBean
@SessionScoped
public class MantenimientoController implements Serializable{

	private static final long serialVersionUID = 5662298712058774241L;
	
	@ManagedProperty("#{mantenimientoService}")
	private DatosService datosService;
	
	private List<DatoGeneral> listaTipoDocumentos;
	private List<DatoGeneral> listaPerfiles;
	private List<DatoGeneral> listaTipoComprobantes;
	private List<DatoGeneral> listaEstadoCredito;
	private List<DatoGeneral> listaUnidadesMedida;
	
	@PostConstruct
	public void cargarListas(){
		listaTipoDocumentos=datosService.cargarTiposDocumento();
		listaPerfiles=datosService.cargarPerfiles();
		listaTipoComprobantes=datosService.cargarTiposComprobante();
		
	}
	
	public List<DatoGeneral> getListaTipoDocumentos() {
		return listaTipoDocumentos;
	}
	public void setListaTipoDocumentos(List<DatoGeneral> listaTipoDocumentos) {
		this.listaTipoDocumentos = listaTipoDocumentos;
	}

	public List<DatoGeneral> getListaPerfiles() {
		return listaPerfiles;
	}
	public void setListaPerfiles(List<DatoGeneral> listaPerfiles) {
		this.listaPerfiles = listaPerfiles;
	}
	public List<DatoGeneral> getListaTipoComprobantes() {
		return listaTipoComprobantes;
	}
	public void setListaTipoComprobantes(List<DatoGeneral> listaTipoComprobantes) {
		this.listaTipoComprobantes = listaTipoComprobantes;
	}
	public List<DatoGeneral> getListaEstadoCredito() {
		return listaEstadoCredito;
	}
	public void setListaEstadoCredito(List<DatoGeneral> listaEstadoCredito) {
		this.listaEstadoCredito = listaEstadoCredito;
	}

	public List<DatoGeneral> getListaUnidadesMedida() {
		return listaUnidadesMedida;
	}

	public void setListaUnidadesMedida(List<DatoGeneral> listaUnidadesMedida) {
		this.listaUnidadesMedida = listaUnidadesMedida;
	}

	public DatosService getDatosService() {
		return datosService;
	}

	public void setDatosService(DatosService datosService) {
		this.datosService = datosService;
	}
}