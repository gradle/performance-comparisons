package org.gradle.test.performancenull_70;

import static org.junit.Assert.*;

public class Testnull_6941 {
    private final Productionnull_6941 production = new Productionnull_6941("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}