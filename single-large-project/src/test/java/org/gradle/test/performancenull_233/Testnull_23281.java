package org.gradle.test.performancenull_233;

import static org.junit.Assert.*;

public class Testnull_23281 {
    private final Productionnull_23281 production = new Productionnull_23281("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}