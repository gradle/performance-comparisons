package org.gradle.test.performancenull_250;

import static org.junit.Assert.*;

public class Testnull_24962 {
    private final Productionnull_24962 production = new Productionnull_24962("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}