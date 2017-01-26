package org.gradle.test.performancenull_362;

import static org.junit.Assert.*;

public class Testnull_36121 {
    private final Productionnull_36121 production = new Productionnull_36121("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}