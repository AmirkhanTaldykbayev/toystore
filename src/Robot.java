public class Robot extends Toy{
    public Robot(int id, String name, int freq) {
        super(id, name, freq);
    }

    public void setId(int id){
        super.setId(id);
    }

    public int getId() {
        return super.getId();
    }

    public void setName(String name){
        super.setName(name);
    }

    public String getName(){
        return super.getName();
    }

    public void setFreq (int freq){
        super.setFreq(freq);
    }

    public int getFreg(){
        return super.getFreg();
    }

    @Override
    public String toString() {
        return "ID = " + super.getId() +
                ", Name = " + super.getName() +
                ", Frequency = " + super.getFreg();
    }
}
