package org.gradle.test.performancenull_385;

import static org.junit.Assert.*;

public class Testnull_38403 {
    private final Productionnull_38403 production = new Productionnull_38403("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}