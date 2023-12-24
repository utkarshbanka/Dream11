package com.Dream11.Dream11.Exception;

public class ResourceNotFound  extends  RuntimeException{


    public ResourceNotFound()
    {

    }

    public ResourceNotFound(String mess){
        super(mess);
    }
}
