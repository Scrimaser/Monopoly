package game;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Player {
    @Getter
    private int id;
    @Getter
    @Setter
    private int money;
    @Getter
    @Setter
    private int currentPosition;
    @Getter
    private List<Field> propertyList;

    public Player(){
        propertyList = new ArrayList<>();
    }

    public void addProperty(Field field){
        propertyList.add(field);
    }
    public int throwsCube(){
        int oneCube = ThreadLocalRandom.current().nextInt(1, 6 + 1);
        int twoCube = ThreadLocalRandom.current().nextInt(1, 6 + 1);
        return oneCube + twoCube;
    }
}
