package org.gradle.test.performancenull_373;

import static org.junit.Assert.*;

public class Testnull_37202 {
    private final Productionnull_37202 production = new Productionnull_37202("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}