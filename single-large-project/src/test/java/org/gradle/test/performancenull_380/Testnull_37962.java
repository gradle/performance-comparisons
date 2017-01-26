package org.gradle.test.performancenull_380;

import static org.junit.Assert.*;

public class Testnull_37962 {
    private final Productionnull_37962 production = new Productionnull_37962("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}