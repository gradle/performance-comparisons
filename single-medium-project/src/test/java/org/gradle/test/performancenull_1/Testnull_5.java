package org.gradle.test.performancenull_1;

import static org.junit.Assert.*;

public class Testnull_5 {
    private final Productionnull_5 production = new Productionnull_5("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}