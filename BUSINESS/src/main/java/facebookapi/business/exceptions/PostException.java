package facebookapi.business.exceptions;

public class PostException extends RuntimeException {
    public PostException() {
        super("Nie dodano ani zdjęcia, ani opisu");
    }
}
