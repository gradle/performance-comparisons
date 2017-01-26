package org.gradle.test.performancenull_411;

import static org.junit.Assert.*;

public class Testnull_41071 {
    private final Productionnull_41071 production = new Productionnull_41071("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}