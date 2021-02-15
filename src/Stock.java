public class Stock{
    private String nameStock;
    private int numberStock;
    private int valueStock;
 
    //Default constructor
    public Stock (String nStock, int vStock, int NbStock){
        this.nameStock = nStock;
        this.valueStock = vStock;
        this.numberStock = NbStock;
    }

    public String getNom()  {
        return nameStock;
    }
    public int getCours() {
        return valueStock;
    }
    public int getNombre() {
        return numberStock;
    }

    public void setNom(String nStock) {
        nameStock = nStock;
    }
    public void setCours(int vStock) {
        valueStock = vStock;
    }
    public void setNombre(int NbStock) {
        numberStock = NbStock;
    }

    //Return wallet status
    public String Status(){
        return "Yout current wallet is : " +this.nameStock+ " --> " +this.numberStock+ " shares "+this.valueStock+" each " +this.numberStock*this.valueStock+ " in total.";
    }

}
