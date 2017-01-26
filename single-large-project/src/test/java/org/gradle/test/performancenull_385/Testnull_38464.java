package org.gradle.test.performancenull_385;

import static org.junit.Assert.*;

public class Testnull_38464 {
    private final Productionnull_38464 production = new Productionnull_38464("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}