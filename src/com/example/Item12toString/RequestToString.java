package com.example.Item12toString;

public class RequestToString {
    public String header;
    public String body;

    public void setHeader(String header) {
        this.header = header;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "RequestToString{" +
                "header='" + header + '\'' +
                ", body='" + body + '\'' +
                '}';
    }
}
