package kz.whatevertest.securedapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SecuredappApplication {


    Fignya fignya = new Fignya();

    public static void main(String[] args) {
        SpringApplication.run(SecuredappApplication.class, args);




    }



    class Fignya implements hernovInterface {


        @Override
        public void nuevoHahui() throws Exception {

        }


    }


}

