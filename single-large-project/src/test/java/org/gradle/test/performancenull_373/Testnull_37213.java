package org.gradle.test.performancenull_373;

import static org.junit.Assert.*;

public class Testnull_37213 {
    private final Productionnull_37213 production = new Productionnull_37213("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}