package org.gradle.test.performancenull_209;

import static org.junit.Assert.*;

public class Testnull_20885 {
    private final Productionnull_20885 production = new Productionnull_20885("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}