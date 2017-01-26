package org.gradle.test.performancenull_301;

import static org.junit.Assert.*;

public class Testnull_30007 {
    private final Productionnull_30007 production = new Productionnull_30007("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}