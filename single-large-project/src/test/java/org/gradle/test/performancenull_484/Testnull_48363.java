package org.gradle.test.performancenull_484;

import static org.junit.Assert.*;

public class Testnull_48363 {
    private final Productionnull_48363 production = new Productionnull_48363("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}