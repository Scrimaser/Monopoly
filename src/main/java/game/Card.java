package game;

import lombok.Getter;
import lombok.Setter;

@Getter
public class Card {
    private int id;
    @Setter
    private Field[] fieldId;
    @Setter
    private String name;
    @Setter
    private int money;
    @Setter
    private String text;

}
