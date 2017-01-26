package org.gradle.test.performancenull_53;

import static org.junit.Assert.*;

public class Testnull_5218 {
    private final Productionnull_5218 production = new Productionnull_5218("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}