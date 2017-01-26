package org.gradle.test.performancenull_403;

import static org.junit.Assert.*;

public class Testnull_40296 {
    private final Productionnull_40296 production = new Productionnull_40296("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}