package org.gradle.test.performancenull_205;

import static org.junit.Assert.*;

public class Testnull_20487 {
    private final Productionnull_20487 production = new Productionnull_20487("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}