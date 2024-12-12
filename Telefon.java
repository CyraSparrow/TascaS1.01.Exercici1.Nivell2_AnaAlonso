import java.util.Scanner;

public class Telefon {

    private String marca;
    private String model;

    public Telefon(String marca, String model) {
        this.marca = marca;
        this.model = model;
    }
    public String getMarca() {
        return marca;
    }

    public String getModel (){
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void trucar(){
        Scanner sc = new Scanner (System.in);
        System.out.println("Escriu el número de telèfon al que vols trucar");
        String num = sc.nextLine();

        System.out.println("Estàs trucant al número " + num + ".");
    }
}
