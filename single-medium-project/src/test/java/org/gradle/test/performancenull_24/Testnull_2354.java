package org.gradle.test.performancenull_24;

import static org.junit.Assert.*;

public class Testnull_2354 {
    private final Productionnull_2354 production = new Productionnull_2354("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}