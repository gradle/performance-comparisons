package org.gradle.test.performancenull_343;

import static org.junit.Assert.*;

public class Testnull_34213 {
    private final Productionnull_34213 production = new Productionnull_34213("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}