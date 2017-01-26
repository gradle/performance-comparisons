package org.gradle.test.performancenull_50;

import static org.junit.Assert.*;

public class Testnull_4992 {
    private final Productionnull_4992 production = new Productionnull_4992("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}