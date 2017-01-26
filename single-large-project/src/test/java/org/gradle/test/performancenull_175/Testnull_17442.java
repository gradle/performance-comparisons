package org.gradle.test.performancenull_175;

import static org.junit.Assert.*;

public class Testnull_17442 {
    private final Productionnull_17442 production = new Productionnull_17442("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}