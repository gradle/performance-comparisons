package org.gradle.test.performancenull_400;

import static org.junit.Assert.*;

public class Testnull_39993 {
    private final Productionnull_39993 production = new Productionnull_39993("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}