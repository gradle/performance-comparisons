package org.gradle.test.performancenull_484;

import static org.junit.Assert.*;

public class Testnull_48382 {
    private final Productionnull_48382 production = new Productionnull_48382("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}