package org.gradle.test.performancenull_20;

import static org.junit.Assert.*;

public class Testnull_1992 {
    private final Productionnull_1992 production = new Productionnull_1992("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}