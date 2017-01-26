package org.gradle.test.performancenull_217;

import static org.junit.Assert.*;

public class Testnull_21693 {
    private final Productionnull_21693 production = new Productionnull_21693("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}