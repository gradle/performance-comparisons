package org.gradle.test.performancenull_45;

import static org.junit.Assert.*;

public class Testnull_4491 {
    private final Productionnull_4491 production = new Productionnull_4491("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}