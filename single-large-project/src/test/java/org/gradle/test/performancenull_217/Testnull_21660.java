package org.gradle.test.performancenull_217;

import static org.junit.Assert.*;

public class Testnull_21660 {
    private final Productionnull_21660 production = new Productionnull_21660("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}