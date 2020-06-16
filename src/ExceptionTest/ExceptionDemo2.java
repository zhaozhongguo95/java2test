package ExceptionTest;

/**
 * @author CrazyZ
 * @create 2020-06-15-21:57
 */
public class ExceptionDemo2 {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        try {
            t1.makeTriangle(2.0, 0.1, 2.1);
        }catch (InvalidInputException e){
            System.out.println("输入的不合法");
        }catch (InvalidEdgeException e){
            System.out.println("两边之和要大于第三边");
        }catch (Exception e){
            e.getMessage();
        }
    }
}
class Triangle{
    public Double a;
    public Double b;
    public Double c;

    public void makeTriangle(Double a,Double b, Double c) throws InvalidEdgeException,InvalidInputException{
//        Boolean flag = isN
        if(a<=0.0||b<=0.0||c<=0.0){
            throw new InvalidInputException("输入的数字要大于0");
        }
        if(a+b<=c||b+c<=a||a+c<=b){
            throw new InvalidEdgeException("不能构成三角形");
        }
    }
}

class InvalidEdgeException extends Exception{
    public InvalidEdgeException(){}
    public InvalidEdgeException(String msg) {
        super(msg);
    }
}
class InvalidInputException extends  Exception{
    public InvalidInputException(){}
    public InvalidInputException(String msg){
        super(msg);
    }
}

