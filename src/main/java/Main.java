import com.github.cliftonlabs.json_simple.JsonException;
import game.Game;
import game.Parser;
import game.Player;

import java.io.IOException;

public class Main {
    private static final String PATH_TO_FIELD = "src/main/resources/fields.json";
    public static void main(String[] args) {
        Parser parser = new Parser();
//        try {
//            parser.propertyList(PATH_TO_FIELD, "field").forEach(System.out::println);
//        } catch (JsonException e) {
//        e.printStackTrace();
//        }
        Game game = new Game();
        try {
            game.toField(parser.propertyList(PATH_TO_FIELD, "field")).forEach(System.out::println);
        } catch (JsonException e) {
            throw new RuntimeException(e);
        }


    }

}
