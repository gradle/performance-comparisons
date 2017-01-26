package org.gradle.test.performancenull_55;

import static org.junit.Assert.*;

public class Testnull_5401 {
    private final Productionnull_5401 production = new Productionnull_5401("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}