package org.gradle.test.performancenull_11;

import static org.junit.Assert.*;

public class Testnull_1100 {
    private final Productionnull_1100 production = new Productionnull_1100("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}