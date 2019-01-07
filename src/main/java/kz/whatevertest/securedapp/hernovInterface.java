package kz.whatevertest.securedapp;


@FunctionalInterface
public interface hernovInterface {


    void nuevoHahui() throws Exception;



    default  void herovMethod() {
        System.out.println("shel nazhui");
    }
}
