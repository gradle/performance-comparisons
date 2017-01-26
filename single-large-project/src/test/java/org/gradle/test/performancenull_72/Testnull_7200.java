package org.gradle.test.performancenull_72;

import static org.junit.Assert.*;

public class Testnull_7200 {
    private final Productionnull_7200 production = new Productionnull_7200("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}