package org.gradle.test.performancenull_380;

import static org.junit.Assert.*;

public class Testnull_37908 {
    private final Productionnull_37908 production = new Productionnull_37908("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}