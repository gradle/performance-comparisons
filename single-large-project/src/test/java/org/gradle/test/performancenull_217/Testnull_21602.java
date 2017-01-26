package org.gradle.test.performancenull_217;

import static org.junit.Assert.*;

public class Testnull_21602 {
    private final Productionnull_21602 production = new Productionnull_21602("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}