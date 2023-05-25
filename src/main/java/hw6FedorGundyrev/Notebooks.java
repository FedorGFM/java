package hw6FedorGundyrev;
import java.util.Objects;
public class Notebooks {
    String name;
    String cpu;
    String os;
    int ram;
    int hdd;
    int price;

    public String getName(){
        return  name;
    }

    public String getCpu(){
        return  cpu;
    }

    public String getOs(){
        return  os;
    }

    public int getRam(){
        return  ram;
    }

    public int getHdd(){
        return  hdd;
    }

    public int getPrice(){
        return  price;
    }

    public Notebooks(String name, String cpu, String os, int hdd, int ram, int price){
        this.name = name;
        this.cpu = cpu;
        this.ram = ram;
        this.os = os;
        this.hdd = hdd;
        this.price = price;
    }


    public String toString(){
        StringBuilder strb = new StringBuilder();
        strb.append(name).append(" ").append(cpu).append(" ").append(os).append(" ").append(ram).append(" ").append(hdd).append(" ").append(price);
        return strb.toString();
    }


    public int hashCode() {
        return Objects.hash(name, cpu, os, ram, hdd, price);
    }


    public  boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Notebooks)) {
            return false;
        }
        Notebooks temp = (Notebooks) obj;
        return temp.name.equals(this.name) && temp.cpu.equals(this.cpu) && temp.os.equals(this.os) && temp.ram == this.ram && temp.hdd == this.hdd && temp.price == this.price;
    }
}
