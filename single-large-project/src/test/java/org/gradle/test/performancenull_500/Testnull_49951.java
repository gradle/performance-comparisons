package org.gradle.test.performancenull_500;

import static org.junit.Assert.*;

public class Testnull_49951 {
    private final Productionnull_49951 production = new Productionnull_49951("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}