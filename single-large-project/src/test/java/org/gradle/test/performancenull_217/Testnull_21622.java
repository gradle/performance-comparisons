package org.gradle.test.performancenull_217;

import static org.junit.Assert.*;

public class Testnull_21622 {
    private final Productionnull_21622 production = new Productionnull_21622("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}