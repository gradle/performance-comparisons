package org.gradle.test.performancenull_400;

import static org.junit.Assert.*;

public class Testnull_39954 {
    private final Productionnull_39954 production = new Productionnull_39954("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}