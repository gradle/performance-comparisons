package org.gradle.test.performancenull_180;

import static org.junit.Assert.*;

public class Testnull_17971 {
    private final Productionnull_17971 production = new Productionnull_17971("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}