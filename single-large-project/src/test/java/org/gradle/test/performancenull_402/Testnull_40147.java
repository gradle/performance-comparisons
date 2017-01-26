package org.gradle.test.performancenull_402;

import static org.junit.Assert.*;

public class Testnull_40147 {
    private final Productionnull_40147 production = new Productionnull_40147("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}