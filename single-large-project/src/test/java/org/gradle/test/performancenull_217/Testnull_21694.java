package org.gradle.test.performancenull_217;

import static org.junit.Assert.*;

public class Testnull_21694 {
    private final Productionnull_21694 production = new Productionnull_21694("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}