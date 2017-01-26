package org.gradle.test.performancenull_305;

import static org.junit.Assert.*;

public class Testnull_30454 {
    private final Productionnull_30454 production = new Productionnull_30454("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}