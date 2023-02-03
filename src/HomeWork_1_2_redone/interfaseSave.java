package HomeWork_1_2_redone;

import java.io.InvalidObjectException;

public interface interfaseSave {


    boolean serializaSave(Designer_Human Human);

    Designer_Human DesSerializa(Designer_Human human1) throws InvalidObjectException;

}

