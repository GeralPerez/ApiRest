package co.com.api.sprintboot.application.exception;

public class FileStorageException extends RuntimeException  {
    public FileStorageException(String message) {
        super(message);
    }

    public FileStorageException(String message, Throwable cause) {
        super(message, cause);
    }
}
