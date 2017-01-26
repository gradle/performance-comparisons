package org.gradle.test.performancenull_200;

import static org.junit.Assert.*;

public class Testnull_19950 {
    private final Productionnull_19950 production = new Productionnull_19950("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}