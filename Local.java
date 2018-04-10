import java.util.ArrayList;
public class Local{
	private int local_id;
	private string local_direccion;
	private ArrayList<Vendedor> local_vendedores;

	public Local(int local_id, string local_direccion){

	}

	public int local_id{
		set{
			this.local_id = value;
		}
		get{
			return local_id;
		}
	}

	public string local_direccion{
		set{
			this.local_direccion = value;
		}
		get{
			return local_direccion;
		}
	}

	public List<Vendedor> local_vendedores{
		set{
			this.local_vendedores = value;
		}
		get{
			return local_vendedores;
		}
	}

	public void agregarVendedor(Vendedor v){
		local_vendedores.Add(v);
	}

	public string consultarVendedores(){
		string cadena = "";
		foreach(Vendedor v in this.local_vendedores){
			////////cadena = cadena + v.consultarDatos() + "\n";
		}
		return cadena;
	}

}