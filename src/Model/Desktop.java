
package Model;

public class Desktop extends Computador{
private int potenciaF;




    public int getPotenciaF() {
        return potenciaF;
    }

    public void setPotenciaF(int potenciaF) {
        this.potenciaF = potenciaF;
    }


    
    public Desktop(){
    
    
    }
    
    
    
    public Desktop (int id, String modelo, String cor,double preco, int potenciaF){
      this.id = id;
      this.modelo = modelo;
      this.cor = cor;
      this.preco = preco;
      this.potenciaF= potenciaF;
    
 
}
    
    
    
  
    @Override
    public void Cadastrar() {
         
    }
    
@Override
    public String Informacoes(){
        return "{'Id': '" + id + "'Modelo': '" + modelo + " 'Cor': '" + cor + "' , 'Preco': " +preco + " , 'Potencia da Fonte': " + this.getPotenciaF()+  " }";
    
    }

    
    
}
