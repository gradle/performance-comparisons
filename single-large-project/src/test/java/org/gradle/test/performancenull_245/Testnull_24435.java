package org.gradle.test.performancenull_245;

import static org.junit.Assert.*;

public class Testnull_24435 {
    private final Productionnull_24435 production = new Productionnull_24435("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}