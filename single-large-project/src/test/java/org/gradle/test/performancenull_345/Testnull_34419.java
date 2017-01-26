package org.gradle.test.performancenull_345;

import static org.junit.Assert.*;

public class Testnull_34419 {
    private final Productionnull_34419 production = new Productionnull_34419("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}