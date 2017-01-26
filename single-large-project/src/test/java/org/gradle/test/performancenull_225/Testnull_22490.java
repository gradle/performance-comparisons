package org.gradle.test.performancenull_225;

import static org.junit.Assert.*;

public class Testnull_22490 {
    private final Productionnull_22490 production = new Productionnull_22490("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}