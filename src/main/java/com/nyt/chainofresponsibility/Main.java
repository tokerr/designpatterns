package com.nyt.chainofresponsibility;

import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {


        Msg msg = new Msg();
        msg.setMsg("我是000");

        FilterChain filterChain = new FilterChain();

        filterChain.add(new HTMLFilter())
                .add(new URLFilter())
                .add(new SensivityFilter());



        FilterChain fc2 = new FilterChain();
        fc2.add(new SensivityFilter());

        filterChain.add(fc2);

        filterChain.doFilter(msg);



    }


    static class Msg{
         String msg;

        public void setMsg(String msg) {
            this.msg = msg;
        }

        public String getMsg() {
            return msg;
        }

        @Override
        public String toString() {
            return "{msg:"+msg+"}";
        }
    }




    interface Filter{

        boolean doFilter(Msg msg);

    }

    static class HTMLFilter implements Filter{

        @Override
        public boolean doFilter(Msg msg) {
            System.out.println(this.getClass().getName()+":"+msg);
            return true;
        }
    }

    static class URLFilter implements Filter{
        @Override
        public boolean doFilter(Msg msg) {
            System.out.println(this.getClass().getName()+":"+msg);
            return false;
        }
    }

    static class SensivityFilter implements Filter{

        @Override
        public boolean doFilter(Msg msg) {
            System.out.println(this.getClass().getName()+":"+msg);
            return false;
        }
    }


    static class FilterChain implements Filter{

        private List<Filter> filters =new ArrayList<>();

        public FilterChain add(Filter filter){
            filters.add(filter);
            return this;
        }

        public Filter remove(Filter filter){
            filters.remove(filter);
            return this;
        }

        @Override
        public boolean doFilter(Msg msg) {

            for (Filter filter: filters) {
                filter.doFilter(msg);
            }
            return false;
        }
    }





}
