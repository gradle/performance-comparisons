package org.gradle.test.performancenull_313;

import static org.junit.Assert.*;

public class Testnull_31288 {
    private final Productionnull_31288 production = new Productionnull_31288("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}