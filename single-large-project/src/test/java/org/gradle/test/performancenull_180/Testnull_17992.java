package org.gradle.test.performancenull_180;

import static org.junit.Assert.*;

public class Testnull_17992 {
    private final Productionnull_17992 production = new Productionnull_17992("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}