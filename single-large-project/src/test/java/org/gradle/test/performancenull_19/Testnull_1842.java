package org.gradle.test.performancenull_19;

import static org.junit.Assert.*;

public class Testnull_1842 {
    private final Productionnull_1842 production = new Productionnull_1842("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}