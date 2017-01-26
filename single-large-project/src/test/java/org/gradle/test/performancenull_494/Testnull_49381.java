package org.gradle.test.performancenull_494;

import static org.junit.Assert.*;

public class Testnull_49381 {
    private final Productionnull_49381 production = new Productionnull_49381("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}