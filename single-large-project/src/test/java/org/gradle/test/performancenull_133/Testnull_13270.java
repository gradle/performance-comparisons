package org.gradle.test.performancenull_133;

import static org.junit.Assert.*;

public class Testnull_13270 {
    private final Productionnull_13270 production = new Productionnull_13270("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}