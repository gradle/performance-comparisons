package org.gradle.test.performancenull_34;

import static org.junit.Assert.*;

public class Testnull_3354 {
    private final Productionnull_3354 production = new Productionnull_3354("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}