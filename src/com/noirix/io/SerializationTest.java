package com.noirix.io;

import com.noirix.domain.Cat;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Cat cat = new Cat(10, "Red");
        System.out.println("Cat before: ");
        System.out.println(cat);

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeObject(cat);

        byte[] serializedCat = byteArrayOutputStream.toByteArray();
        String s = new String(serializedCat);
        System.out.println(s);

        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(serializedCat);
        ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
        Cat deserializedCat = (Cat) objectInputStream.readObject();

        System.out.println("Cat after: ");
        System.out.println(deserializedCat);

    }
}
