package org.gradle.test.performancenull_343;

import static org.junit.Assert.*;

public class Testnull_34271 {
    private final Productionnull_34271 production = new Productionnull_34271("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}