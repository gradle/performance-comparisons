package org.gradle.test.performancenull_315;

import static org.junit.Assert.*;

public class Testnull_31497 {
    private final Productionnull_31497 production = new Productionnull_31497("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}