package org.gradle.test.performancenull_217;

import static org.junit.Assert.*;

public class Testnull_21646 {
    private final Productionnull_21646 production = new Productionnull_21646("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}