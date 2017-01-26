package org.gradle.test.performancenull_313;

import static org.junit.Assert.*;

public class Testnull_31268 {
    private final Productionnull_31268 production = new Productionnull_31268("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}