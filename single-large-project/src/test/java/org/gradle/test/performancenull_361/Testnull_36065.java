package org.gradle.test.performancenull_361;

import static org.junit.Assert.*;

public class Testnull_36065 {
    private final Productionnull_36065 production = new Productionnull_36065("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}