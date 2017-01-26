package org.gradle.test.performancenull_271;

import static org.junit.Assert.*;

public class Testnull_27097 {
    private final Productionnull_27097 production = new Productionnull_27097("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}