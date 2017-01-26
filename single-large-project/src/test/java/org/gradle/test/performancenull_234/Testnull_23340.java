package org.gradle.test.performancenull_234;

import static org.junit.Assert.*;

public class Testnull_23340 {
    private final Productionnull_23340 production = new Productionnull_23340("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}