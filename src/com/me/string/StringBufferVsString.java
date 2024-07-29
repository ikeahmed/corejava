package com.me.string;

public class StringBufferVsString {
    public static void main(String[] args)
    {
        StringBuffer sb = new StringBuffer();
        sb.append("I");
        sb.append(" am");
        sb.append(" StringBuffer");
        String message = sb.toString();
        System.out.println(message);

        String str = "I";
        str += " am";
        str += " String";
        System.out.println(str);
    }
}
