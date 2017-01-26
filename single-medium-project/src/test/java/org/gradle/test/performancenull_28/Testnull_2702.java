package org.gradle.test.performancenull_28;

import static org.junit.Assert.*;

public class Testnull_2702 {
    private final Productionnull_2702 production = new Productionnull_2702("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}