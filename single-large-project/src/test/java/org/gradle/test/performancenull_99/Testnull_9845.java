package org.gradle.test.performancenull_99;

import static org.junit.Assert.*;

public class Testnull_9845 {
    private final Productionnull_9845 production = new Productionnull_9845("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}