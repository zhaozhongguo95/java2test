package InheritanceTest;
/*
 *演示多态和接口的Demo
 *@Author zzg
 *@create 2020 06 10 0:10
 */

interface drawTest{//定义接口
    public void draw();//定义方法
}

//定义平行四边形类，该类继承了四边形类，并实现了drawTest接口
class ParrallelogramgleUseInterface extends QuadrangleUseInterface implements drawTest{
    public void draw(){//由于该类实现了接口，所以需要覆盖draw()方法
        System.out.println("平行四边形.draw()");
    }
    public void doAnyThing(){//覆盖父类方法
        //
    }
}
class SquareUseInterFace extends QuadrangleUseInterface implements drawTest{
    public void draw(){
        System.out.println("正方形.draw()");
    }
    public void doAnyThing(){
        //
    }
}

class AnyThingUseInterface extends QuadrangleUseInterface{
    void  doAnything(){

    }
}
public  class QuadrangleUseInterface{//定义四边形类
    public void doAnyThing(){

    }

    public static void main(String[] args) {
        drawTest[] d ={//接口也可以进行向上转型操作
            new SquareUseInterFace(),new ParrallelogramgleUseInterface()
        };
        for (int i = 0; i < d.length; i++) {
            d[i].draw();
        }

    }

}


