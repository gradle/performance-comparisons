package org.gradle.test.performancenull_380;

import static org.junit.Assert.*;

public class Testnull_37902 {
    private final Productionnull_37902 production = new Productionnull_37902("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}