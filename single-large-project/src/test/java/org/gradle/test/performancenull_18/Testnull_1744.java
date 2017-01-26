package org.gradle.test.performancenull_18;

import static org.junit.Assert.*;

public class Testnull_1744 {
    private final Productionnull_1744 production = new Productionnull_1744("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}