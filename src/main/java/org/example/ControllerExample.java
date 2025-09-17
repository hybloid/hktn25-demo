package org.example;

import java.sql.Connection;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

/** @noinspection unused*/
public class ControllerExample implements HttpHandler {
    private Connection connection;

    public void handle(HttpExchange exc) {
        String productId = exc.getRequestHeaders().getFirst("productId");

    }
}