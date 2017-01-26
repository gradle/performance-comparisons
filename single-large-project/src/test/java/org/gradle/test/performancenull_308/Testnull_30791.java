package org.gradle.test.performancenull_308;

import static org.junit.Assert.*;

public class Testnull_30791 {
    private final Productionnull_30791 production = new Productionnull_30791("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}