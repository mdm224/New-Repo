package DataStructures;

public class Cat {
    String name; //Tom
	double age; //1.5
    Color color; //FAWN
    String type; //domestic

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    


    public Cat(String name, double age, Color color, String type) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.type = type;
    }

    public Cat(String name) {
		super();
		this.name = name;
	}
    
    public Cat(String name, double age) {
		super();
		this.name = name;
		this.age = age;
	}
    
    @Override
    public String toString() {
        return "Cat information: [age=" + age + ", color=" + color + ", name=" + name + ", type=" + type + "]";
    }

    public Cat(){}

    String eat(){
        return "Tuna";
    }

    boolean play(String toy){
        boolean isGoodToy = false;
        return !(isGoodToy)? true : false;
    }
    
    public static void main(String[] args)
    {
        
    	Cat tom = new Cat();
        tom.setAge(2);
        tom.setName("Tom");
        tom.setColor(Color.BLACK);
        tom.setType("feral");
        System.out.println(tom.toString());
        System.out.println(tom.play("nice toy"));
        System.out.println(tom.eat());
        
        //public MyCat(String name, double age, Color color, String type) 

        Cat thomas = new Cat("Thomas", 1.5, Color.BLACK, "Domestic");
        System.out.println(thomas.toString());
    }
}
