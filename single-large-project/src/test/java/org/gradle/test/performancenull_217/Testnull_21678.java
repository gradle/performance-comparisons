package org.gradle.test.performancenull_217;

import static org.junit.Assert.*;

public class Testnull_21678 {
    private final Productionnull_21678 production = new Productionnull_21678("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}