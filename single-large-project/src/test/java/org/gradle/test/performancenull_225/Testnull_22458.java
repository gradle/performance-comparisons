package org.gradle.test.performancenull_225;

import static org.junit.Assert.*;

public class Testnull_22458 {
    private final Productionnull_22458 production = new Productionnull_22458("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}