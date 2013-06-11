package com.coldkreap.webservice;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class SomeServlet extends HttpServlet {
    private static final String SOME_JSON = "{" +
            "\"employees\": [" +
            "{ \"firstName\":\"John\" , \"lastName\":\"Doe\" }, " +
            "{ \"firstName\":\"Anna\" , \"lastName\":\"Smith\" }, " +
            "{ \"firstName\":\"Peter\" , \"lastName\":\"Jones\" }" +
            "]" +
            "}";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        requestAppd();

        resp.setStatus(HttpServletResponse.SC_OK);
        resp.setContentType("application/json");
        resp.setCharacterEncoding("UTF-8");
        PrintWriter responseWriter = resp.getWriter();
        responseWriter.write(SOME_JSON);
        responseWriter.close();
    }

    private void requestAppd() {

    }
}
