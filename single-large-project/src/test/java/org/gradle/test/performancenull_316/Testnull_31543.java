package org.gradle.test.performancenull_316;

import static org.junit.Assert.*;

public class Testnull_31543 {
    private final Productionnull_31543 production = new Productionnull_31543("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}