package org.gradle.test.performancenull_141;

import static org.junit.Assert.*;

public class Testnull_14052 {
    private final Productionnull_14052 production = new Productionnull_14052("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}