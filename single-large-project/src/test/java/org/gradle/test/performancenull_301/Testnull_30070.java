package org.gradle.test.performancenull_301;

import static org.junit.Assert.*;

public class Testnull_30070 {
    private final Productionnull_30070 production = new Productionnull_30070("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}