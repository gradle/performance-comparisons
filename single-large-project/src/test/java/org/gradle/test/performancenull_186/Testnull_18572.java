package org.gradle.test.performancenull_186;

import static org.junit.Assert.*;

public class Testnull_18572 {
    private final Productionnull_18572 production = new Productionnull_18572("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}