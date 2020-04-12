package com.nyt.chainofresponsibility.servlet;

public class ServletFilter {


    public static void main(String[] args) {

    }




    static class Request{


    }

    static class Response{

    }

    interface Filter{
        boolean doFilter(Request request,Response response);
    }


    static class HTMLFilter implements Filter{
        @Override
        public boolean doFilter(Request request, Response response) {

            

            return false;
        }
    }

    static class FilterChain implements Filter{
        @Override
        public boolean doFilter(Request request, Response response) {

            return false;
        }
    }


}
