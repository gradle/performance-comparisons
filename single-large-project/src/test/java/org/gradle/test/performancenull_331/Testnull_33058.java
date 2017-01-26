package org.gradle.test.performancenull_331;

import static org.junit.Assert.*;

public class Testnull_33058 {
    private final Productionnull_33058 production = new Productionnull_33058("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}