package com.niit;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Program1 {
	public static void main(String[] args) {
        System.out.println("isValid - dd/MM/yyyy with 12/06/1987 = " + isValidFormat("dd/MM/yyyy", "12/06/1987"));
        System.out.println("isValid - dd/MM/yyyy with 03/1/1987 = " + isValidFormat("dd/MM/yyyy", "03/1/1987"));
        
    }

    public static boolean isValidFormat(String format, String value) {
        Date date = null;
        try {
            SimpleDateFormat sdf = new SimpleDateFormat(format);
            date = sdf.parse(value);
            if (!value.equals(sdf.format(date))) {
                date = null;
            }
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        return date != null;
    }
}
