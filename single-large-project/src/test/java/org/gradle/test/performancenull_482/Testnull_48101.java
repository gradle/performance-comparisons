package org.gradle.test.performancenull_482;

import static org.junit.Assert.*;

public class Testnull_48101 {
    private final Productionnull_48101 production = new Productionnull_48101("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}