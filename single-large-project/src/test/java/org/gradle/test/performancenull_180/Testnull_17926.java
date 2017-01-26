package org.gradle.test.performancenull_180;

import static org.junit.Assert.*;

public class Testnull_17926 {
    private final Productionnull_17926 production = new Productionnull_17926("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}