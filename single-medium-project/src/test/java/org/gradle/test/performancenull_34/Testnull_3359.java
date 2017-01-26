package org.gradle.test.performancenull_34;

import static org.junit.Assert.*;

public class Testnull_3359 {
    private final Productionnull_3359 production = new Productionnull_3359("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}