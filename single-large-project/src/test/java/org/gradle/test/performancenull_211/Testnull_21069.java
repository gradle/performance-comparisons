package org.gradle.test.performancenull_211;

import static org.junit.Assert.*;

public class Testnull_21069 {
    private final Productionnull_21069 production = new Productionnull_21069("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}