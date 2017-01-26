package org.gradle.test.performancenull_350;

import static org.junit.Assert.*;

public class Testnull_34992 {
    private final Productionnull_34992 production = new Productionnull_34992("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}