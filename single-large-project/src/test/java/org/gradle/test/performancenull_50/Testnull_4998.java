package org.gradle.test.performancenull_50;

import static org.junit.Assert.*;

public class Testnull_4998 {
    private final Productionnull_4998 production = new Productionnull_4998("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}