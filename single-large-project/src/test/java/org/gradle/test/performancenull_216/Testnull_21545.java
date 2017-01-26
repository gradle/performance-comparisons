package org.gradle.test.performancenull_216;

import static org.junit.Assert.*;

public class Testnull_21545 {
    private final Productionnull_21545 production = new Productionnull_21545("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}