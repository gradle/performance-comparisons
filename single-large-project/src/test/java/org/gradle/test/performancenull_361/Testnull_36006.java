package org.gradle.test.performancenull_361;

import static org.junit.Assert.*;

public class Testnull_36006 {
    private final Productionnull_36006 production = new Productionnull_36006("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}