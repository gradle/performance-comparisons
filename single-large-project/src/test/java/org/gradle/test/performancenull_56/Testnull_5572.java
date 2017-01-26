package org.gradle.test.performancenull_56;

import static org.junit.Assert.*;

public class Testnull_5572 {
    private final Productionnull_5572 production = new Productionnull_5572("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}