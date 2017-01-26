package org.gradle.test.performancenull_240;

import static org.junit.Assert.*;

public class Testnull_23920 {
    private final Productionnull_23920 production = new Productionnull_23920("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}