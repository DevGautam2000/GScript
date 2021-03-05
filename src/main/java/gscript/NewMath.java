package gscript;

public interface NewMath{

    //for functionality of Math.abs
    static int absl(int object){
        return Math.abs(object);
    }
    static double absl(double object){
        return Math.abs(object);
    }
    static float absl(float object){
        return Math.abs(object);
    }
    static long absl(long object){
        return Math.abs(object);
    }

    //for functionality of Math.random

    static Double rand(){
        return Math.random();
    }

    static Double rand(int range){
        return (Math.floor(Math.random()*range));
    }

}
