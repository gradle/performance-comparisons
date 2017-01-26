package org.gradle.test.performancenull_400;

import static org.junit.Assert.*;

public class Testnull_39903 {
    private final Productionnull_39903 production = new Productionnull_39903("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}