package org.gradle.test.performancenull_28;

import static org.junit.Assert.*;

public class Testnull_2741 {
    private final Productionnull_2741 production = new Productionnull_2741("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}