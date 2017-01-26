package org.gradle.test.performancenull_105;

import static org.junit.Assert.*;

public class Testnull_10435 {
    private final Productionnull_10435 production = new Productionnull_10435("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}