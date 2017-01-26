package org.gradle.test.performancenull_343;

import static org.junit.Assert.*;

public class Testnull_34289 {
    private final Productionnull_34289 production = new Productionnull_34289("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}