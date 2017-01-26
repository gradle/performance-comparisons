package org.gradle.test.performancenull_62;

import static org.junit.Assert.*;

public class Testnull_6121 {
    private final Productionnull_6121 production = new Productionnull_6121("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}