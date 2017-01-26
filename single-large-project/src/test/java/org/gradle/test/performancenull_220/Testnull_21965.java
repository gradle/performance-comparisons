package org.gradle.test.performancenull_220;

import static org.junit.Assert.*;

public class Testnull_21965 {
    private final Productionnull_21965 production = new Productionnull_21965("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}