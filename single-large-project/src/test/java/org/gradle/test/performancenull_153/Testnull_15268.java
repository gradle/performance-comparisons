package org.gradle.test.performancenull_153;

import static org.junit.Assert.*;

public class Testnull_15268 {
    private final Productionnull_15268 production = new Productionnull_15268("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}