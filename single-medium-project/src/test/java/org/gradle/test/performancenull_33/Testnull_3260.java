package org.gradle.test.performancenull_33;

import static org.junit.Assert.*;

public class Testnull_3260 {
    private final Productionnull_3260 production = new Productionnull_3260("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}