package org.gradle.test.performancenull_17;

import static org.junit.Assert.*;

public class Testnull_1679 {
    private final Productionnull_1679 production = new Productionnull_1679("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}