
package Model;

public class Notebook extends Computador{
    
 private String tempodeBateria;
 
 

 
    public Notebook(){
    
    }
    
     public String getTempodeBateria() {
        return tempodeBateria;
    }

    public void setTempodeBateria(String tempodeBateria) {
        this.tempodeBateria = tempodeBateria;
    }
    
    
      public Notebook (String modelo, String cor,double preco, String tempoBateria){
      this.modelo = modelo;
      this.cor = cor;
      this.preco = preco;
      this.tempodeBateria = tempoBateria;
      
    
    
      }
      
      
      
      @Override
    public String Informacoes(){
        return "{'Id': '" + id + "'Modelo': '" + modelo + " 'Cor': '" + cor + "' , 'Preco': " +preco + " , 'Tempo de Bateria': " + this.getTempodeBateria()+  " }";
    
    }
      

    @Override
    public void Cadastrar() {
       
    }
    
    
    
    
}
