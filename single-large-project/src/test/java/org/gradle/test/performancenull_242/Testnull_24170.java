package org.gradle.test.performancenull_242;

import static org.junit.Assert.*;

public class Testnull_24170 {
    private final Productionnull_24170 production = new Productionnull_24170("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}