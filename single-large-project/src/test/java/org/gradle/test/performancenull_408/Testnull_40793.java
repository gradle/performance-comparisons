package org.gradle.test.performancenull_408;

import static org.junit.Assert.*;

public class Testnull_40793 {
    private final Productionnull_40793 production = new Productionnull_40793("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}