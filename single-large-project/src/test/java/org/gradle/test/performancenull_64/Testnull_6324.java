package org.gradle.test.performancenull_64;

import static org.junit.Assert.*;

public class Testnull_6324 {
    private final Productionnull_6324 production = new Productionnull_6324("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}