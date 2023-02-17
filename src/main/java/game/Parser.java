package game;


import com.github.cliftonlabs.json_simple.JsonArray;
import com.github.cliftonlabs.json_simple.JsonException;
import com.github.cliftonlabs.json_simple.JsonObject;
import com.github.cliftonlabs.json_simple.Jsoner;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Parser {
    public List<JsonObject> propertyList(String path, String key) throws JsonException {
        List<JsonObject> pList = new ArrayList<>();
        for (int i = 0; i < parseArray(path, key).size(); i++) {
            pList.add((JsonObject) parseArray(path, key).get(i));
        }
        return pList;
    }

    private JsonArray parseArray(String path, String key) throws JsonException {
        JsonObject o = (JsonObject) Jsoner.deserialize(readerFile(path));
        return (JsonArray) o.get(key);
    }

    private @NotNull String readerFile(String path){
        StringBuilder builder = new StringBuilder();
        try {
            List<String>fields = Files.readAllLines(Paths.get(path));
            fields.forEach(builder::append);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return builder.toString();
    }
}
