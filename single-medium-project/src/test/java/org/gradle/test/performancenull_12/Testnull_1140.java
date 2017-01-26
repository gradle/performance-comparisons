package org.gradle.test.performancenull_12;

import static org.junit.Assert.*;

public class Testnull_1140 {
    private final Productionnull_1140 production = new Productionnull_1140("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}