package org.gradle.test.performancenull_25;

import static org.junit.Assert.*;

public class Testnull_2426 {
    private final Productionnull_2426 production = new Productionnull_2426("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}