package org.gradle.test.performancenull_18;

import static org.junit.Assert.*;

public class Testnull_1709 {
    private final Productionnull_1709 production = new Productionnull_1709("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}