package org.example.QuanLyDongGop;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.google.gson.Gson;
import com.sun.net.httpserver.HttpContext;
import com.sun.net.httpserver.HttpServer;
import org.example.QuanLyDongGop.Entity.Payment;
import org.example.QuanLyDongGop.Entity.User;

import java.io.*;
import java.net.InetSocketAddress;
import java.util.ArrayList;
import java.util.List;


class Application {

    public static void main(String[] args) throws IOException {
        int serverPort = 8080;
        HttpServer server = HttpServer.create(new InetSocketAddress(serverPort), 0);
        HttpContext context = server.createContext("/api/hello", (exchange -> {
            String respText = "Hello!";
            exchange.sendResponseHeaders(200, respText.getBytes().length+1000);
            OutputStream output = exchange.getResponseBody();
            output.write(respText.getBytes());
            output.flush();
            exchange.close();
        }));

        HttpContext context2 = server.createContext("/api/hello2", (exchange -> {

            String urlrequet = exchange.getRequestURI().getPath();
            System.out.println(urlrequet);
            User u = new User();
            u.setName("tranthang");
            u.setId(1);
            u.setPasswd("tranthangps");
            List<User> lst = new ArrayList<>();

            User u2 = new User();
            u2.setId(2);

            exchange.getResponseHeaders().add("Content-type", "application/json");
            exchange.sendResponseHeaders(200, urlrequet.getBytes().length+100000);
            OutputStream output =  exchange.getResponseBody();
//            ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
//            String json = ow.writeValueAsString(u);
//            String json2 = ow.writeValueAsString(u2);
//            String kq = "{" + json + ","+json2+"}" ;
//            output.write(kq.getBytes());


            List<Payment> lstp = new ArrayList<>();
            Payment p1 = new Payment();
            p1.setId(1);
            p1.setUser(u);
            Payment p2 = new Payment();
            p2.setId(2);
            p2.setUser(u2);
            lstp.add(p1);
            lstp.add(p2);

            String json = new Gson().toJson(lstp );
            output.write(json.getBytes());
            output.flush();
            exchange.close();
        }));


        server.setExecutor(null); // creates a default executor
        server.start();
    }

}