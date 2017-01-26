package org.gradle.test.performancenull_413;

import static org.junit.Assert.*;

public class Testnull_41283 {
    private final Productionnull_41283 production = new Productionnull_41283("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}