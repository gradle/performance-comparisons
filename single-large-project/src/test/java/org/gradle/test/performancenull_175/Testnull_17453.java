package org.gradle.test.performancenull_175;

import static org.junit.Assert.*;

public class Testnull_17453 {
    private final Productionnull_17453 production = new Productionnull_17453("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}