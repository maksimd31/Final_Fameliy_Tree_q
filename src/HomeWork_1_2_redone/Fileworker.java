package HomeWork_1_2_redone;

import java.io.InvalidObjectException;

public class Fileworker implements interfaseSave{

    @Override
    public boolean serializaSave(Designer_Human Human) { //для записи
        Serializator serializator = new Serializator();
        System.out.println(serializator.serializaSave(Human));
        return false;
    }

    @Override
    public Designer_Human DesSerializa(Designer_Human human1) throws InvalidObjectException { //для чтения
        Serializator serializator = new Serializator();
        try {
            Designer_Human human11 = serializator.DesSerializa(human1);
            System.out.println(human11.getName());
        } catch (InvalidObjectException e) {
            throw new RuntimeException(e);
        }
        return null;
    }
}
