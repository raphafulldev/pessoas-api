package br.com.attornatus.pessoasapi.service.execeptions;

public class ResourceNotFoundException extends RuntimeException{

    public ResourceNotFoundException(Object id) {
        super("Resource not found. id " +  id);
    }
}
