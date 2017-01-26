package org.gradle.test.performancenull_209;

import static org.junit.Assert.*;

public class Testnull_20805 {
    private final Productionnull_20805 production = new Productionnull_20805("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}