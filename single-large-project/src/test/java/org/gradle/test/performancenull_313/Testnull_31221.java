package org.gradle.test.performancenull_313;

import static org.junit.Assert.*;

public class Testnull_31221 {
    private final Productionnull_31221 production = new Productionnull_31221("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}