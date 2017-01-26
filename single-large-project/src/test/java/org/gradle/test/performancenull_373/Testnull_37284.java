package org.gradle.test.performancenull_373;

import static org.junit.Assert.*;

public class Testnull_37284 {
    private final Productionnull_37284 production = new Productionnull_37284("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}