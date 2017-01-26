package org.gradle.test.performancenull_1;

import static org.junit.Assert.*;

public class Testnull_14 {
    private final Productionnull_14 production = new Productionnull_14("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}