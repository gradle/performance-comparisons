package org.gradle.test.performancenull_50;

import static org.junit.Assert.*;

public class Testnull_4993 {
    private final Productionnull_4993 production = new Productionnull_4993("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}