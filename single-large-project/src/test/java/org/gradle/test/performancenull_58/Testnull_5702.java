package org.gradle.test.performancenull_58;

import static org.junit.Assert.*;

public class Testnull_5702 {
    private final Productionnull_5702 production = new Productionnull_5702("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}