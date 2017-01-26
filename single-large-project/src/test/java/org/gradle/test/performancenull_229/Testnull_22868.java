package org.gradle.test.performancenull_229;

import static org.junit.Assert.*;

public class Testnull_22868 {
    private final Productionnull_22868 production = new Productionnull_22868("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}