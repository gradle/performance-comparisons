package org.gradle.test.performancenull_413;

import static org.junit.Assert.*;

public class Testnull_41207 {
    private final Productionnull_41207 production = new Productionnull_41207("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}