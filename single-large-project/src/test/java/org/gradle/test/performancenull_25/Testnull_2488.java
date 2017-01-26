package org.gradle.test.performancenull_25;

import static org.junit.Assert.*;

public class Testnull_2488 {
    private final Productionnull_2488 production = new Productionnull_2488("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}