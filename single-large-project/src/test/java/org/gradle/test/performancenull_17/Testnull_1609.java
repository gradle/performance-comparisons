package org.gradle.test.performancenull_17;

import static org.junit.Assert.*;

public class Testnull_1609 {
    private final Productionnull_1609 production = new Productionnull_1609("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}