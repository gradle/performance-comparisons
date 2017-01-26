package org.gradle.test.performancenull_259;

import static org.junit.Assert.*;

public class Testnull_25829 {
    private final Productionnull_25829 production = new Productionnull_25829("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}