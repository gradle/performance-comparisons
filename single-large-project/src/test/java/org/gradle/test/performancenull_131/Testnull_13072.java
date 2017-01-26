package org.gradle.test.performancenull_131;

import static org.junit.Assert.*;

public class Testnull_13072 {
    private final Productionnull_13072 production = new Productionnull_13072("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}