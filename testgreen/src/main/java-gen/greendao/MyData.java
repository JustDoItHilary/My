package greendao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table "MY_DATA".
 */
public class MyData {

    private Long id;
    private String name;
    private String age;
    /** Not-null value. */
    private String cool;

    public MyData() {
    }

    public MyData(Long id) {
        this.id = id;
    }

    public MyData(Long id, String name, String age, String cool) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.cool = cool;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    /** Not-null value. */
    public String getCool() {
        return cool;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setCool(String cool) {
        this.cool = cool;
    }

}