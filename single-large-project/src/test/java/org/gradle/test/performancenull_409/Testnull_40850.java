package org.gradle.test.performancenull_409;

import static org.junit.Assert.*;

public class Testnull_40850 {
    private final Productionnull_40850 production = new Productionnull_40850("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}