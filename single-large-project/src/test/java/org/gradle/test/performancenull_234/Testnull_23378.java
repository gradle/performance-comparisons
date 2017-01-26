package org.gradle.test.performancenull_234;

import static org.junit.Assert.*;

public class Testnull_23378 {
    private final Productionnull_23378 production = new Productionnull_23378("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}