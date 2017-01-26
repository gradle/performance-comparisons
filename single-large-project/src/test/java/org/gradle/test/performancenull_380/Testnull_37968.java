package org.gradle.test.performancenull_380;

import static org.junit.Assert.*;

public class Testnull_37968 {
    private final Productionnull_37968 production = new Productionnull_37968("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}