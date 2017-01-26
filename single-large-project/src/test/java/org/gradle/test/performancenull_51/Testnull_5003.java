package org.gradle.test.performancenull_51;

import static org.junit.Assert.*;

public class Testnull_5003 {
    private final Productionnull_5003 production = new Productionnull_5003("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}