package org.gradle.test.performancenull_399;

import static org.junit.Assert.*;

public class Testnull_39843 {
    private final Productionnull_39843 production = new Productionnull_39843("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}