package org.gradle.test.performancenull_380;

import static org.junit.Assert.*;

public class Testnull_37965 {
    private final Productionnull_37965 production = new Productionnull_37965("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}