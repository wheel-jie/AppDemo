package com.yangpeiyong.appdemo;

/**
 * Created by wangjie on 2018/5/15.
 */

public class Test {


//    //懒汉式
//    public  class  singledemo{
//        private  static  singledemo singledemo;
//         private  singledemo(){}
//         public  static synchronized singledemo getinstance(){
//         if(singledemo==null){
//             singledemo=new singledemo();
//         }
//         return  singledemo;
//         }
//    }

    //饿汉式

 private  static  class  singleH{
     private  static  Test ins=new Test();
 }

 private  Test(){}
 private  static Test getin(){
     return  singleH.ins;
 }
//    private static Test instance=new Test();
//    private Test(){
//
//    }
//    public static Test getInstance(){
//        return instance;
//    }


}
