package org.gradle.test.performancenull_405;

import static org.junit.Assert.*;

public class Testnull_40481 {
    private final Productionnull_40481 production = new Productionnull_40481("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}