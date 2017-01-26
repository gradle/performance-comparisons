package org.gradle.test.performancenull_380;

import static org.junit.Assert.*;

public class Testnull_37952 {
    private final Productionnull_37952 production = new Productionnull_37952("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}