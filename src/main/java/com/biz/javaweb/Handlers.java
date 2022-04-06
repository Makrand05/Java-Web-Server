package com.biz.javaweb;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;
import java.io.OutputStream;

public class Handlers {
    static class rootHandler implements HttpHandler {
        @Override
        public void handle(HttpExchange exchange) throws IOException {
        String response = "<H1>Server start success is you see this msg</h1>" +
                "<h1> Port : "+ SimpleHttpServer.port+"</h1>";
        exchange.sendResponseHeaders(200,response.length());
            OutputStream outputStream=exchange.getResponseBody();
            outputStream.write(response.getBytes());
            outputStream.close();
        }
    }
}
