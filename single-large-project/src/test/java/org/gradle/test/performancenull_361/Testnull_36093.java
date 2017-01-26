package org.gradle.test.performancenull_361;

import static org.junit.Assert.*;

public class Testnull_36093 {
    private final Productionnull_36093 production = new Productionnull_36093("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}