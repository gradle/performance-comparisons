package org.gradle.test.performancenull_255;

import static org.junit.Assert.*;

public class Testnull_25461 {
    private final Productionnull_25461 production = new Productionnull_25461("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}