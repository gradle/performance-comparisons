package org.gradle.test.performancenull_48;

import static org.junit.Assert.*;

public class Testnull_4741 {
    private final Productionnull_4741 production = new Productionnull_4741("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}