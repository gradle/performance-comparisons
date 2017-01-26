package org.gradle.test.performancenull_371;

import static org.junit.Assert.*;

public class Testnull_37065 {
    private final Productionnull_37065 production = new Productionnull_37065("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}