package org.gradle.test.performancenull_120;

import static org.junit.Assert.*;

public class Testnull_11951 {
    private final Productionnull_11951 production = new Productionnull_11951("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}