package AdvanceClass;

/**
 * @author CrazyZ
 * @create 2020-06-11-12:47
 * 使用this获取内部类和外部类的引用
 */
public class TheSameName {
    private int x;
    private class Inner{
        private int x=9;
        public void doit(int x){
            x++;//调用形参
            this.x++;//调用内部类的变量x
            TheSameName.this.x++;//调用外部类的变量x
        }
    }
}
