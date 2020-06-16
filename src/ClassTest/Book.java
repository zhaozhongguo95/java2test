package ClassTest;
/*
 *类中定义并使用成员变量
 *@Author zzg
 *@create 2020 06 07 11:35
 */

public class Book {
    private String name;
    public String getName(){
            int id = 0;
            setName("Java");
        return id+this.name;

    }

    private void setName(String java) {
        this.name = name;
    }
    public Book getBook(){
        return this;
    }
}
