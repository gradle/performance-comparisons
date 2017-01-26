package org.gradle.test.performancenull_241;

import static org.junit.Assert.*;

public class Testnull_24083 {
    private final Productionnull_24083 production = new Productionnull_24083("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}