package org.gradle.test.performancenull_413;

import static org.junit.Assert.*;

public class Testnull_41266 {
    private final Productionnull_41266 production = new Productionnull_41266("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}