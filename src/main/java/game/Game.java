package game;

import com.github.cliftonlabs.json_simple.JsonArray;
import com.github.cliftonlabs.json_simple.JsonException;
import com.github.cliftonlabs.json_simple.JsonObject;
import com.github.cliftonlabs.json_simple.Jsoner;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class Game {
    Field field;
    public void play(boolean isGame) {
        Player p1 = new Player();
        Player p2 = new Player();
        while (isGame) {

        }
    }

    public @NotNull List<Field> toField (@NotNull List<JsonObject> list){
        List<Field> fieldList = new ArrayList<>();
        JsonArray rentArr;
        for (JsonObject s : list){
            rentArr = (JsonArray) s.get("rent");

            field = new Field(Integer.parseInt(s.get("id").toString()), (String) s.get("name"), Integer.parseInt(s.get("price").toString()),
                    Integer.parseInt(rentArr.get(0).toString()), Integer.parseInt(s.get("priceHome").toString()), Integer.parseInt(s.get("priceHotel").toString()));
            fieldList.add(field);
        }
        return fieldList;
    }
}
