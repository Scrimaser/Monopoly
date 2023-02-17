package game;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
public class Field {
    private Integer id;
    private String name;
    private Integer price;
    private Integer rent;
    private Integer priceHome;
    private Integer priceHotel;

    public Field(Integer id, String name, Integer price, Integer rent, Integer priceHome, Integer priceHotel) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.rent = rent;
        this.priceHome = priceHome;
        this.priceHotel = priceHotel;
    }

    @Override
    public String toString() {
        return "Field{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", rent=" + rent +
                ", priceHome=" + priceHome +
                ", priceHotel=" + priceHotel +
                '}';
    }
}
