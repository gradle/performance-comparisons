package org.gradle.test.performancenull_124;

import static org.junit.Assert.*;

public class Testnull_12368 {
    private final Productionnull_12368 production = new Productionnull_12368("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}