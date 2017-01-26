package org.gradle.test.performancenull_229;

import static org.junit.Assert.*;

public class Testnull_22843 {
    private final Productionnull_22843 production = new Productionnull_22843("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}