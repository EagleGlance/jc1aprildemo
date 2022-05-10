package com.noirix.exception;

import com.noirix.domain.Dog;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ExceptionTest {
    public static void main(String[] args) {
        try (InputStream inputStream1 = new ByteArrayInputStream(new byte[]{1, 2});) {

            String sws = null;

            //System.out.println(sws.length());
            //System.out.println(1/0);
            System.out.println("Before inner try section");

            Dog dog = null;

            try {
                dog = new Dog();
                dog.process();
            } catch (RuntimeException e) {
                //throw new RuntimeException(e);
            }

            System.out.println(dog.toString());

            InputStream inputStream = new ByteArrayInputStream(new byte[]{1, 2});
            inputStream.read();
            System.out.println("some code than can generate some problems");

        } catch (ArithmeticException | ArrayStoreException e) {
            System.out.println("Custom process of " + e.getClass());
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("Inside finally section");
            try {
                //resource.close();
                //dbConnection.close
            } catch(Exception e) {

            }
        }
        //try - catch
        //try - catch - finally
        //try - finally


    }
}
