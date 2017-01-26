package org.gradle.test.performancenull_345;

import static org.junit.Assert.*;

public class Testnull_34483 {
    private final Productionnull_34483 production = new Productionnull_34483("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}