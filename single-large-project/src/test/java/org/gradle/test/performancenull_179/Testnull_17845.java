package org.gradle.test.performancenull_179;

import static org.junit.Assert.*;

public class Testnull_17845 {
    private final Productionnull_17845 production = new Productionnull_17845("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}