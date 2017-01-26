package org.gradle.test.performancenull_355;

import static org.junit.Assert.*;

public class Testnull_35472 {
    private final Productionnull_35472 production = new Productionnull_35472("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}