package org.gradle.test.performancenull_375;

import static org.junit.Assert.*;

public class Testnull_37401 {
    private final Productionnull_37401 production = new Productionnull_37401("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}