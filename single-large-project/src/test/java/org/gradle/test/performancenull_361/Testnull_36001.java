package org.gradle.test.performancenull_361;

import static org.junit.Assert.*;

public class Testnull_36001 {
    private final Productionnull_36001 production = new Productionnull_36001("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}