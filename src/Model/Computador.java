
package Model;

public abstract class Computador {
    public String modelo;
    public String cor;
    public double preco;
    public int id;
    
   
    public Computador(){
    
    
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
 
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    public Computador (int id,String modelo, String cor,double preco){
      this.id = id;
      this.modelo = modelo;
      this.cor = cor;
      this.preco = preco;
  
  
}
    
     
    public abstract void Cadastrar ();
    
    
    public String Informacoes(){
        return null;
    
    }
    
    
}
