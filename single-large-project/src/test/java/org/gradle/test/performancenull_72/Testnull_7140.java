package org.gradle.test.performancenull_72;

import static org.junit.Assert.*;

public class Testnull_7140 {
    private final Productionnull_7140 production = new Productionnull_7140("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}