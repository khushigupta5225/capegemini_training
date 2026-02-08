package junitPractice;

public class DatabaseConnection {
    boolean connected;

    void connect() { connected = true; }
    void disconnect() { connected = false; }
    boolean isConnected() { return connected; }
}
