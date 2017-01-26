package org.gradle.test.performancenull_111;

import static org.junit.Assert.*;

public class Testnull_11086 {
    private final Productionnull_11086 production = new Productionnull_11086("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}