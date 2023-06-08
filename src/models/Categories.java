package models;

/* @author andre */
public class Categories {

    private int id;
    private String name;
    private String updated;
    private String created;

    public Categories() {
    }

    public Categories(int id, String name, String updated, String created) {
        this.id = id;
        this.name = name;
        this.updated = updated;
        this.created = created;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

}
