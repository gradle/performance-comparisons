package org.gradle.test.performancenull_57;

import static org.junit.Assert.*;

public class Testnull_5681 {
    private final Productionnull_5681 production = new Productionnull_5681("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}