package org.gradle.test.performancenull_484;

import static org.junit.Assert.*;

public class Testnull_48343 {
    private final Productionnull_48343 production = new Productionnull_48343("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}