package org.gradle.test.performancenull_52;

import static org.junit.Assert.*;

public class Testnull_5101 {
    private final Productionnull_5101 production = new Productionnull_5101("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}