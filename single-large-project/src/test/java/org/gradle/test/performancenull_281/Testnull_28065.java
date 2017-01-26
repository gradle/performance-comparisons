package org.gradle.test.performancenull_281;

import static org.junit.Assert.*;

public class Testnull_28065 {
    private final Productionnull_28065 production = new Productionnull_28065("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}