package org.gradle.test.performancenull_380;

import static org.junit.Assert.*;

public class Testnull_37929 {
    private final Productionnull_37929 production = new Productionnull_37929("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}