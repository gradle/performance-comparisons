package org.gradle.test.performancenull_365;

import static org.junit.Assert.*;

public class Testnull_36472 {
    private final Productionnull_36472 production = new Productionnull_36472("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}