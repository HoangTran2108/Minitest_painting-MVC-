package service;

import model.Painting;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PaintingServiceImpl implements PaintingService{
    private static Map<Integer, Painting> paintings;
    static {
        paintings = new HashMap<>();
        paintings.put(1,new Painting(1,"P1","Molalisa", 100.0, 50.0, "fabric", "good", 1000.0));
        paintings.put(2,new Painting(2,"P2","chrysanthemum", 60.0, 20.0, "paper", "nomal", 700.0));
        paintings.put(3,new Painting(3,"P3","screams", 130.0, 56.0, "fabric", "good", 950.0));
    }
    @Override
    public List<Painting> findAll() {
        return new ArrayList<>(paintings.values());
    }

    @Override
    public void create(Painting painting) {
        paintings.put(painting.getId(), painting);;
    }

    @Override
    public Painting findById(int id) {
        return paintings.get(id);
    }

    @Override
    public void update(int id, Painting painting) {
        paintings.put(id, painting);
    }

    @Override
    public void remove(int id) {
        paintings.remove(id);
    }
}
