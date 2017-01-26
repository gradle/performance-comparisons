package org.gradle.test.performancenull_271;

import static org.junit.Assert.*;

public class Testnull_27092 {
    private final Productionnull_27092 production = new Productionnull_27092("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}