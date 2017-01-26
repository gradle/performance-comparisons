package org.gradle.test.performancenull_403;

import static org.junit.Assert.*;

public class Testnull_40223 {
    private final Productionnull_40223 production = new Productionnull_40223("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}