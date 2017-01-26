package org.gradle.test.performancenull_313;

import static org.junit.Assert.*;

public class Testnull_31282 {
    private final Productionnull_31282 production = new Productionnull_31282("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}