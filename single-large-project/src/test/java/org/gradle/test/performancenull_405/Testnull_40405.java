package org.gradle.test.performancenull_405;

import static org.junit.Assert.*;

public class Testnull_40405 {
    private final Productionnull_40405 production = new Productionnull_40405("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}