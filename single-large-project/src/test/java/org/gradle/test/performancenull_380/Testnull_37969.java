package org.gradle.test.performancenull_380;

import static org.junit.Assert.*;

public class Testnull_37969 {
    private final Productionnull_37969 production = new Productionnull_37969("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}