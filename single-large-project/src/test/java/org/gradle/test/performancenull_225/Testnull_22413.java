package org.gradle.test.performancenull_225;

import static org.junit.Assert.*;

public class Testnull_22413 {
    private final Productionnull_22413 production = new Productionnull_22413("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}