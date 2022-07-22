package com.fzg.servlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestServlet extends MyHttpServlet {
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) {
        super.doGet(request, response);
    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) {
        super.doPost(request, response);
    }
}
