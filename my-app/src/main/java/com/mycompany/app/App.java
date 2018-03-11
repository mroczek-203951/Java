package com.mycompany.app;
import lombok.Data;
import lombok.Builder;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )

    {
        System.out.println( "Hello World!" );
        Test te = Test.builder().x(44).build();
        System.out.println( te.getX());
    }


}

@Builder
@Data
class Test
{
    private int x;
}