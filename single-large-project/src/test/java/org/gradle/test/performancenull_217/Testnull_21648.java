package org.gradle.test.performancenull_217;

import static org.junit.Assert.*;

public class Testnull_21648 {
    private final Productionnull_21648 production = new Productionnull_21648("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}