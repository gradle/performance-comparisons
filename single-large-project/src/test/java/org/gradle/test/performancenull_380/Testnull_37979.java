package org.gradle.test.performancenull_380;

import static org.junit.Assert.*;

public class Testnull_37979 {
    private final Productionnull_37979 production = new Productionnull_37979("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}