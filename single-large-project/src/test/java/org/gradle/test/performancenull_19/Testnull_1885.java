package org.gradle.test.performancenull_19;

import static org.junit.Assert.*;

public class Testnull_1885 {
    private final Productionnull_1885 production = new Productionnull_1885("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}