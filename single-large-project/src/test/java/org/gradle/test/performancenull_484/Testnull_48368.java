package org.gradle.test.performancenull_484;

import static org.junit.Assert.*;

public class Testnull_48368 {
    private final Productionnull_48368 production = new Productionnull_48368("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}