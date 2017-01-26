package org.gradle.test.performancenull_141;

import static org.junit.Assert.*;

public class Testnull_14083 {
    private final Productionnull_14083 production = new Productionnull_14083("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}