package org.gradle.test.performancenull_471;

import static org.junit.Assert.*;

public class Testnull_47083 {
    private final Productionnull_47083 production = new Productionnull_47083("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}