package org.gradle.test.performancenull_424;

import static org.junit.Assert.*;

public class Testnull_42348 {
    private final Productionnull_42348 production = new Productionnull_42348("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}