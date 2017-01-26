package org.gradle.test.performancenull_281;

import static org.junit.Assert.*;

public class Testnull_28032 {
    private final Productionnull_28032 production = new Productionnull_28032("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}