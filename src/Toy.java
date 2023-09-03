public abstract class Toy {
    private int id;
    private String name;
    private int freq;

    public Toy(int id, String name, int freq){
        this.id = id;
        this.name = name;
        this.freq = freq;
    }

    public void setId(int id){
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setFreq (int freq){
        this.freq = freq;
    }

    public int getFreg(){
        return freq;
    }

    @Override
    public String toString() {
        return "ID = " + id +
                ",Name = " + name +
                ",Frequency = " + freq;
    }
}
