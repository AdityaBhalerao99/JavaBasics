package LambdaExpression;

/*
So what we understand here is If the Parent Interface is Functional Interface then
Child interface who is extending Parent interface will automatically becomes Functional interface even if it is empty.
 */

public interface Parent {

    default int add(int a, int b){
        return a + b;
    }
}
