package Model;

import java.util.HashMap;

public class Cache <T, ID>{

    private HashMap<ID, T> cache;

    public Cache() {
        this.cache = new HashMap<>();
    }
}
