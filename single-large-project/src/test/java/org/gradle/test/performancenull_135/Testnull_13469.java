package org.gradle.test.performancenull_135;

import static org.junit.Assert.*;

public class Testnull_13469 {
    private final Productionnull_13469 production = new Productionnull_13469("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}