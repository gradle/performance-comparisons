package org.gradle.test.performancenull_380;

import static org.junit.Assert.*;

public class Testnull_37935 {
    private final Productionnull_37935 production = new Productionnull_37935("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}