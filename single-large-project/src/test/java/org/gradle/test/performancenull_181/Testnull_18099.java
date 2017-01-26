package org.gradle.test.performancenull_181;

import static org.junit.Assert.*;

public class Testnull_18099 {
    private final Productionnull_18099 production = new Productionnull_18099("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}