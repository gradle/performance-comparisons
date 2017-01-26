package org.gradle.test.performancenull_102;

import static org.junit.Assert.*;

public class Testnull_10170 {
    private final Productionnull_10170 production = new Productionnull_10170("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}