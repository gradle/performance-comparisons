package org.gradle.test.performancenull_371;

import static org.junit.Assert.*;

public class Testnull_37009 {
    private final Productionnull_37009 production = new Productionnull_37009("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}