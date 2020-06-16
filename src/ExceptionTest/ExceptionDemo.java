package ExceptionTest;

/**
 * @author CrazyZ
 * @create 2020-06-15-21:41
 */
public class ExceptionDemo {
    public static void main(String[] args) {
        Person p = new Person();
        try{
            p.setAge(101);
        }catch (AgeTooBigException e){
            System.out.println("年龄大");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
//自定义异常
class Person{
    private int age;
    public void setAge(int age) throws AgeTooBigException,AgeTooSmallException{
        if(age<0){
            throw new AgeTooSmallException("年龄过小");
        }
        if(age>100){
            throw new AgeTooBigException("年龄过大");
        }
        this.age = age;
    }
    public int getAge(){
        return age;
    }
}

//年龄异常，自定义异常
class AgeTooSmallException extends Exception{
    public AgeTooSmallException(){
    }
    public AgeTooSmallException(String msg){
        super(msg);
    }
}
class AgeTooBigException extends Exception{
    public AgeTooBigException(){
    }
    public AgeTooBigException(String msg){
        super(msg);
    }
}