package org.gradle.test.performancenull_225;

import static org.junit.Assert.*;

public class Testnull_22431 {
    private final Productionnull_22431 production = new Productionnull_22431("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}