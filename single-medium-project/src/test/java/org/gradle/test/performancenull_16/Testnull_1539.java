package org.gradle.test.performancenull_16;

import static org.junit.Assert.*;

public class Testnull_1539 {
    private final Productionnull_1539 production = new Productionnull_1539("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}