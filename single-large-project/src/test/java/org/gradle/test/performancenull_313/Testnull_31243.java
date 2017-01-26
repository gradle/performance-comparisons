package org.gradle.test.performancenull_313;

import static org.junit.Assert.*;

public class Testnull_31243 {
    private final Productionnull_31243 production = new Productionnull_31243("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}