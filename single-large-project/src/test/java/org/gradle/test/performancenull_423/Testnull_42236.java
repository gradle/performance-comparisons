package org.gradle.test.performancenull_423;

import static org.junit.Assert.*;

public class Testnull_42236 {
    private final Productionnull_42236 production = new Productionnull_42236("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}