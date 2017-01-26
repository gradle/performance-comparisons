package org.gradle.test.performancenull_3;

import static org.junit.Assert.*;

public class Testnull_220 {
    private final Productionnull_220 production = new Productionnull_220("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}