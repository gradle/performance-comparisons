package org.gradle.test.performancenull_24;

import static org.junit.Assert.*;

public class Testnull_2310 {
    private final Productionnull_2310 production = new Productionnull_2310("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}