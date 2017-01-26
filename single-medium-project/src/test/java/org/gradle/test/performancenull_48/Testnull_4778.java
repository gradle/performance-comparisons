package org.gradle.test.performancenull_48;

import static org.junit.Assert.*;

public class Testnull_4778 {
    private final Productionnull_4778 production = new Productionnull_4778("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}