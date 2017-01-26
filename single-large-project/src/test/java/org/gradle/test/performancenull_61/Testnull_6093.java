package org.gradle.test.performancenull_61;

import static org.junit.Assert.*;

public class Testnull_6093 {
    private final Productionnull_6093 production = new Productionnull_6093("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}