package org.gradle.test.performancenull_99;

import static org.junit.Assert.*;

public class Testnull_9861 {
    private final Productionnull_9861 production = new Productionnull_9861("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}