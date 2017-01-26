package org.gradle.test.performancenull_361;

import static org.junit.Assert.*;

public class Testnull_36078 {
    private final Productionnull_36078 production = new Productionnull_36078("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}