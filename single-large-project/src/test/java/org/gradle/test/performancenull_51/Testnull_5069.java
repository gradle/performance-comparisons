package org.gradle.test.performancenull_51;

import static org.junit.Assert.*;

public class Testnull_5069 {
    private final Productionnull_5069 production = new Productionnull_5069("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}