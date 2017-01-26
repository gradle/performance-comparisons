package org.gradle.test.performancenull_412;

import static org.junit.Assert.*;

public class Testnull_41199 {
    private final Productionnull_41199 production = new Productionnull_41199("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}