package org.gradle.test.performancenull_484;

import static org.junit.Assert.*;

public class Testnull_48321 {
    private final Productionnull_48321 production = new Productionnull_48321("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}