package org.gradle.test.performancenull_361;

import static org.junit.Assert.*;

public class Testnull_36069 {
    private final Productionnull_36069 production = new Productionnull_36069("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}