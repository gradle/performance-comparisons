package org.gradle.test.performancenull_41;

import static org.junit.Assert.*;

public class Testnull_4083 {
    private final Productionnull_4083 production = new Productionnull_4083("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}