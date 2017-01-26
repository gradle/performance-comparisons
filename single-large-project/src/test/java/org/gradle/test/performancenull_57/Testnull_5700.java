package org.gradle.test.performancenull_57;

import static org.junit.Assert.*;

public class Testnull_5700 {
    private final Productionnull_5700 production = new Productionnull_5700("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}