package org.gradle.test.performancenull_59;

import static org.junit.Assert.*;

public class Testnull_5804 {
    private final Productionnull_5804 production = new Productionnull_5804("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}