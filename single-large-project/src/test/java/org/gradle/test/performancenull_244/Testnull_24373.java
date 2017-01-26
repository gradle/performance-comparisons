package org.gradle.test.performancenull_244;

import static org.junit.Assert.*;

public class Testnull_24373 {
    private final Productionnull_24373 production = new Productionnull_24373("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}