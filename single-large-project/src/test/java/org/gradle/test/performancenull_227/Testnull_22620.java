package org.gradle.test.performancenull_227;

import static org.junit.Assert.*;

public class Testnull_22620 {
    private final Productionnull_22620 production = new Productionnull_22620("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}