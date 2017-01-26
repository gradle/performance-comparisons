package org.gradle.test.performancenull_316;

import static org.junit.Assert.*;

public class Testnull_31582 {
    private final Productionnull_31582 production = new Productionnull_31582("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}