package org.gradle.test.performancenull_16;

import static org.junit.Assert.*;

public class Testnull_1531 {
    private final Productionnull_1531 production = new Productionnull_1531("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}