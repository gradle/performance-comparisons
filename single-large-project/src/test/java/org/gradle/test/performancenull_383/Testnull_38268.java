package org.gradle.test.performancenull_383;

import static org.junit.Assert.*;

public class Testnull_38268 {
    private final Productionnull_38268 production = new Productionnull_38268("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}