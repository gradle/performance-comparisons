package org.gradle.test.performancenull_50;

import static org.junit.Assert.*;

public class Testnull_4923 {
    private final Productionnull_4923 production = new Productionnull_4923("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}