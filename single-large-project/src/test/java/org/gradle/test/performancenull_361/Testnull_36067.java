package org.gradle.test.performancenull_361;

import static org.junit.Assert.*;

public class Testnull_36067 {
    private final Productionnull_36067 production = new Productionnull_36067("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}