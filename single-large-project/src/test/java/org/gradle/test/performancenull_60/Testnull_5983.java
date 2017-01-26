package org.gradle.test.performancenull_60;

import static org.junit.Assert.*;

public class Testnull_5983 {
    private final Productionnull_5983 production = new Productionnull_5983("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}