package org.gradle.test.performancenull_72;

import static org.junit.Assert.*;

public class Testnull_7162 {
    private final Productionnull_7162 production = new Productionnull_7162("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}