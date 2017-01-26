package org.gradle.test.performancenull_125;

import static org.junit.Assert.*;

public class Testnull_12488 {
    private final Productionnull_12488 production = new Productionnull_12488("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}