package org.gradle.test.performancenull_35;

import static org.junit.Assert.*;

public class Testnull_3441 {
    private final Productionnull_3441 production = new Productionnull_3441("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}