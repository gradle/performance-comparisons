package org.gradle.test.performancenull_31;

import static org.junit.Assert.*;

public class Testnull_3052 {
    private final Productionnull_3052 production = new Productionnull_3052("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}