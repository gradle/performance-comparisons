package org.gradle.test.performancenull_313;

import static org.junit.Assert.*;

public class Testnull_31248 {
    private final Productionnull_31248 production = new Productionnull_31248("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}