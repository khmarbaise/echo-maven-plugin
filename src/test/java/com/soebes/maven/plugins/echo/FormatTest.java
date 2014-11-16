package com.soebes.maven.plugins.echo;

import java.text.NumberFormat;
import java.util.Locale;

import org.testng.annotations.Test;

public class FormatTest
{

    @Test
    public void firstTest() {
        String s = "1";
        
        NumberFormat integerFormat = NumberFormat.getIntegerInstance();
        String integerFormatResult = integerFormat.format( 10000);
        System.out.println("Integer Format:" + integerFormatResult);
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance( Locale.getDefault() );
        String format = currencyInstance.format( 1 );
//        MessageFormat.format( pattern, arguments );
        System.out.println("format:" + format);

        String integerLeftPadded = String.format( "%03d", new Integer(10) );
        System.out.println("Integer Format:" + integerLeftPadded);
    }
}
