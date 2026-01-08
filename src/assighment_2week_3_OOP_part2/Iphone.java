package assighment_2week_3_OOP_part2;

public class Iphone {
    private String model;
    private String color;
    private int price;

    public Iphone(String model, String color, int price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (!(obj instanceof Iphone))
            return false;

        Iphone iphone = (Iphone) obj;

        if (this.price != iphone.price)
            return false;

        if (this.model == null) {
            if (iphone.model != null)
                return false;
        } else if (!this.model.equals(iphone.model))
            return false;

        if (this.color == null) {
            if (iphone.color != null)
                return false;
        } else if (!this.color.equals(iphone.color))
            return false;

        return true;
    }

    public static void main(String[] args) {
        Iphone iphone1 = new Iphone("X", "Black", 999);
        Iphone iphone2 = new Iphone("X", "Black", 999);
        System.out.println(iphone1.equals(iphone2));
    }
}
