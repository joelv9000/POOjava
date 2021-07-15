
public class CuentaBancaria {
	
	//Atributos de clases
    private String institucion ="";
    private String  beneficiario ="";
    private float saldo=0;
    private long cuenta=0;
    private String producto="";
    private String direccion="";
    private String RFC ="";
	
	CuentaBancaria(){
		
	}
	CuentaBancaria(String beneficiario){
		this.beneficiario = beneficiario;
	}
	
	CuentaBancaria(String beneficiario, float saldo){
		this.beneficiario = beneficiario;
		this.saldo = saldo ;
		
	}
	
	//getter y settter
	//get : obtengo el valor del objeto
	//set :  escribo el valor
	
	public String getInstitucion() {
		return institucion = institucion;
	}
	
	public void setInstitucion (String institucion) {
		this.institucion = institucion;
	}
	
	//metodos de la clase
	public void depositos (float monto) {
		this.saldo = this.saldo + monto;
		
	}
	
	public void retiros(float monto) {
		if(monto<=this.saldo && monto >= 0) {
		this.saldo = this.saldo - monto;
	    }
	}	
	//metodos de la clase
	public float consultarSaldo() {
	   return this.saldo;
    }
	
	public String estadoDeCuenta() {
		return "";
	}
	public void setSaldo(float f) {
		if(saldo>0) {
			this.saldo =saldo;
		}else{
			throw new IllegalArgumentException("El saldo es invalido");
		}
		
	}
	public float getSaldo() {
		return saldo;
	}
	
	
}
