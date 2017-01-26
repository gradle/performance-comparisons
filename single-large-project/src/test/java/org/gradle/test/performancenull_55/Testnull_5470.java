package org.gradle.test.performancenull_55;

import static org.junit.Assert.*;

public class Testnull_5470 {
    private final Productionnull_5470 production = new Productionnull_5470("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}