package org.gradle.test.performancenull_361;

import static org.junit.Assert.*;

public class Testnull_36043 {
    private final Productionnull_36043 production = new Productionnull_36043("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}