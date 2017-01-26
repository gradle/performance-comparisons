package org.gradle.test.performancenull_380;

import static org.junit.Assert.*;

public class Testnull_37942 {
    private final Productionnull_37942 production = new Productionnull_37942("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}