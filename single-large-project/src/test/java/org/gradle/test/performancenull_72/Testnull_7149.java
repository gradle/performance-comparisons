package org.gradle.test.performancenull_72;

import static org.junit.Assert.*;

public class Testnull_7149 {
    private final Productionnull_7149 production = new Productionnull_7149("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}