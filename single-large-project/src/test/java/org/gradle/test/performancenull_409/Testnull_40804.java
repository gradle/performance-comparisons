package org.gradle.test.performancenull_409;

import static org.junit.Assert.*;

public class Testnull_40804 {
    private final Productionnull_40804 production = new Productionnull_40804("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}